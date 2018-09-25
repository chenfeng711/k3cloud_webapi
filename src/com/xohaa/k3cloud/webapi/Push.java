package com.xohaa.k3cloud.webapi;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * 下推
 * @author Administrator
 *
 */
public class Push extends Common {
	public Push(String formid) throws JSONException {
		super(formid);
		this.initParamdata();
	}
	/**
1.formid：业务对象表单Id（必录）
2.data：Json格式数据（详情参考Json格式数据）（必录）
     2.1.Ids：单据内码，字符串类型，格式"Id1,Id2,..."（逗号分开，未传Numbers，则必录）
     2.2.Numbers：单据编号集合，数组类型，格式["billNo1","billNo1",...]，数组类型（必录）
     2.3.RuleId：转换规则内码，字符串类型，格式"RuleId"（未启用默认转换规则时，则必录）
     2.4.TargetBillTypeId：目标单据类型内码，字符串类型，格式"Id1"（非必录）
     2.5.TargetOrgId：目标组织内码，整数类型，格式"Id1"（非必录）
     2.6.TargetFormId：目标单据FormId，字符串类型，格式:"FormId"（启用默认转换规则时，则必录）
     2.7.IsEnableDefaultRule：是否启用默认转换规则，布尔类型，默认值False，格式"false"（非必录）
     2.8.CustomParams：自定义参数，字典类型，格式"{key1:value1,key2:value2,...}"（非必录）
	 */
	private void initParamdata() throws JSONException{
		String str ="{\"Ids\":\"\",\"Numbers\":[],\"RuleId\":\"\",\"TargetBillTypeId\":\"\",\"TargetOrgId\":\"0\",\"TargetFormId\":\"\",\"IsEnableDefaultRule\":\"false\",\"CustomParams\":{}}";
		this.paramdata = new JSONObject(str);
	}
	
	/**
	 * 单据编号集合，数组类型，格式["billNo1","billNo1",...]，数组类型（必录）
	 * @param arr
	 * @throws JSONException
	 */
	public void setNumbers(JSONArray arr) throws JSONException{
		this.paramdata.put("Numbers", arr);
	}
	
	/**
	 * 2.1.Ids：单据内码，字符串类型，格式"Id1,Id2,..."（逗号分开，未传Numbers，则必录）
	 * @param arr
	 * @throws JSONException
	 */
	public void setIds(JSONArray arr) throws JSONException{
		this.paramdata.put("Ids", arr);
	}
	/**
	 * 2.2.Numbers：单据编号集合，数组类型，格式["billNo1","billNo1",...]，数组类型（必录）
	 * @param number
	 * @throws JSONException
	 */
	public void setNumbers(String number) throws JSONException{
		this.paramdata.put("Numbers", new JSONArray().put(number));
	}
	/**
	 * 2.3.RuleId：转换规则内码，字符串类型，格式"RuleId"（未启用默认转换规则时，则必录）
	 * @param RuleId
	 * @throws JSONException
	 */
	public void setRuleId(String RuleId) throws JSONException{
		this.paramdata.put("RuleId", RuleId);
	}
	
	/**
	 * 2.4.TargetBillTypeId：目标单据类型内码，字符串类型，格式"Id1"（非必录）
	 * @param TargetBillTypeId
	 * @throws JSONException
	 */
	public void setTargetBillTypeId(String TargetBillTypeId) throws JSONException{
		this.paramdata.put("TargetBillTypeId", TargetBillTypeId);
	}
	
	/**
	 * 2.5.TargetOrgId：目标组织内码，整数类型，格式"Id1"（非必录）
	 * @param TargetOrgId
	 * @throws JSONException
	 */
	public void setTargetOrgId(String TargetOrgId) throws JSONException{
		this.paramdata.put("TargetOrgId", TargetOrgId);
	}
	
	/**
	 * 2.6.TargetFormId：目标单据FormId，字符串类型，格式:"FormId"（启用默认转换规则时，则必录）
	 * @param TargetFormId
	 * @throws JSONException
	 */
	public void setTargetFormId(String TargetFormId) throws JSONException{
		this.paramdata.put("TargetFormId", TargetFormId);
	}
	
	/**
	 * 2.7.IsEnableDefaultRule：是否启用默认转换规则，布尔类型，默认值False，格式"false"（非必录）
	 * @param IsEnableDefaultRule
	 * @throws JSONException
	 */
	public void setIsEnableDefaultRule(boolean IsEnableDefaultRule) throws JSONException{
		this.paramdata.put("IsEnableDefaultRule",String.valueOf(IsEnableDefaultRule));
	}
	
	/**
	 * 2.8.CustomParams：自定义参数，字典类型，格式"{key1:value1,key2:value2,...}"（非必录）
	 * @param CustomParams
	 * @throws JSONException
	 */
	public void setIsEnableDefaultRule(JSONObject CustomParams) throws JSONException{
		this.paramdata.put("CustomParams",CustomParams);
	}
	
	public JSONObject sendContent() throws JSONException {
		JSONObject paramdatamain = new JSONObject();
		paramdatamain.put("FormId",this.getFormID());
		paramdatamain.put("data",paramdata);
		return paramdatamain;
	}

	public String sendContentStr() throws JSONException {
		return null;
	}
}
