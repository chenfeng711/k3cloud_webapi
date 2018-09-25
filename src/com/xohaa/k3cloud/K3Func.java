package com.xohaa.k3cloud;
import lotus.domino.Document;
import lotus.domino.NotesException;

import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import com.xohaa.SQLDB.HandleSQLCon;
import com.xohaa.k3cloud.webapi.Audit;
import com.xohaa.k3cloud.webapi.Submit;
import com.xohaa.k3cloud.webapi.UnAudit;
/**
 * 金蝶接口执行类库
 * @author chenjianxiong
 *
 */
public class K3Func {
	private static String sessionkey = "kdservice-sessionid";
	private static String aspnetsessionkey = "ASP.NET_SessionId";
	private String sessionValue = "";
	private String aspnetsessionValue = "";
	private String acctID = null;
	private String hostname = null;
	private String username = null;
	private String password = null;
	private HttpClient httpclient = null;
	private HandleSQLCon F = null;
	private WebApiLog log = null;
	private String returnstr = null;
	private String errmsg = null;
	private JSONObject returnjson  = null;
	private boolean IsSuccess = false;
	public final static int FLAG_SUCCESS = 1;
	public final static int FLAG_FAIL = 0;
	
	public String getReturnstr() {
		return returnstr;
	}

	public String getErrmsg() {
		return errmsg;
	}

	/**
	 * 获取返回JSON
	 * @return JSONObject
	 */
	public JSONObject getReturnJSONObject (){
		return returnjson;
	}

	/**
	 * 获取编号
	 * @return String
	 */
	public String getResultFNumber(){
		if(this.IsSuccess == false){
			return null;
		}
		
		JSONObject re = this.getReturnJSONObject();
		return re.getJSONObject("Result").getString("Number");
	}
	
	/**
	 * 获取ID
	 * @return
	 */
	public long getResultID(){
		if(this.IsSuccess == false){
			return 0;
		}
		
		JSONObject re = this.getReturnJSONObject();
		return re.getJSONObject("Result").getLong("Id");
	}
	/**
	 * 
	 * @param F
	 * @param isinitParam
	 * @throws Exception
	 */
	public K3Func(HandleSQLCon F,boolean isinitParam) throws Exception{
		this.F = F;
		httpclient = HttpClientBuilder.create().build(); // 定义httpClient的实例
		log = new WebApiLog(F);
		if(isinitParam){
			String key = F.getDirkey("KingDeeKey");
			if(!"".equals(key)){
				initConfig(key);
			}else{
				throw new Exception("系统数据字典没有找到[KingDeeKey]");
			}
		}
		log.setCaoZuoR(F.getEffectiveUserName());
	}
	
	/**
	 * REQUESTNUMBER
	 * @param doc
	 * @throws NotesException
	 */
	public void setFlowDocument(Document doc) throws NotesException{
		this.log.setFlowNo(doc.getItemValueString("REQUESTNUMBER"));
		this.log.setMainUNID(doc.getUniversalID());
		this.log.setDBName(doc.getParentDatabase().getFileName());
	}

	/**
	 * 
	 */
	public void recycle(){
		if(httpclient != null) httpclient = null;
	}

	/**
	 * 
	 * @param F
	 * @param skey
	 * @throws Exception
	 */
	private void initConfig(String skey) throws Exception{
		Document doc = F.getDocumentBykey("Sys_KingdeeWebApi.nsf","vw_fmKingdee_isUse",skey,true);
		if(doc == null){
			throw new Exception("找不到金蝶连接配置");
		}
		initParam(doc);
		if(doc != null) doc.recycle();
	}

	/**
	 * 
	 * @param doc
	 * @throws Exception
	 */
	public void initParam(Document doc) throws Exception{
		if(doc != null){
			this.acctID = doc.getItemValueString("ZhangTaoID");
			this.hostname = doc.getItemValueString("YuMing");
			this.username = doc.getItemValueString("ZhangHao");
			this.password = doc.getItemValueString("MiMa");
			this.Login(doc);
		}else{
			throw new Exception("配置为空！");
		}
	}

