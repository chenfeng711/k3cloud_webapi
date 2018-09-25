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
 * ����ӿ�ִ�����
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
	 * ��ȡ����JSON
	 * @return JSONObject
	 */
	public JSONObject getReturnJSONObject (){
		return returnjson;
	}

	/**
	 * ��ȡ���
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
	 * ��ȡID
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
		httpclient = HttpClientBuilder.create().build(); // ����httpClient��ʵ��
		log = new WebApiLog(F);
		if(isinitParam){
			String key = F.getDirkey("KingDeeKey");
			if(!"".equals(key)){
				initConfig(key);
			}else{
				throw new Exception("ϵͳ�����ֵ�û���ҵ�[KingDeeKey]");
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
			throw new Exception("�Ҳ��������������");
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
			throw new Exception("����Ϊ�գ�");
		}
	}

	/**
	 * �����Ƿ������Ͻ����
	 */
	public boolean testWebApi(){
		if(!"".equals(aspnetsessionValue)){
			return true;
		}else{
			return false;
		}
	}
	/**
	 * ��ȡ�ӿڵ�ַ��
	 * @param url
	 * @return
	 */
	private String getWebApiURL(String url){
		return this.hostname + url;
	}
	/**
	 * ��¼
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
		if (result.getStatusLine().getStatusCode() == 200){// �����ͳɹ������õ���Ӧ
			String str = EntityUtils.toString(result.getEntity());// ��ȡ���������ع�����json�ַ�������
			jsonResult = new JSONObject(str);
			if (jsonResult.getInt("LoginResultType") == 1) {//�жϵ�¼�Ƿ�ɹ�
				isLogin = true;
				System.out.println("��¼�ɹ���");
				Header[] headers = result.getHeaders("Set-Cookie");// ��ȡCookie
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
			}else {// ��¼ʧ��
				String msg = "��¼ʧ��," + jsonResult.getString("Message");
				log.setMsg(msg);
				log.setStatus(result.getStatusLine().getStatusCode());
				log.update();
				throw new Exception(msg);
			}
			
			//System.out.println("--->��¼��"+ ((System.currentTimeMillis() - s1)));
		}else{
			String msg = "��¼�쳣:" + result.getStatusLine().getStatusCode();
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
	 * @return int 0 ִ�нӿڳɹ���1ִ�нӿ�ʧ�ܡ�
	 * @throws Exception
	 */
	private int execute(String url,K3Funcable webapi) throws Exception{
		//�ѳɹ���¼��Session��Ϣ����ȥ����ȡ������Ϣ
		IsSuccess = false;
		int flag = K3Func.FLAG_FAIL;
		if(aspnetsessionValue.equals("")){
			throw new Exception("��¼�쳣���޷�ִ�нӿڣ�"+ webapi.getClass().getName());
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
			method.setEntity(entity);//��������
			HttpResponse result = httpclient.execute(method);
			int status = result.getStatusLine().getStatusCode();
			this.log.setStatus(status);
			if (status == 200) {// �����ͳɹ������õ���Ӧ
				this.returnstr = EntityUtils.toString(result.getEntity()); // ��ȡ���������ع�����json�ַ�������
				this.log.setMsg("����ɹ�");
				this.log.setOutput(this.returnstr);
				returnjson = new JSONObject(this.returnstr);
				JSONObject re = returnjson.getJSONObject("Result");				
				JSONObject ResponseStatus = re.getJSONObject("ResponseStatus");
				if(ResponseStatus.getBoolean("IsSuccess")){
					this.log.setJieKouZT(K3Func.FLAG_SUCCESS);
					//System.out.println("--->д�����ɹ�");
					IsSuccess = true;
					flag = K3Func.FLAG_SUCCESS; //�ɹ�
				}else{
					this.log.setJieKouZT(K3Func.FLAG_FAIL);
					//System.out.println("--->д����ʧ��");
					IsSuccess = false;
					errmsg = ResponseStatus.get("Errors").toString();
					flag = K3Func.FLAG_FAIL;//ʧ��
				}
				System.out.println("--->д�룺"+ ((System.currentTimeMillis() - s1)));
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
	 * ����
	 * @param webapi
	 * @return
	 * @throws Exception
	 */
	public int executeSave(K3Funcable webapi) throws Exception{
		System.out.println("--->ִ�б���ӿڣ�" + webapi.getFormID());
		String url = this.getWebApiURL(WebApi.Save_URL);
		this.log.setLeiXing(WebApi.Save_TITLE);
		return this.execute(url, webapi);
	}
	
	/**
	 * ����
	 * @param webapi
	 * @return
	 * @throws Exception
	 */
	public int executePush(K3Funcable webapi) throws Exception{
		System.out.println("--->ִ�����ƽӿڣ�" + webapi.getFormID());
		String url = this.getWebApiURL(WebApi.Push_URL);
		this.log.setLeiXing(WebApi.Push_TITLE);
		return this.execute(url, webapi);
	}

	/**
	 * �鿴����
	 * @param webapi
	 * @return
	 * @throws Exception
	 */
	public int executeView(K3Funcable webapi) throws Exception{
		System.out.println("--->ִ�в鿴�ӿڣ�" + webapi.getFormID());
		String url = this.getWebApiURL(WebApi.View_URL);
		this.log.setLeiXing(WebApi.View_TITLE);
		return this.execute(url, webapi);
	}

	/**
	 * �鿴����
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
	 * ����
	 * @param webapi
	 * @return
	 * @throws Exception
	 */
	public int executeAudit(K3Funcable webapi) throws Exception{
		System.out.println("--->ִ�������ӿڣ�" + webapi.getFormID());
		String url = this.getWebApiURL(WebApi.Audit_URL);
		this.log.setLeiXing(WebApi.Audit_TITLE);
		return this.execute(url, webapi);
	}
	/**
	 * ����
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
	 * ����
	 * @param webapi
	 * @return
	 * @throws Exception
	 */
	public int executeUnAudit(K3Funcable webapi) throws Exception{
		System.out.println("--->ִ�з���ӿڣ�" + webapi.getFormID());
		String url = this.getWebApiURL(WebApi.UnAudit_URL);
		this.log.setLeiXing(WebApi.UnAudit_TITLE);
		return this.execute(url, webapi);
	}
	
	/**
	 *  ����
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
	 * ɾ��
	 * @param webapi
	 * @return
	 * @throws Exception
	 */
	public int executeDelete(K3Funcable webapi) throws Exception{
		System.out.println("--->ִ��ɾ���ӿڣ�" + webapi.getFormID());
		String url = this.getWebApiURL(WebApi.Delete_URL);
		this.log.setLeiXing(WebApi.Delete_TITLE);
		return this.execute(url, webapi);
	}

	/**
	 * �ύ
	 * @param webapi
	 * @return
	 * @throws Exception
	 */
	public int executeSubmit(K3Funcable webapi) throws Exception{
		System.out.println("--->ִ���ύ�ӿڣ�" + webapi.getFormID());
		String url = this.getWebApiURL(WebApi.Submit_URL);
		this.log.setLeiXing(WebApi.Submit_TITLE);
		return this.execute(url, webapi);
	}
	/**
	 * �ύ
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
	 * ���棬�ύ������һ�崦��
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
					System.out.println("ִ�������ӿ�ʧ��");					
				}
			}else{
				System.out.println("ִ���ύ�ӿ�ʧ��");
			}
		}else{
			System.out.println("ִ�б���ӿ�ʧ��");
		}
		return flag;
	}
}