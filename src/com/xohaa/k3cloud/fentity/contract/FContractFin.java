package com.xohaa.k3cloud.fentity.contract;
import org.json.JSONObject;

import com.xohaa.k3cloud.fentity.EntryData;
/**
 * ������Ϣ
 * @author Administrator
 *
 */
public class FContractFin  extends EntryData{
	public FContractFin(){
		super();
	}


	/**
	 * ����˰
	 * @param FISPRICEEXCLUDETAX
	 * @ 
	 */
	public void setFISPRICEEXCLUDETAX(boolean FISPRICEEXCLUDETAX){
		jsonstr.addData("FISPRICEEXCLUDETAX", FISPRICEEXCLUDETAX);
	}
	
	/**
	 * ����ұ�(������)
	 * @param FSettleCurrId
	 */
	public void setFSettleCurrId(String FSettleCurrId) {
		jsonstr.addData("FSettleCurrId", new JSONObject().put("FNumber",FSettleCurrId));
	}

	/**
	 * ��������
	 * @param FPayConditionId
	 */
	public void setFPayConditionId(String FPayConditionId) {
		jsonstr.addData("FPayConditionId", new JSONObject().put("FNumber",FPayConditionId));
	}

	/**
	 * ��������
	 * @param FExchangeTypeId
	 */
	public void setFExchangeTypeId(String FExchangeTypeId) {
		jsonstr.addData("FExchangeTypeId", new JSONObject().put("FNumber",FExchangeTypeId));
	}

	/**
	 * ����
	 * @param FExchangeRate
	 */
	public void setFExchangeRate(double FExchangeRate) {
		jsonstr.addData("FExchangeRate", FExchangeRate);
	}

	/**
	 * ��Ŀ��
	 * @param FPriceListId
	 */
	public void setFPriceListId(String FPriceListId) {
		jsonstr.addData("FPriceListId", new JSONObject().put("FNumber",FPriceListId));
	}

	/**
	 * �ۿ۱�
	 * @param FDiscountListId
	 */
	public void setFDiscountListId(String FDiscountListId) {
		jsonstr.addData("FDiscountListId", new JSONObject().put("FNumber",FDiscountListId));
	}

	/**
	 * ����ʱ��(������)
	 * @param FPriceTimePoint
	 */
	public void setFPriceTimePoint(String FPriceTimePoint) {
		jsonstr.addData("FPriceTimePoint", FPriceTimePoint);
	}

	/**
	 * ����֧����ʽ
	 * @param FSettleModeId
	 */
	public void setFSettleModeId(String FSettleModeId) {
		jsonstr.addData("FSettleModeId", new JSONObject().put("FNumber",FSettleModeId));
	}

	/**
	 * ��˰
	 * @param FIsIncludedTax
	 */
	public void setFIsIncludedTax(boolean FIsIncludedTax) {
		jsonstr.addData("FIsIncludedTax", FIsIncludedTax);
	}

	/**
	 * ��λ��
	 * @param FLocalCurrId
	 */
	public void setFLocalCurrId(String FLocalCurrId) {
		jsonstr.addData("FLocalCurrId", new JSONObject().put("FNumber",FLocalCurrId));
	}
}