	/**
	 * 测试是否连接上金蝶。
	 */
	public boolean testWebApi(){
		if(!"".equals(aspnetsessionValue)){
			return true;
		}else{
			return false;
		}
	}
	/**
	 * 获取接口地址。
	 * @param url
	 * @return
	 */
	private String getWebApiURL(String url){
		return this.hostname + url;
	}
	/**
	 * 登录
	 * @throws Exception
	 */
	private boolean Login(Document doc) throws Exception {
		JSONObject jsonResult = null;
		boolean isLogin = false;
		String url = this.getWebApiURL(WebApi.ValidateUser_URL);
		log.setURL(url);
		log.setLeiXing(WebApi.ValidateUser_TITLE);
		//long s1 = System.currentTimeMillis();

		HttpPost method = new HttpPost(url);
		JSONObject json = new JSONObject();
		json.put("acctID", this.acctID);
		json.put("username", this.username);
		json.put("password", this.password);
		json.put("lcid", "2052");

		StringEntity entity = new StringEntity(json.toString(), "utf-8");
		entity.setContentEncoding("UTF-8");
		entity.setContentType("application/json");
		method.setEntity(entity);
		HttpResponse result = httpclient.execute(method);
		if (result.getStatusLine().getStatusCode() == 200){// 请求发送成功，并得到响应
			String str = EntityUtils.toString(result.getEntity());// 读取服务器返回过来的json字符串数据
			jsonResult = new JSONObject(str);
			if (jsonResult.getInt("LoginResultType") == 1) {//判断登录是否成功
				isLogin = true;
				System.out.println("登录成功！");
				Header[] headers = result.getHeaders("Set-Cookie");// 获取Cookie
				for (int i = 1; i < headers.length; i++) {
					Header header = headers[i];
					String headerValue = header.getValue();
					if (headerValue.trim().startsWith(sessionkey)) {
						int endIndex = headerValue.indexOf(';');
						sessionValue = headerValue.substring(20, endIndex);
					} else if (headerValue.trim().startsWith(aspnetsessionkey)){
						int endIndex = headerValue.indexOf(';');
						aspnetsessionValue = headerValue.substring(18,endIndex);
					}
				}
			}else {// 登录失败
				String msg = "登录失败," + jsonResult.getString("Message");
				log.setMsg(msg);
				log.setStatus(result.getStatusLine().getStatusCode());
				log.update();
				throw new Exception(msg);
			}
			
			//System.out.println("--->登录："+ ((System.currentTimeMillis() - s1)));
		}else{
			String msg = "登录异常:" + result.getStatusLine().getStatusCode();
			log.setMsg(msg);
			log.setStatus(result.getStatusLine().getStatusCode());
			log.update();
			throw new Exception(msg);
		}

		return isLogin;
	}
	/**
	 * 
	 * @param webapi
	 * @return int 0 执行接口成功，1执行接口失败。
	 * @throws Exception
	 */
	private int execute(String url,K3Funcable webapi) throws Exception{
		//把成功登录的Session信息传进去，获取连接信息
		IsSuccess = false;
		int flag = K3Func.FLAG_FAIL;
		if(aspnetsessionValue.equals("")){
			throw new Exception("登录异常，无法执行接口："+ webapi.getClass().getName());
		}
		try {
			long s1 = System.currentTimeMillis();
			returnstr = null;
			returnjson = null;
			String send = webapi.sendContentStr();
			if(send == null){
				JSONObject content = webapi.sendContent();
				send = content.toString();
			}
			this.log.setInput(send);
			this.log.setSession(this.aspnetsessionValue);
			this.log.setURL(url);
			this.log.setFormID(webapi.getFormID());

			HttpPost method = new HttpPost(url);
			StringEntity entity = new StringEntity(send, "utf-8");
			entity.setContentEncoding("UTF-8");
			entity.setContentType("application/json");
			method.setHeader(sessionkey, sessionValue);
			method.setHeader(aspnetsessionkey, aspnetsessionValue);
			method.setEntity(entity);//方法参数
			HttpResponse result = httpclient.execute(method);
			int status = result.getStatusLine().getStatusCode();
			this.log.setStatus(status);
			if (status == 200) {// 请求发送成功，并得到响应
				this.returnstr = EntityUtils.toString(result.getEntity()); // 读取服务器返回过来的json字符串数据
				this.log.setMsg("请求成功");
				this.log.setOutput(this.returnstr);
				returnjson = new JSONObject(this.returnstr);
				JSONObject re = returnjson.getJSONObject("Result");				
				JSONObject ResponseStatus = re.getJSONObject("ResponseStatus");
				if(ResponseStatus.getBoolean("IsSuccess")){
					this.log.setJieKouZT(K3Func.FLAG_SUCCESS);
					//System.out.println("--->写入金蝶成功");
					IsSuccess = true;
					flag = K3Func.FLAG_SUCCESS; //成功
				}else{
					this.log.setJieKouZT(K3Func.FLAG_FAIL);
					//System.out.println("--->写入金蝶失败");
					IsSuccess = false;
					errmsg = ResponseStatus.get("Errors").toString();
					flag = K3Func.FLAG_FAIL;//失败
				}
				System.out.println("--->写入："+ ((System.currentTimeMillis() - s1)));
			}
		} catch (Exception e) {
			this.log.setMsg(e.toString());
			throw e;
		}finally{
			this.log.update();
		}
		return flag;
	}

	/**
	 * 保存
	 * @param webapi
	 * @return
	 * @throws Exception
	 */
	public int executeSave(K3Funcable webapi) throws Exception{
		System.out.println("--->执行保存接口：" + webapi.getFormID());
		String url = this.getWebApiURL(WebApi.Save_URL);
		this.log.setLeiXing(WebApi.Save_TITLE);
		return this.execute(url, webapi);
	}
	
