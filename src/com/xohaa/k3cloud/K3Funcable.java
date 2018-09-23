package com.xohaa.k3cloud;

import org.json.JSONException;
import org.json.JSONObject;
/**
 * �ӿ�
 * @author chenjianxiong
 *
 */
public interface K3Funcable {
	
	public String getFormID();
	/**
	 * �ӿڴ���
	 * @return JSONObject
	 * @throws JSONException
	 */
	public JSONObject sendContent() throws JSONException;
	
	/**
	 * �ӿڴ���
	 * @return JSONObject
	 * @throws JSONException
	 */
	public String sendContentStr() throws JSONException;
	
}
