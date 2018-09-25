package com.xohaa.k3cloud.webapi;

import org.json.JSONException;
import org.json.JSONObject;
/**
 * ²é¿´
 * @author chenjianxiong
 *
 */
public abstract class View extends Common {
	public View(String formid) throws JSONException {
		super(formid);
		this.initParamdata();
	}
	
	/**
	 * 
	 * @param formid
	 * @throws JSONException
	 */
	private void initParamdata() throws JSONException{
		this.paramdata = new JSONObject();
	}
	
	/**
	 * 
	 * @param number
	 * @throws JSONException
	 */
	public void setNumber(String number) throws JSONException{
		this.paramdata.put("Number", number);
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
