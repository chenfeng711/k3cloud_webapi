package com.xohaa.k3cloud.fentity.poorder;
import com.xohaa.k3cloud.fentity.EntryData;
/**
 * 
 * @author chenjianxiong
 *
 */
public class FIinstallment extends EntryData {
	public FIinstallment(){
		super();
	}
	/**
	 * 
	 * @param FENTRYID
	 */
	public void setFENTRYID(String FENTRYID){
		jsonstr.addData("FENTRYID",FENTRYID);
	}

	/**
	 * Ӧ������
	 * @param FYFDATE
	 */
	public void setFYFDATE(String FYFDATE){
		jsonstr.addData("FYFDATE",FYFDATE);
	}

	/**
	 * Ӧ������(%)
	 * @param FYFRATIO
	 */
	public void setFYFRATIO(double FYFRATIO){
		jsonstr.addData("FYFRATIO",FYFRATIO);
	}

	/**
	 * Ӧ�����
	 * @param FYFAMOUNT
	 */
	public void setFYFAMOUNT(double FYFAMOUNT){
		jsonstr.addData("FYFAMOUNT",FYFAMOUNT);
	}

	/**
	 * �Ƿ�Ԥ��
	 * @param FISPREPAYMENT
	 */
	public void setFISPREPAYMENT(boolean FISPREPAYMENT){
		jsonstr.addData("FISPREPAYMENT",FISPREPAYMENT);
	}

	/**
	 * Ԥ������
	 * @param FRelBillNo
	 */
	public void setFRelBillNo(String FRelBillNo){
		jsonstr.addData("FRelBillNo",FRelBillNo);
	}

	/**
	 * ����Ԥ�����
	 * @param FInsPrepaidAmount
	 */
	public void setFInsPrepaidAmount(String FInsPrepaidAmount){
		jsonstr.addData("FInsPrepaidAmount",FInsPrepaidAmount);
	}

	/**
	 * ʵ��Ԥ�����
	 * @param FACTUALAMOUNT
	 */
	public void setFACTUALAMOUNT(String FACTUALAMOUNT){
		jsonstr.addData("FACTUALAMOUNT",FACTUALAMOUNT);
	}

	/**
	 * ����������
	 * @param FPayJoinAmount
	 */
	public void setFPayJoinAmount(String FPayJoinAmount){
		jsonstr.addData("FPayJoinAmount",FPayJoinAmount);
	}

	/**
	 * ��ע
	 * @param FRemarks
	 */
	public void setFRemarks(String FRemarks){
		jsonstr.addData("FRemarks",FRemarks);
	}

	/**
	 * ���ϱ���
	 * @param FPayMaterialId
	 */
	public void setFPayMaterialId(String FPayMaterialId){
		jsonstr.addFNumberData("FPayMaterialId",FPayMaterialId);
	}

	/**
	 * �����к�
	 * @param FMATERIALSEQ
	 */
	public void setFMATERIALSEQ(String FMATERIALSEQ){
		jsonstr.addData("FMATERIALSEQ",FMATERIALSEQ);
	}

	/**
	 * ����
	 * @param FPayPlanQty
	 */
	public void setFPayPlanQty(double FPayPlanQty){
		jsonstr.addData("FPayPlanQty",FPayPlanQty);
	}

	/**
	 * ��˰����
	 * @param FPayPlanPrice
	 */
	public void setFPayPlanPrice(double FPayPlanPrice){
		jsonstr.addData("FPayPlanPrice",FPayPlanPrice);
	}

	/**
	 * �������������
	 * @param FAppliedQty
	 */
	public void setFAppliedQty(double FAppliedQty){
		jsonstr.addData("FAppliedQty",FAppliedQty);
	}

	/**
	 * ʵ��Ԥ����������
	 * @param FActualPayQty
	 */
	public void setFActualPayQty(double FActualPayQty){
		jsonstr.addData("FActualPayQty",FActualPayQty);
	}

	/**
	 * ��������������
	 * @param FAPPLYAMOUNT
	 */
	public void setFAPPLYAMOUNT(double FAPPLYAMOUNT){
		jsonstr.addData("FAPPLYAMOUNT",FAPPLYAMOUNT);
	}

	/**
	 * �ɹ�������
	 * @param FPURCHASEORDERNO
	 */
	public void setFPURCHASEORDERNO(String FPURCHASEORDERNO){
		jsonstr.addData("FPURCHASEORDERNO",FPURCHASEORDERNO);
	}

	/**
	 * ������ϸ������
	 * @param FOrderEntryId
	 */
	public void setFOrderEntryId(String FOrderEntryId){
		jsonstr.addData("FOrderEntryId",FOrderEntryId);
	}

	/**
	 * Ԥ������%
	 * @param FinsPayAdvanceRate
	 */
	public void setFinsPayAdvanceRate(double FinsPayAdvanceRate){
		jsonstr.addData("FinsPayAdvanceRate",FinsPayAdvanceRate);
	}

	/**
	 * Ԥ����
	 * @param FInsPayAdvanceAmount
	 */
	public void setFInsPayAdvanceAmount(double FInsPayAdvanceAmount){
		jsonstr.addData("FInsPayAdvanceAmount",FInsPayAdvanceAmount);
	}

	/**
	 * �Ƽ۵�λ
	 * @param FPAYPLANPRICEUNITID
	 */
	public void setFPAYPLANPRICEUNITID(String FPAYPLANPRICEUNITID){
		jsonstr.addFNumberData("FPAYPLANPRICEUNITID",FPAYPLANPRICEUNITID);
	}

	/**
	 * �Ƽۻ�����λ
	 * @param FBasePriceUnit
	 */
	public void setFBasePriceUnit(String FBasePriceUnit){
		jsonstr.addFNumberData("FBasePriceUnit",FBasePriceUnit);
	}

	/**
	 * ����(������λ)
	 * @param FBasePayPlanQty
	 */
	public void setFBasePayPlanQty(double FBasePayPlanQty){
		jsonstr.addData("FBasePayPlanQty",FBasePayPlanQty);
	}

	/**
	 * 
	 * @param FOrderActualPaySubEntity
	 */
	public void setFOrderActualPaySubEntity(FOrderActualPaySubEntity FOrderActualPaySubEntity){
		jsonstr.addData("FOrderActualPaySubEntity", FOrderActualPaySubEntity.getArrayListStr());
	}
}
