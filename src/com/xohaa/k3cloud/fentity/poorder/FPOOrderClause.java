package com.xohaa.k3cloud.fentity.poorder;
import com.xohaa.k3cloud.fentity.EntryData;

/**
 * ����
 * @author Administrator
 *
 */
public class FPOOrderClause  extends EntryData{
	public FPOOrderClause(){
		super();
	}
	/**
	 * 
	 * @param FEntryID
	 */
	public void setFEntryID(String FEntryID){
		this.jsonstr.addData("FEntryID", FEntryID);
	}

	/**
	 * �������
	 * @param FClauseId
	 */
	public void setFClauseId(String FClauseId){
		this.jsonstr.addFNumberData("FNumber", FClauseId);
	}

	/**
	 * ����
	 * @param FClauseDesc
	 */
	public void setFClauseDesc(String FClauseDesc){
		this.jsonstr.addData("FClauseDesc", FClauseDesc);
	}
}
