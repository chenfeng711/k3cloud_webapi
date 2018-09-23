package com.xohaa.k3cloud;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 * ƴ��JSONString�ṹ
 * @author chenjianxiong
 *
 */
public class JSONString {
	private StringBuffer jsonstr = null;
	private boolean isfirst = false;
	/**
	 * 
	 * @return
	 */
	public StringBuffer getJsonstr() {
		jsonstr.append("");
		return jsonstr;
	}
	
	/**
	 * 
	 * @return
	 */
	public StringBuffer getJSONObjectStr() {
		StringBuffer temp = new StringBuffer(320);
		temp.append("{");
		temp.append(jsonstr);
		temp.append("}");
		return temp;
	}
	/**
	 * 
	 * @param jsonstr
	 */
	public void setJsonstr(StringBuffer jsonstr) {
		this.jsonstr = jsonstr;
	}

	/**
	 * 
	 * @param num
	 */
	public JSONString(int num){
		jsonstr = new StringBuffer(num);
		isfirst = false;
	}
	
	/**
	 * 
	 */
	public JSONString(){
		jsonstr = new StringBuffer();
		isfirst = false;
	}
	/**
	 * �������
	 * @param key
	 * @param value
	 */
	public void addData(String key,String value){
		if(isfirst){
			jsonstr.append(",");
		}else{
			isfirst = true;
		}
		if(value.contains("\"")){
			value = value.replaceAll("\"", "\\\"");
		}
		jsonstr.append("\"").append(key).append("\":\"").append(value).append("\"");
	}
	
	/**
	 * �������
	 * @param key
	 * @param json
	 */
	public void addData(String key,JSONObject json){
		if(isfirst){
			jsonstr.append(",");
		}else{
			isfirst = true;
		}
		jsonstr.append("\"").append(key).append("\":").append(json.toString());
	}
	/**
	 * �������
	 * @param key
	 * @param arr
	 */
	public void addData(String key,JSONArray arr){
		if(isfirst){
			jsonstr.append(",");
		}else{
			isfirst = true;
		}
		jsonstr.append("\"").append(key).append("\":").append(arr.toString());
	}
	
	/**
	 * �������
	 * @param key
	 * @param arr
	 */
	public void addData(String key,StringBuffer arr){
		if(isfirst){
			jsonstr.append(",");
		}else{
			isfirst = true;
		}
		jsonstr.append("\"").append(key).append("\":").append(arr);
	}
	
	/**
	 * �������
	 * @param key
	 * @param value
	 */
	public void addData(String key,double value){
		if(isfirst){
			jsonstr.append(",");
		}else{
			isfirst = true;
		}
		jsonstr.append("\"").append(key).append("\":").append(value);
	}
	
	/**
	 * �������
	 * @param key
	 * @param value
	 */
	public void addData(String key,boolean value){
		if(isfirst){
			jsonstr.append(",");
		}else{
			isfirst = true;
		}
		jsonstr.append("\"").append(key).append("\":").append(value);
	}
	
	/**
	 * �������
	 * @param key
	 * @param js
	 */
	public void addData(String key,JSONString js){
		if(isfirst){
			jsonstr.append(",");
		}else{
			isfirst = true;
		}
		jsonstr.append("\"").append(key).append("\":").append(js.getJsonstr());
	}
	
	/**
	 * 
	 * @param key
	 * @param fnumber
	 */
	public void addFNumberData(String key,String fnumber){
		if(isfirst){
			jsonstr.append(",");
		}else{
			isfirst = true;
		}
		jsonstr.append("\"").append(key).append("\":{\"FNumber\":\""+ fnumber +"\"}");
	}

	
	@Override
	public String toString() {
		return jsonstr.toString();
	}
}
