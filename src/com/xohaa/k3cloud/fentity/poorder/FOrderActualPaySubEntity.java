package com.xohaa.k3cloud.fentity.poorder;
import com.xohaa.k3cloud.fentity.EntryData;
public class FOrderActualPaySubEntity extends EntryData {
	public FOrderActualPaySubEntity(){
		super();
	}
	/**
	 * 
	 * @param FDetailID
	 */
	public void setFDetailID(String FDetailID){
		jsonstr.addData("FDetailID", FDetailID);
	}

	/**
	 * 付款单内码
	 * @param FPAYBILLID
	 */
	public void setFPAYBILLID(String FPAYBILLID){
		jsonstr.addData("FPAYBILLID", FPAYBILLID);
	}

	/**
	 * 付款单分录内码
	 * @param FPAYBILLENTITYID
	 */
	public void setFPAYBILLENTITYID(String FPAYBILLENTITYID){
		jsonstr.addData("FPAYBILLENTITYID", FPAYBILLENTITYID);
	}

	/**
	 * 采购订单内码
	 * @param FPOORDERID
	 */
	public void setFPOORDERID(double FPOORDERID){
		jsonstr.addData("FPOORDERID", FPOORDERID);
	}

	/**
	 * 实付预付金额
	 * @param FAmount
	 */
	public void setFAmount(double FAmount){
		jsonstr.addData("FAmount", FAmount);
	}

	/**
	 * 预分配金额
	 * @param FPREAMOUNT
	 */
	public void setFPREAMOUNT(String FPREAMOUNT){
		jsonstr.addData("FPREAMOUNT", FPREAMOUNT);
	}

	/**
	 * 结算组织
	 * @param FPPSettleOrgId
	 */
	public void setFPPSettleOrgId(String FPPSettleOrgId){
		this.jsonstr.addFNumberData("FPPSettleOrgId", FPPSettleOrgId);
	}

	/**
	 * 付款申请单号
	 * @param FAPPLYBILLNO
	 */
	public void setFAPPLYBILLNO(String FAPPLYBILLNO){
		jsonstr.addData("FAPPLYBILLNO", FAPPLYBILLNO);
	}

	/**
	 * 预付单号
	 * @param FPREPAYBillNo
	 */
	public void setFPREPAYBillNo(double FPREPAYBillNo){
		jsonstr.addData("FPREPAYBillNo", FPREPAYBillNo);
	}

	/**
	 * 0付款申请关联金额
	 * @param FPAPPLYAMOUNT
	 */
	public void setFPAPPLYAMOUNT(double FPAPPLYAMOUNT){
		jsonstr.addData("FPAPPLYAMOUNT", FPAPPLYAMOUNT);
	}

	/**
	 * 付款关联金额
	 * @param FPPayJoinAmount
	 */
	public void setFPPayJoinAmount(double FPPayJoinAmount){
		jsonstr.addData("FPPayJoinAmount", FPPayJoinAmount);
	}
}
