package com.xohaa.k3cloud.fentity.contract;
import com.xohaa.k3cloud.fentity.EntryData;

public class FPayPlanEntry  extends EntryData{
	public FPayPlanEntry(){
		super();
	}
	/**
	 * 
	 * @param FENTRYID
	 */
	public void setFENTRYID(double FENTRYID) {
		jsonstr.addData("FENTRYID",FENTRYID);
	}
	
	/**
	 * 应付日期
	 * @param FYFDATE
	 */
	public void setFYFDATE(String FYFDATE) {
		jsonstr.addData("FYFDATE",FYFDATE);
	}

	/**
	 * 应付比例(%)
	 * @param FYFRATIO
	 */
	public void setFYFRATIO(double FYFRATIO) {
		jsonstr.addData("FYFRATIO",FYFRATIO);
	}

	/**
	 * 应付金额
	 * @param FYFAMOUNT
	 */
	public void setFYFAMOUNT(double FYFAMOUNT) {
		jsonstr.addData("FYFAMOUNT",FYFAMOUNT);
	}

	/**
	 * 是否预付
	 * @param FISPREPAY
	 */
	public void setFISPREPAY(boolean FISPREPAY) {
		jsonstr.addData("FISPREPAY",FISPREPAY);
	}

	/**
	 * 预付单号
	 * @param FRelBillNo
	 */
	public void setFRelBillNo(String FRelBillNo) {
		jsonstr.addData("FRelBillNo",FRelBillNo);
	}

	/**
	 * 单次预付额度
	 * @param FONCEPREPAYAMOUNT
	 */
	public void setFONCEPREPAYAMOUNT(double FONCEPREPAYAMOUNT) {
		jsonstr.addData("FONCEPREPAYAMOUNT",FONCEPREPAYAMOUNT);
	}

	/**
	 * 单次预付额度
	 * @param FACTUALPAYAMOUNT
	 */
	public void setFACTUALPAYAMOUNT(double FACTUALPAYAMOUNT) {
		jsonstr.addData("FACTUALPAYAMOUNT",FACTUALPAYAMOUNT);
	}

	/**
	 * 付款申请关联金额
	 * @param FAPPLYAMOUNT
	 */
	public void setFAPPLYAMOUNT(double FAPPLYAMOUNT) {
		jsonstr.addData("FAPPLYAMOUNT",FAPPLYAMOUNT);
	}

	/**
	 * 付款关联金额
	 * @param FPayJoinAmount
	 */
	public void setFPayJoinAmount(double FPayJoinAmount) {
		jsonstr.addData("FPayJoinAmount",FPayJoinAmount);
	}

	/**
	 * 备注
	 * @param FPAYPLANNOTE
	 */
	public void setFPAYPLANNOTE(String FPAYPLANNOTE) {
		jsonstr.addData("FPAYPLANNOTE",FPAYPLANNOTE);
	}

	/**
	 * 物料编码
	 * @param FPayMaterialId
	 */
	public void setFPayMaterialId(String FPayMaterialId) {
		jsonstr.addFNumberData("FPayMaterialId",FPayMaterialId);
	}

	/**
	 * 物料行号
	 * @param FMATERIALSEQ
	 */
	public void setFMATERIALSEQ(String FMATERIALSEQ) {
		jsonstr.addData("FMATERIALSEQ",FMATERIALSEQ);
	}

	/**
	 * 采购合同单号
	 * @param FCONTRACTBILLNO
	 */
	public void setFCONTRACTBILLNO(String FCONTRACTBILLNO) {
		jsonstr.addData("FCONTRACTBILLNO",FCONTRACTBILLNO);
	}
	
	/**
	 * 
	 * @param FPayPlanSub
	 * @
	 */
	public void setFPayPlanSub(FPayPlanSub FPayPlanSub) {
		jsonstr.addData("FPayPlanSub", FPayPlanSub.getArrayListStr());
	}
}
