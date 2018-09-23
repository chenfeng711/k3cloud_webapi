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
	 * 结算组织(必填项)
	 * @param FSettleOrgId
	 */
	public void setFSettleOrgId(String FSettleOrgId) {
		jsonstr.addFNumberData("FSettleOrgId",FSettleOrgId);
	}

	/**
	 * 结算方式
	 * @param FSettleTypeId
	 */
	public void setFSettleTypeId(String FSettleTypeId) {
		jsonstr.addFNumberData("FSettleTypeId",FSettleTypeId);
	}

	/**
	 * 付款条件
	 * @param FPayConditionId
	 */
	public void setFPayConditionId(String FPayConditionId) {
		jsonstr.addFNumberData("FPayConditionId",FPayConditionId);
	}

	/**
	 * 结算币别(必填项)
	 * @param FSettleCurrId
	 */
	public void setFSettleCurrId(String FSettleCurrId) {
		jsonstr.addFNumberData("FSettleCurrId",FSettleCurrId);
	}

	/**
	 * 含税
	 * @param FIsIncludedTax
	 */
	public void setFIsIncludedTax(boolean FIsIncludedTax) {
		jsonstr.addData("FIsIncludedTax", FIsIncludedTax);
	}

	/**
	 * 定价时点(必填项)
	 * @param FPriceTimePoint
	 */
	public void setFPriceTimePoint(String FPriceTimePoint) {
		jsonstr.addData("FPriceTimePoint", FPriceTimePoint);
	}

	/**
	 * 价目表
	 * @param FPriceListId
	 */
	public void setFPriceListId(String FPriceListId) {
		jsonstr.addFNumberData("FPriceListId",FPriceListId);
	}

	/**
	 * 折扣表
	 * @param FDiscountListId
	 */
	public void setFDiscountListId(String FDiscountListId) {
		jsonstr.addFNumberData("FDiscountListId",FDiscountListId);
	}

	/**
	 * 本位币
	 * @param FLocalCurrId
	 */
	public void setFLocalCurrId(String FLocalCurrId) {
		jsonstr.addFNumberData("FLocalCurrId",FLocalCurrId);
	}

	/**
	 * 汇率类型
	 * @param FExchangeTypeId
	 */
	public void setFExchangeTypeId(String FExchangeTypeId) {
		jsonstr.addFNumberData("FExchangeTypeId",FExchangeTypeId);
	}

	/**
	 * 汇率
	 * @param FExchangeRate
	 */
	public void setFExchangeRate(double FExchangeRate) {
		jsonstr.addData("FExchangeRate", FExchangeRate);
	}

	/**
	 * 价外税
	 * @param FISPRICEEXCLUDETAX
	 */
	public void setFISPRICEEXCLUDETAX(boolean FISPRICEEXCLUDETAX) {
		jsonstr.addData("FISPRICEEXCLUDETAX", FISPRICEEXCLUDETAX);
	}
}
