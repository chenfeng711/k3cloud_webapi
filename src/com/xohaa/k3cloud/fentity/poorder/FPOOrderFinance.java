package com.xohaa.k3cloud.fentity.poorder;
import com.xohaa.k3cloud.fentity.EntryData;
public class FPOOrderFinance extends EntryData {	
	public FPOOrderFinance(){
		super();
	}
	
	/**
	 * ����ұ�(������)
	 * @param FSettleCurrId
	 */
	public void setFSettleCurrId(String FSettleCurrId){
		this.jsonstr.addFNumberData("FSettleCurrId", FSettleCurrId);
	}
	
	/**
	 * ��������
	 * @param FPayConditionId
	 */
	public void setFPayConditionId(String FPayConditionId){
		this.jsonstr.addFNumberData("FPayConditionId", FPayConditionId);
	}

	/**
	 * ���㷽ʽ
	 * @param FSettleModeId
	 */
	public void setFSettleModeId(String FSettleModeId){
		this.jsonstr.addFNumberData("FSettleModeId", FSettleModeId);
	}

	/**
	 * ��������
	 * @param FExchangeTypeId
	 */
	public void setFExchangeTypeId(String FExchangeTypeId){
		this.jsonstr.addFNumberData("FExchangeTypeId", FExchangeTypeId);
	}

	/**
	 * ����
	 * @param FExchangeRate
	 */
	public void setFExchangeRate(double FExchangeRate){
		this.jsonstr.addData("FExchangeRate", FExchangeRate);
	}

	/**
	 * ��Ŀ��
	 * @param FPriceListId
	 */
	public void setFPriceListId(String FPriceListId){
		this.jsonstr.addFNumberData("FPriceListId", FPriceListId);
	}

	/**
	 * �ۿ۱�
	 * @param FDiscountListId
	 */
	public void setFDiscountListId(String FDiscountListId){
		this.jsonstr.addFNumberData("FDiscountListId", FDiscountListId);
	}

	/**
	 * ����ʱ��(������)
	 * @param FPriceTimePoint
	 */
	public void setFPriceTimePoint(String FPriceTimePoint){
		this.jsonstr.addData("FPriceTimePoint", FPriceTimePoint);
	}
	
	/**
	 * ���н�����֯
	 * @param FFOCUSSETTLEORGID
	 */
	public void setFFOCUSSETTLEORGID(String FFOCUSSETTLEORGID){
		this.jsonstr.addFNumberData("FFOCUSSETTLEORGID", FFOCUSSETTLEORGID);
	}

	/**
	 * ��˰
	 * @param FIsIncludedTax
	 */
	public void setFIsIncludedTax(boolean FIsIncludedTax){
		this.jsonstr.addData("FIsIncludedTax", FIsIncludedTax);
	}

	/**
	 * ����˰
	 * @param FISPRICEEXCLUDETAX
	 */
	public void setFISPRICEEXCLUDETAX(boolean FISPRICEEXCLUDETAX){
		this.jsonstr.addData("FISPRICEEXCLUDETAX", FISPRICEEXCLUDETAX);
	}

	/**
	 * ��λ��
	 * @param FLocalCurrId
	 */
	public void setFLocalCurrId(String FLocalCurrId){
		this.jsonstr.addFNumberData("FLocalCurrId", FLocalCurrId);
	}

	/**
	 * Ԥ������
	 * @param FPayAdvanceBillId
	 */
	public void setFPayAdvanceBillId(String FPayAdvanceBillId){
		this.jsonstr.addFNumberData("FPayAdvanceBillId", FPayAdvanceBillId);
	}

	/**
	 * ����Ԥ�����
	 * @param FPAYADVANCEAMOUNT
	 */
	public void setFPAYADVANCEAMOUNT(double FPAYADVANCEAMOUNT){
		this.jsonstr.addData("FPAYADVANCEAMOUNT", FPAYADVANCEAMOUNT);
	}

	/**
	 * ����Ԥ����Ȼ���
	 * @param FSupToOderExchangeBusRate
	 */
	public void setFSupToOderExchangeBusRate(double FSupToOderExchangeBusRate){
		this.jsonstr.addData("FSupToOderExchangeBusRate", FSupToOderExchangeBusRate);
	}

	/**
	 * ���н���(6.0����)
	 * @param FSEPSETTLE
	 */
	public void setFSEPSETTLE(boolean FSEPSETTLE) {
		this.jsonstr.addData("FSEPSETTLE", FSEPSETTLE);
	}
}
