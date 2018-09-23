package com.xohaa.k3cloud.fentity.finstock;
import com.xohaa.k3cloud.fentity.EntryData;
/**
 * 
 * @author Administrator
 *
 */
public class FInStockFin extends EntryData {
	/**
	 * 
	 */
	public FInStockFin(){
		super();
	}


	/**
	 * ������֯(������)
	 * @param FSettleOrgId
	 */
	public void setFSettleOrgId(String FSettleOrgId) {
		jsonstr.addFNumberData("FSettleOrgId",FSettleOrgId);
	}

	/**
	 * ���㷽ʽ
	 * @param FSettleTypeId
	 */
	public void setFSettleTypeId(String FSettleTypeId) {
		jsonstr.addFNumberData("FSettleTypeId",FSettleTypeId);
	}

	/**
	 * ��������
	 * @param FPayConditionId
	 */
	public void setFPayConditionId(String FPayConditionId) {
		jsonstr.addFNumberData("FPayConditionId",FPayConditionId);
	}

	/**
	 * ����ұ�(������)
	 * @param FSettleCurrId
	 */
	public void setFSettleCurrId(String FSettleCurrId) {
		jsonstr.addFNumberData("FSettleCurrId",FSettleCurrId);
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
	 * @param FPriceTimePoint
	 */
	public void setFPriceTimePoint(String FPriceTimePoint) {
		jsonstr.addData("FPriceTimePoint", FPriceTimePoint);
	}

	/**
	 * ��Ŀ��
	 * @param FPriceListId
	 */
	public void setFPriceListId(String FPriceListId) {
		jsonstr.addFNumberData("FPriceListId",FPriceListId);
	}

	/**
	 * �ۿ۱�
	 * @param FDiscountListId
	 */
	public void setFDiscountListId(String FDiscountListId) {
		jsonstr.addFNumberData("FDiscountListId",FDiscountListId);
	}

	/**
	 * ��λ��
	 * @param FLocalCurrId
	 */
	public void setFLocalCurrId(String FLocalCurrId) {
		jsonstr.addFNumberData("FLocalCurrId",FLocalCurrId);
	}

	/**
	 * ��������
	 * @param FExchangeTypeId
	 */
	public void setFExchangeTypeId(String FExchangeTypeId) {
		jsonstr.addFNumberData("FExchangeTypeId",FExchangeTypeId);
	}

	/**
	 * ����
	 * @param FExchangeRate
	 */
	public void setFExchangeRate(double FExchangeRate) {
		jsonstr.addData("FExchangeRate", FExchangeRate);
	}

	/**
	 * ����˰
	 * @param FISPRICEEXCLUDETAX
	 */
	public void setFISPRICEEXCLUDETAX(boolean FISPRICEEXCLUDETAX) {
		jsonstr.addData("FISPRICEEXCLUDETAX", FISPRICEEXCLUDETAX);
	}
}
