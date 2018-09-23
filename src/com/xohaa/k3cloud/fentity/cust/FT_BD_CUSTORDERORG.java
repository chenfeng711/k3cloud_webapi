package com.xohaa.k3cloud.fentity.cust;
import com.xohaa.k3cloud.fentity.EntryData;
/**
 * 订货组织
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
	 * 订货组织
	 * @param FOrderOrgId
	 */
	public void setFOrderOrgId(String FOrderOrgId){
		jsonstr.addFNumberData("FOrderOrgId",FOrderOrgId);
	}

	/**
	 * 默认
	 * @param FIsDefaultOrderOrg
	 */
	public void setFIsDefaultOrderOrg(boolean FIsDefaultOrderOrg){
		jsonstr.addData("FIsDefaultOrderOrg",FIsDefaultOrderOrg);
	}
}
