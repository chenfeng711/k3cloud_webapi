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
	 * �������
	 * @param FPAYBILLID
	 */
	public void setFPAYBILLID(String FPAYBILLID){
		jsonstr.addData("FPAYBILLID", FPAYBILLID);
	}

	/**
	 * �����¼����
	 * @param FPAYBILLENTITYID
	 */
	public void setFPAYBILLENTITYID(String FPAYBILLENTITYID){
		jsonstr.addData("FPAYBILLENTITYID", FPAYBILLENTITYID);
	}

	/**
	 * �ɹ���������
	 * @param FPOORDERID
	 */
	public void setFPOORDERID(double FPOORDERID){
		jsonstr.addData("FPOORDERID", FPOORDERID);
	}

	/**
	 * ʵ��Ԥ�����
	 * @param FAmount
	 */
	public void setFAmount(double FAmount){
		jsonstr.addData("FAmount", FAmount);
	}

	/**
	 * Ԥ������
	 * @param FPREAMOUNT
	 */
	public void setFPREAMOUNT(String FPREAMOUNT){
		jsonstr.addData("FPREAMOUNT", FPREAMOUNT);
	}

	/**
	 * ������֯
	 * @param FPPSettleOrgId
	 */
	public void setFPPSettleOrgId(String FPPSettleOrgId){
		this.jsonstr.addFNumberData("FPPSettleOrgId", FPPSettleOrgId);
	}

	/**
	 * �������뵥��
	 * @param FAPPLYBILLNO
	 */
	public void setFAPPLYBILLNO(String FAPPLYBILLNO){
		jsonstr.addData("FAPPLYBILLNO", FAPPLYBILLNO);
	}

	/**
	 * Ԥ������
	 * @param FPREPAYBillNo
	 */
	public void setFPREPAYBillNo(double FPREPAYBillNo){
		jsonstr.addData("FPREPAYBillNo", FPREPAYBillNo);
	}

	/**
	 * 0��������������
	 * @param FPAPPLYAMOUNT
	 */
	public void setFPAPPLYAMOUNT(double FPAPPLYAMOUNT){
		jsonstr.addData("FPAPPLYAMOUNT", FPAPPLYAMOUNT);
	}

	/**
	 * ����������
	 * @param FPPayJoinAmount
	 */
	public void setFPPayJoinAmount(double FPPayJoinAmount){
		jsonstr.addData("FPPayJoinAmount", FPPayJoinAmount);
	}
}
