package com.xohaa.k3cloud.fentity.poorder;
import com.xohaa.k3cloud.fentity.EntryData;
public class FPOOrderFinance extends EntryData {	
	public FPOOrderFinance(){
		super();
	}
	
	/**
	 * 结算币别(必填项)
	 * @param FSettleCurrId
	 */
	public void setFSettleCurrId(String FSettleCurrId){
		this.jsonstr.addFNumberData("FSettleCurrId", FSettleCurrId);
	}
	
	/**
	 * 付款条件
	 * @param FPayConditionId
	 */
	public void setFPayConditionId(String FPayConditionId){
		this.jsonstr.addFNumberData("FPayConditionId", FPayConditionId);
	}

	/**
	 * 结算方式
	 * @param FSettleModeId
	 */
	public void setFSettleModeId(String FSettleModeId){
		this.jsonstr.addFNumberData("FSettleModeId", FSettleModeId);
	}

	/**
	 * 汇率类型
	 * @param FExchangeTypeId
	 */
	public void setFExchangeTypeId(String FExchangeTypeId){
		this.jsonstr.addFNumberData("FExchangeTypeId", FExchangeTypeId);
	}

	/**
	 * 汇率
	 * @param FExchangeRate
	 */
	public void setFExchangeRate(double FExchangeRate){
		this.jsonstr.addData("FExchangeRate", FExchangeRate);
	}

	/**
	 * 价目表
	 * @param FPriceListId
	 */
	public void setFPriceListId(String FPriceListId){
		this.jsonstr.addFNumberData("FPriceListId", FPriceListId);
	}

	/**
	 * 折扣表
	 * @param FDiscountListId
	 */
	public void setFDiscountListId(String FDiscountListId){
		this.jsonstr.addFNumberData("FDiscountListId", FDiscountListId);
	}

	/**
	 * 定价时点(必填项)
	 * @param FPriceTimePoint
	 */
	public void setFPriceTimePoint(String FPriceTimePoint){
		this.jsonstr.addData("FPriceTimePoint", FPriceTimePoint);
	}
	
	/**
	 * 集中结算组织
	 * @param FFOCUSSETTLEORGID
	 */
	public void setFFOCUSSETTLEORGID(String FFOCUSSETTLEORGID){
		this.jsonstr.addFNumberData("FFOCUSSETTLEORGID", FFOCUSSETTLEORGID);
	}

	/**
	 * 含税
	 * @param FIsIncludedTax
	 */
	public void setFIsIncludedTax(boolean FIsIncludedTax){
		this.jsonstr.addData("FIsIncludedTax", FIsIncludedTax);
	}

	/**
	 * 价外税
	 * @param FISPRICEEXCLUDETAX
	 */
	public void setFISPRICEEXCLUDETAX(boolean FISPRICEEXCLUDETAX){
		this.jsonstr.addData("FISPRICEEXCLUDETAX", FISPRICEEXCLUDETAX);
	}

	/**
	 * 本位币
	 * @param FLocalCurrId
	 */
	public void setFLocalCurrId(String FLocalCurrId){
		this.jsonstr.addFNumberData("FLocalCurrId", FLocalCurrId);
	}

	/**
	 * 预付单号
	 * @param FPayAdvanceBillId
	 */
	public void setFPayAdvanceBillId(String FPayAdvanceBillId){
		this.jsonstr.addFNumberData("FPayAdvanceBillId", FPayAdvanceBillId);
	}

	/**
	 * 单次预付额度
	 * @param FPAYADVANCEAMOUNT
	 */
	public void setFPAYADVANCEAMOUNT(double FPAYADVANCEAMOUNT){
		this.jsonstr.addData("FPAYADVANCEAMOUNT", FPAYADVANCEAMOUNT);
	}

	/**
	 * 单次预付额度汇率
	 * @param FSupToOderExchangeBusRate
	 */
	public void setFSupToOderExchangeBusRate(double FSupToOderExchangeBusRate){
		this.jsonstr.addData("FSupToOderExchangeBusRate", FSupToOderExchangeBusRate);
	}

	/**
	 * 集中结算(6.0废弃)
	 * @param FSEPSETTLE
	 */
	public void setFSEPSETTLE(boolean FSEPSETTLE) {
		this.jsonstr.addData("FSEPSETTLE", FSEPSETTLE);
	}
}
