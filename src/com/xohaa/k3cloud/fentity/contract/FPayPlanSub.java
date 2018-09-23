package com.xohaa.k3cloud.fentity.contract;
import com.xohaa.k3cloud.fentity.EntryData;
/**
 * 
 * @author Administrator
 *
 */
public class FPayPlanSub  extends EntryData{
	public FPayPlanSub(){
		super();
	}

	/**
	 * 
	 * @param FDetailID
	 */
	public void setFDetailID(String FDetailID){
		jsonstr.addData("FDetailID",FDetailID);
	}

	/**
	 * 付款单内码
	 * @param FPAYBILLID
	 */
	public void setFPAYBILLID(String FPAYBILLID) {
		jsonstr.addData("FPAYBILLID",FPAYBILLID);
	}

	/**
	 * 付款单分录内码
	 * @param FPAYBILLENTRYID
	 */
	public void setFPAYBILLENTRYID(String FPAYBILLENTRYID){
		jsonstr.addData("FPAYBILLENTRYID",FPAYBILLENTRYID);
	}

	/**
	 * 采购合同内码
	 * @param FContractId
	 */
	public void setFContractId(String FContractId) {
		jsonstr.addData("FContractId",FContractId);
	}

	/**
	 * 实付预付金额
	 * @param FACTUALSUBAMOUNT
	 */
	public void setFACTUALSUBAMOUNT(double FACTUALSUBAMOUNT) {
		jsonstr.addData("FACTUALSUBAMOUNT",FACTUALSUBAMOUNT);
	}

	/**
	 * 预分配金额
	 * @param FPRESUBAMOUNT
	 */
	public void setFPRESUBAMOUNT(double FPRESUBAMOUNT) {
		jsonstr.addData("FPRESUBAMOUNT",FPRESUBAMOUNT);
	}
}