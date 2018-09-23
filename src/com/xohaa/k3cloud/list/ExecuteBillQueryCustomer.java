package com.xohaa.k3cloud.list;
import org.json.JSONException;
import com.xohaa.SQLDB.HandleSQLCon;
import com.xohaa.k3cloud.FormID;
import com.xohaa.k3cloud.webapi.ExecuteBillQuery;
public class ExecuteBillQueryCustomer extends ExecuteBillQuery {
	public ExecuteBillQueryCustomer(HandleSQLCon F) throws Exception {
		super(FormID.CUSTOMER);
	}
	


	public void resultData(String result) throws JSONException {
		//JSONArray arr = new JSONArray(result);

	}
}
