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
	 * Ӧ������
	 * @param FYFDATE
	 */
	public void setFYFDATE(String FYFDATE) {
		jsonstr.addData("FYFDATE",FYFDATE);
	}

	/**
	 * Ӧ������(%)
	 * @param FYFRATIO
	 */
	public void setFYFRATIO(double FYFRATIO) {
		jsonstr.addData("FYFRATIO",FYFRATIO);
	}

	/**
	 * Ӧ�����
	 * @param FYFAMOUNT
	 */
	public void setFYFAMOUNT(double FYFAMOUNT) {
		jsonstr.addData("FYFAMOUNT",FYFAMOUNT);
	}

	/**
	 * �Ƿ�Ԥ��
	 * @param FISPREPAY
	 */
	public void setFISPREPAY(boolean FISPREPAY) {
		jsonstr.addData("FISPREPAY",FISPREPAY);
	}

	/**
	 * Ԥ������
	 * @param FRelBillNo
	 */
	public void setFRelBillNo(String FRelBillNo) {
		jsonstr.addData("FRelBillNo",FRelBillNo);
	}

	/**
	 * ����Ԥ�����
	 * @param FONCEPREPAYAMOUNT
	 */
	public void setFONCEPREPAYAMOUNT(double FONCEPREPAYAMOUNT) {
		jsonstr.addData("FONCEPREPAYAMOUNT",FONCEPREPAYAMOUNT);
	}

	/**
	 * ����Ԥ�����
	 * @param FACTUALPAYAMOUNT
	 */
	public void setFACTUALPAYAMOUNT(double FACTUALPAYAMOUNT) {
		jsonstr.addData("FACTUALPAYAMOUNT",FACTUALPAYAMOUNT);
	}

	/**
	 * ��������������
	 * @param FAPPLYAMOUNT
	 */
	public void setFAPPLYAMOUNT(double FAPPLYAMOUNT) {
		jsonstr.addData("FAPPLYAMOUNT",FAPPLYAMOUNT);
	}

	/**
	 * ����������
	 * @param FPayJoinAmount
	 */
	public void setFPayJoinAmount(double FPayJoinAmount) {
		jsonstr.addData("FPayJoinAmount",FPayJoinAmount);
	}

	/**
	 * ��ע
	 * @param FPAYPLANNOTE
	 */
	public void setFPAYPLANNOTE(String FPAYPLANNOTE) {
		jsonstr.addData("FPAYPLANNOTE",FPAYPLANNOTE);
	}

	/**
	 * ���ϱ���
	 * @param FPayMaterialId
	 */
	public void setFPayMaterialId(String FPayMaterialId) {
		jsonstr.addFNumberData("FPayMaterialId",FPayMaterialId);
	}

	/**
	 * �����к�
	 * @param FMATERIALSEQ
	 */
	public void setFMATERIALSEQ(String FMATERIALSEQ) {
		jsonstr.addData("FMATERIALSEQ",FMATERIALSEQ);
	}

	/**
	 * �ɹ���ͬ����
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
