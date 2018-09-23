package com.xohaa.k3cloud.list;
import org.json.JSONException;
import com.xohaa.Base.Func;
import com.xohaa.k3cloud.FormID;
import com.xohaa.k3cloud.webapi.ExecuteBillQuery;
public class ExecuteBillQueryMaterial extends ExecuteBillQuery {
	//private Func F = null;
	public ExecuteBillQueryMaterial(Func F)  throws Exception {
		super(FormID.MATERIAL);
	}

	public void resultData(String result) throws JSONException {
		// TODO 自动生成的方法存根
		/*
		JSONArray arr = new JSONArray(result);
		F.putJsonData("result", arr);
		
		System.out.println("XXXX");
		JSONObject json = new JSONObject(result);
		F.putJsonData("result", json);
		*/
	}
	
}
