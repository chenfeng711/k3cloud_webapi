package com.xohaa.k3cloud.fentity;
import java.util.ArrayList;
import com.xohaa.k3cloud.JSONString;
public class EntryData {
	protected ArrayList<JSONString> arr;
	protected JSONString jsonstr;
	
	public JSONString getJsonstr() {
		return jsonstr;
	}

	/**
	 * 
	 * @return
	 */
	public StringBuffer getArrayListStr() {
		StringBuffer str = new StringBuffer(500);
		boolean b = false;
		str.append("[");
		for(int i=0;i<arr.size();i++){
			if(b){
				str.append(",");
			}
			str.append(arr.get(i).getJSONObjectStr());
			b = true;
		}
		str.append("]");
		return str;
	}
	
	public StringBuffer getJSONObjectStr() {
		return this.jsonstr.getJSONObjectStr();
	}	
	
	/**
	 * 
	 */
	public EntryData(){
		arr = new ArrayList<JSONString>();
		jsonstr = new JSONString(300);
	}

	/**
	 * 
	 */
	public void addArrayList(){
		arr.add(jsonstr);
		jsonstr = new JSONString(300);
	}
	
	/**
	 * 
	 * @param key
	 * @param value
	 */
	public void appendString(String key, String value){
		jsonstr.addData(key, value);
	}
	
}
