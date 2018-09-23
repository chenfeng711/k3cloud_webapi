package com.xohaa.k3cloud;

import org.json.JSONException;
import org.json.JSONObject;
/**
 * 接口
 * @author chenjianxiong
 *
 */
public interface K3Funcable {
	
	public String getFormID();
	/**
	 * 接口传参
	 * @return JSONObject
	 * @throws JSONException
	 */
	public JSONObject sendContent() throws JSONException;
	
	/**
	 * 接口传参
	 * @return JSONObject
	 * @throws JSONException
	 */
	public String sendContentStr() throws JSONException;
	
}