	/**
	 * 下推
	 * @param webapi
	 * @return
	 * @throws Exception
	 */
	public int executePush(K3Funcable webapi) throws Exception{
		System.out.println("--->执行下推接口：" + webapi.getFormID());
		String url = this.getWebApiURL(WebApi.Push_URL);
		this.log.setLeiXing(WebApi.Push_TITLE);
		return this.execute(url, webapi);
	}

	/**
	 * 查看单据
	 * @param webapi
	 * @return
	 * @throws Exception
	 */
	public int executeView(K3Funcable webapi) throws Exception{
		System.out.println("--->执行查看接口：" + webapi.getFormID());
		String url = this.getWebApiURL(WebApi.View_URL);
		this.log.setLeiXing(WebApi.View_TITLE);
		return this.execute(url, webapi);
	}

	/**
	 * 查看数据
	 * @param webapi
	 * @return
	 * @throws Exception
	 */
	public int executeExecuteBillQuery(K3Funcable webapi) throws Exception{
		String url = this.getWebApiURL(WebApi.ExecuteBillQuery_URL);
		this.log.setLeiXing(WebApi.ExecuteBillQuery_TITLE);
		return this.execute(url, webapi);
	}

	/**
	 * 审批
	 * @param webapi
	 * @return
	 * @throws Exception
	 */
	public int executeAudit(K3Funcable webapi) throws Exception{
		System.out.println("--->执行审批接口：" + webapi.getFormID());
		String url = this.getWebApiURL(WebApi.Audit_URL);
		this.log.setLeiXing(WebApi.Audit_TITLE);
		return this.execute(url, webapi);
	}
	/**
	 * 审批
	 * @param formid
	 * @param fnumber
	 * @return
	 * @throws Exception
	 */
	public int executeAudit(String formid,String fnumber) throws Exception{
		Audit audit = new Audit(formid);
		audit.setNumbers(fnumber);
		return this.executeAudit(audit);
	}

	/**
	 * 反审
	 * @param webapi
	 * @return
	 * @throws Exception
	 */
	public int executeUnAudit(K3Funcable webapi) throws Exception{
		System.out.println("--->执行反审接口：" + webapi.getFormID());
		String url = this.getWebApiURL(WebApi.UnAudit_URL);
		this.log.setLeiXing(WebApi.UnAudit_TITLE);
		return this.execute(url, webapi);
	}
	
	/**
	 *  反审
	 * @param webapi
	 * @return
	 * @throws Exception
	 */
	public int executeUnAudit(String formid,String fnumber) throws Exception{
		UnAudit un = new UnAudit(formid);
		un.setNumbers(fnumber);
		return this.executeUnAudit(un);
	}
	/**
	 * 删除
	 * @param webapi
	 * @return
	 * @throws Exception
	 */
	public int executeDelete(K3Funcable webapi) throws Exception{
		System.out.println("--->执行删除接口：" + webapi.getFormID());
		String url = this.getWebApiURL(WebApi.Delete_URL);
		this.log.setLeiXing(WebApi.Delete_TITLE);
		return this.execute(url, webapi);
	}

	/**
	 * 提交
	 * @param webapi
	 * @return
	 * @throws Exception
	 */
	public int executeSubmit(K3Funcable webapi) throws Exception{
		System.out.println("--->执行提交接口：" + webapi.getFormID());
		String url = this.getWebApiURL(WebApi.Submit_URL);
		this.log.setLeiXing(WebApi.Submit_TITLE);
		return this.execute(url, webapi);
	}
	/**
	 * 提交
	 * @param formid
	 * @param fnumber
	 * @return
	 * @throws Exception
	 */
	public int executeSubmit(String formid,String fnumber) throws Exception{
		Submit submit = new Submit(formid);
		submit.setNumbers(fnumber);
		return this.executeSubmit(submit);
	}
	
	/**
	 * 保存，提交，审批一体处理
	 * @param webapi
	 * @throws Exception
	 */
	public int executeSaveSubmitAudit(K3Funcable webapi) throws Exception{
		int flag = this.executeSave(webapi);
		if(flag == K3Func.FLAG_SUCCESS){
			String fnumber = this.getResultFNumber();
			String formid = webapi.getFormID();
			int i = this.executeSubmit(formid,fnumber);
			if(i == K3Func.FLAG_SUCCESS){
				int a = this.executeAudit(formid,fnumber);
				if(a == K3Func.FLAG_SUCCESS){
					flag = K3Func.FLAG_SUCCESS;
				}else{
					System.out.println("执行审批接口失败");					
				}
			}else{
				System.out.println("执行提交接口失败");
			}
		}else{
			System.out.println("执行保存接口失败");
		}
		return flag;
	}
}