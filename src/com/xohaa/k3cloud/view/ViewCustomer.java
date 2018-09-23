package com.xohaa.k3cloud.view;
import org.json.JSONException;
import org.json.JSONObject;

import com.xohaa.Base.Func;
import com.xohaa.k3cloud.FormID;
import com.xohaa.k3cloud.webapi.View;
public class ViewCustomer extends View {
	public ViewCustomer(Func F) throws Exception {
		super(FormID.CUSTOMER);
	}
	
	public JSONObject sendContent() throws JSONException {
		JSONObject jsoncontent = new JSONObject("{\"Number\":\"CUST0001\"}");
		JSONObject json = new JSONObject();
		json.put("FormId","BD_Customer");
		json.put("data",jsoncontent);
		return json;
	}

	public void resultData(JSONObject result) throws JSONException {
		// TODO �Զ����ɵķ������
		
	}

	public String sendContentStr() throws JSONException {
		// TODO �Զ����ɵķ������
		return null;
	}

	public void resultData(String result) throws JSONException {
		// TODO �Զ����ɵķ������
		
	}

	public String getFormID() {
		// TODO �Զ����ɵķ������
		return "BD_Customer";
	}
}
