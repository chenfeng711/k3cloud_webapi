package com.xohaa.k3cloud.fentity.contract;
import org.json.JSONObject;

import com.xohaa.k3cloud.fentity.EntryData;
/**
 * 财务信息
 * @author Administrator
 *
 */
public class FContractFin  extends EntryData{
	public FContractFin(){
		super();
	}


	/**
	 * 价外税
	 * @param FISPRICEEXCLUDETAX
	 * @ 
	 */
	public void setFISPRICEEXCLUDETAX(boolean FISPRICEEXCLUDETAX){
		jsonstr.addData("FISPRICEEXCLUDETAX", FISPRICEEXCLUDETAX);
	}
	
	/**
	 * 结算币别(必填项)
	 * @param FSettleCurrId
	 */
	public void setFSettleCurrId(String FSettleCurrId) {
		jsonstr.addData("FSettleCurrId", new JSONObject().put("FNumber",FSettleCurrId));
	}

	/**
	 * 付款条件
	 * @param FPayConditionId
	 */
	public void setFPayConditionId(String FPayConditionId) {
		jsonstr.addData("FPayConditionId", new JSONObject().put("FNumber",FPayConditionId));
	}

	/**
	 * 汇率类型
	 * @param FExchangeTypeId
	 */
	public void setFExchangeTypeId(String FExchangeTypeId) {
		jsonstr.addData("FExchangeTypeId", new JSONObject().put("FNumber",FExchangeTypeId));
	}

	/**
	 * 汇率
	 * @param FExchangeRate
	 */
	public void setFExchangeRate(double FExchangeRate) {
		jsonstr.addData("FExchangeRate", FExchangeRate);
	}

	/**
	 * 价目表
	 * @param FPriceListId
	 */
	public void setFPriceListId(String FPriceListId) {
		jsonstr.addData("FPriceListId", new JSONObject().put("FNumber",FPriceListId));
	}

	/**
	 * 折扣表
	 * @param FDiscountListId
	 */
	public void setFDiscountListId(String FDiscountListId) {
		jsonstr.addData("FDiscountListId", new JSONObject().put("FNumber",FDiscountListId));
	}

	/**
	 * 定价时点(必填项)
	 * @param FPriceTimePoint
	 */
	public void setFPriceTimePoint(String FPriceTimePoint) {
		jsonstr.addData("FPriceTimePoint", FPriceTimePoint);
	}

	/**
	 * 款项支付方式
	 * @param FSettleModeId
	 */
	public void setFSettleModeId(String FSettleModeId) {
		jsonstr.addData("FSettleModeId", new JSONObject().put("FNumber",FSettleModeId));
	}

	/**
	 * 含税
	 * @param FIsIncludedTax
	 */
	public void setFIsIncludedTax(boolean FIsIncludedTax) {
		jsonstr.addData("FIsIncludedTax", FIsIncludedTax);
	}

	/**
	 * 本位币
	 * @param FLocalCurrId
	 */
	public void setFLocalCurrId(String FLocalCurrId) {
		jsonstr.addData("FLocalCurrId", new JSONObject().put("FNumber",FLocalCurrId));
	}
}
