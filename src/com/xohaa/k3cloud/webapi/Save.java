package com.xohaa.k3cloud.webapi;


import org.json.JSONObject;

import com.xohaa.k3cloud.JSONString;
/**
 * 保存表单接口，公共的传参JSONObject结构处理。
 */
public abstract class Save extends Common{
	private JSONString jsonstr = null;
	public Save(String formid){
		super(formid);
		this.initParamdata();
	}
	
	/**
	 * 
	 * @param formid
	 * @
	 */
	private void initParamdata() {
		this.jsonstr = new JSONString(500);
	}

	public JSONObject sendContent()  {
		return null;//this.getParamdataMain();
	}

	public String sendContentStr()  {
		StringBuffer main = new StringBuffer(400);
		main.append("{\"FormID\":\"").append(this.getFormID()).append("\",\"data\":")
		.append("{\"Creator\":\"\",\"NeedUpDateFields\":[],\"NeedReturnFields\":[],\"IsDeleteEntry\":\"True\",\"SubSystemId\":\"\",\"IsVerifyBaseDataField\":\"false\",\"IsEntryBatchFill\":\"True\",")
		.append("\"Model\":{")
		.append(jsonstr.getJsonstr());
		main.append("}}}");
		return main.toString();
	}
	
	/**
	 * 表单实体数据（必录）
	 * @param json
	 */
	public void setModelData(String key,String value){
		this.jsonstr.addData(key, value);
	}
	public void setModelData(String key,StringBuffer arr){
		this.jsonstr.addData(key, arr);
	}
	public void setModelData(String key,double value){
		this.jsonstr.addData(key, value);
	}
	public void setModelData(String key,boolean value){
		this.jsonstr.addData(key, value);
	}
	public void setModelFNumberData(String key,String fnumber){
		this.jsonstr.addFNumberData(key, fnumber);
	}
	
}
