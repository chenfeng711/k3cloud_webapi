package com.xohaa.k3cloud.webapi;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * 删除
 * @author Administrator
 *
 */
public class Delete extends Common {
	public Delete(String formid) throws JSONException {
		super(formid);
		this.initParamdata();
	}
	/**
	 * 
	 * @param formid
	 * @throws JSONException
	 */
	private void initParamdata() throws JSONException{
		String str ="{\"CreateOrgId\":\"0\",\"Numbers\":[],\"Ids\":\"\"}";
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
	 * 单据编号
	 * @param number
	 * @throws JSONException
	 */
	public void setNumbers(String number) throws JSONException{
		this.paramdata.put("Numbers", new JSONArray().put(number));
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
