package com.xohaa.k3cloud.fentity.cust;
import com.xohaa.k3cloud.fentity.EntryData;
/**
 * ������֯
 * @author Administrator
 *
 */
public class FT_BD_CUSTORDERORG extends EntryData{
	public FT_BD_CUSTORDERORG(){
		super();
	}
	/**
	 * 
	 * @param FEntryID
	 */
	public void setFEntryID(String FEntryID){
		jsonstr.addFNumberData("FEntryID", FEntryID);
	}

	/**
	 * ������֯
	 * @param FOrderOrgId
	 */
	public void setFOrderOrgId(String FOrderOrgId){
		jsonstr.addFNumberData("FOrderOrgId",FOrderOrgId);
	}

	/**
	 * Ĭ��
	 * @param FIsDefaultOrderOrg
	 */
	public void setFIsDefaultOrderOrg(boolean FIsDefaultOrderOrg){
		jsonstr.addData("FIsDefaultOrderOrg",FIsDefaultOrderOrg);
	}
}
