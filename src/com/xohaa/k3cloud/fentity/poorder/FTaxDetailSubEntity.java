package com.xohaa.k3cloud.fentity.poorder;
import java.util.ArrayList;
import com.xohaa.k3cloud.JSONString;
/**
 * 条款
 * @author Administrator
 *
 */
public class FTaxDetailSubEntity {
	private ArrayList<JSONString> arr = null;
	private JSONString jsonstr;
	
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
	/**
	 * 
	 */
	public FTaxDetailSubEntity(){
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
	 * @param FEntryID
	 */
	public void setFEntryID(String FEntryID){
		jsonstr.addData("FEntryID", FEntryID);
	}

	/**
	 * 条款编码
	 * @param FClauseId
	 */
	public void setFClauseId(String FClauseId){
		jsonstr.addFNumberData("FClauseId", FClauseId);
	}

	/**
	 * 描述
	 * @param FClauseDesc
	 */
	public void setFClauseDesc(String FClauseDesc){
		jsonstr.addData("FClauseDesc", FClauseDesc);
	}
}
