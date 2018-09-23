package com.xohaa.k3cloud.fentity.contract;
import com.xohaa.k3cloud.fentity.EntryData;
/**
 *合同条款
 * @author Administrator
 *
 */
public class FContractClause  extends EntryData{
	public FContractClause(){
		super();
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
		jsonstr.addFNumberData("FClauseId",FClauseId);
	}

	/**
	 * 描述
	 * @param FClauseDesc
	 */
	public void setFClauseDesc(String FClauseDesc){
		jsonstr.addData("FClauseDesc", FClauseDesc);
	}
}
