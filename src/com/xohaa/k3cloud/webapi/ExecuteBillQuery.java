package com.xohaa.k3cloud.webapi;

import org.json.JSONException;

import org.json.JSONObject;
/**
 * 查看单据
 * @author chenjianxiong
 *
 */
public abstract class ExecuteBillQuery extends Common{
	private JSONObject paramdata = null;
	public ExecuteBillQuery(String formid) throws JSONException {
		super(formid);
		this.initParamdata();
	}
	
	public void initParamdata() throws JSONException{
		paramdata = new JSONObject("{\"FormId\":\"\",\"FieldKeys\":\"FNumber,FName\",\"FilterString\":\"\",\"OrderString\":\"\",\"TopRowCount\":\"0\",\"StartRow\":\"0\",\"Limit\":\"20\"}");
		paramdata.put("FormId", this.getFormID());
	}
	
	public void setFieldKeys(String keys) throws JSONException{
		paramdata.put("FieldKeys", keys);
	}
	
	public void setLimit(int limit) throws JSONException{
		paramdata.put("Limit", limit);
	}
	
	public void setFilterString(String filterstring) throws JSONException{
		paramdata.put("FilterString", filterstring);
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
