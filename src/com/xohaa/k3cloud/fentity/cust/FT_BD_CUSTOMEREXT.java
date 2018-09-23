package com.xohaa.k3cloud.fentity.cust;
import com.xohaa.k3cloud.fentity.EntryData;
public class FT_BD_CUSTOMEREXT  extends EntryData{
	public FT_BD_CUSTOMEREXT(){
		super();
	}

	/**
	 * ������������
	 * @param FEnableSL
	 */
	public void setFEnableSL(boolean FEnableSL){
		jsonstr.addData("FEnableSL", FEnableSL);
	}
	/**
	 * ���᷶Χ
	 * @param FFreezeLimit
	 */
	public void setFFreezeLimit(String FFreezeLimit) {
		jsonstr.addData("FFreezeLimit", FFreezeLimit);
	}

	/**
	 * ������
	 * @param FFreezeOperator
	 */
	public void setFFreezeOperator(String FFreezeOperator) {
		jsonstr.addData("FFreezeOperator", new StringBuffer(20).append("{\"FUserID\":\"")
				.append(FFreezeOperator).append("\"}"));
	}
	/**
	 * ��������
	 * @param FFreezeDate
	 */
	public void setFFreezeDate(String FFreezeDate){
		jsonstr.addData("FFreezeDate", FFreezeDate);
	}
	/**
	 * ʡ��
	 * @param FPROVINCE
	 */
	public void setFPROVINCE(String FPROVINCE) {
		jsonstr.addFNumberData("FPROVINCE", FPROVINCE);
	}

	/**
	 * ����
	 * @param FCITY
	 */
	public void setFCITY(String FCITY) {
		jsonstr.addFNumberData("FCITY",FCITY);
	}

	/**
	 * Ĭ���ջ��ص�
	 * @param FDefaultConsiLoc
	 */
	public void setFDefaultConsiLoc(String FDefaultConsiLoc) {
		jsonstr.addData("FDefaultConsiLoc", new StringBuffer(20).append("{\"FNUMBER\":\"")
				.append(FDefaultConsiLoc).append("\"}"));
	}
	/**
	 * Ĭ�Ͽ�Ʊ�ص�
	 * @param FDefaultSettleLoc
	 */
	public void setFDefaultSettleLoc(String FDefaultSettleLoc) {
		jsonstr.addData("FDefaultSettleLoc", new StringBuffer(20).append("{\"FNUMBER\":\"")
				.append(FDefaultSettleLoc).append("\"}"));
	}
	/**
	 * Ĭ�ϸ���ص�
	 * @param FDefaultPayerLoc
	 */
	public void setFDefaultPayerLoc(String FDefaultPayerLoc){
		jsonstr.addData("FDefaultPayerLoc", new StringBuffer(20).append("{\"FNUMBER\":\"")
				.append(FDefaultPayerLoc).append("\"}"));
	}

	/**
	 * Ĭ����ϵ��
	 * @param FDefaultContact
	 */
	public void setFDefaultContact(String FDefaultContact) {
		jsonstr.addFNumberData("FDefaultContact",FDefaultContact);
	}
	/**
	 * ��֤�������%��
	 * @param FMarginLevel
	 */
	public void setFMarginLevel(double FMarginLevel){
		jsonstr.addData("FMarginLevel", FMarginLevel);
	}
	/**
	 * ���㿨
	 * @param FDebitCard
	 */
	public void setFDebitCard(String FDebitCard) {
		jsonstr.addData("FDebitCard", FDebitCard);
	}
}
