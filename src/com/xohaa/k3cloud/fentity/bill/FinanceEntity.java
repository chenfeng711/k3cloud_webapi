package com.xohaa.k3cloud.fentity.bill;
import com.xohaa.k3cloud.fentity.EntryData;
public class FinanceEntity  extends EntryData{
	public FinanceEntity(){
		super();
	}
	
	/**
	 * ������֯(������)
	 * @param FSettleOrgId
	 */
	public void setFSettleOrgId(String FSettleOrgId) {
		jsonstr.addFNumberData("FSettleOrgId", FSettleOrgId);
	}

	/**
	 * ���㷽ʽ
	 * @param FSettleModeId
	 */
	public void setFSettleModeId(String FSettleModeId) {
		jsonstr.addFNumberData("FSettleModeId", FSettleModeId);
	}

	/**
	 * ����ұ�(������)
	 * @param FSettleCurrId
	 */
	public void setFSettleCurrId(String FSettleCurrId) {
		jsonstr.addFNumberData("FSettleCurrId", FSettleCurrId);
	}

	/**
	 * ��������
	 * @param FPayConditionId
	 */
	public void setFPayConditionId(String FPayConditionId) {
		jsonstr.addFNumberData("FPayConditionId", FPayConditionId);
	}

	/**
	 * ��˰
	 * @param FIsIncludedTax
	 */
	public void setFIsIncludedTax(boolean FIsIncludedTax) {
		jsonstr.addData("FIsIncludedTax", FIsIncludedTax);
	}

	/**
	 * ����ʱ��(������)
	 * @param FPricePoint
	 */
	public void setFPricePoint(String FPricePoint) {
		jsonstr.addData("FPricePoint", FPricePoint);
	}

	/**
	 * ��Ŀ��
	 * @param FPriceListId
	 */
	public void setFPriceListId(String FPriceListId) {
		jsonstr.addFNumberData("FPriceListId", FPriceListId);
	}

	/**
	 * �ۿ۱�
	 * @param FDiscountListId
	 */
	public void setFDiscountListId(String FDiscountListId) {
		jsonstr.addFNumberData("FDiscountListId", FDiscountListId);
	}

	/**
	 * ��λ��
	 * @param FLocalCurrId
	 */
	public void setFLocalCurrId(String FLocalCurrId) {
		jsonstr.addFNumberData("FLocalCurrId", FLocalCurrId);
	}

	/**
	 * ��������
	 * @param FExchangeTypeId
	 */
	public void setFExchangeTypeId(String FExchangeTypeId) {
		jsonstr.addFNumberData("FExchangeTypeId", FExchangeTypeId);
	}

	/**
	 * ����
	 * @param FExchangeRate
	 */
	public void setFExchangeRate(double FExchangeRate) {
		jsonstr.addData("FExchangeRate",FExchangeRate);
	}

	/**
	 * ����˰
	 * @param FISPRICEEXCLUDETAX
	 */
	public void setFISPRICEEXCLUDETAX(boolean FISPRICEEXCLUDETAX) {
		jsonstr.addData("FISPRICEEXCLUDETAX",FISPRICEEXCLUDETAX);
	}
}
