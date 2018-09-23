package com.xohaa.k3cloud.fentity.cust;
import com.xohaa.k3cloud.fentity.EntryData;
public class FT_BD_CUSTOMEREXT  extends EntryData{
	public FT_BD_CUSTOMEREXT(){
		super();
	}

	/**
	 * 启用商联在线
	 * @param FEnableSL
	 */
	public void setFEnableSL(boolean FEnableSL){
		jsonstr.addData("FEnableSL", FEnableSL);
	}
	/**
	 * 冻结范围
	 * @param FFreezeLimit
	 */
	public void setFFreezeLimit(String FFreezeLimit) {
		jsonstr.addData("FFreezeLimit", FFreezeLimit);
	}

	/**
	 * 冻结人
	 * @param FFreezeOperator
	 */
	public void setFFreezeOperator(String FFreezeOperator) {
		jsonstr.addData("FFreezeOperator", new StringBuffer(20).append("{\"FUserID\":\"")
				.append(FFreezeOperator).append("\"}"));
	}
	/**
	 * 冻结日期
	 * @param FFreezeDate
	 */
	public void setFFreezeDate(String FFreezeDate){
		jsonstr.addData("FFreezeDate", FFreezeDate);
	}
	/**
	 * 省份
	 * @param FPROVINCE
	 */
	public void setFPROVINCE(String FPROVINCE) {
		jsonstr.addFNumberData("FPROVINCE", FPROVINCE);
	}

	/**
	 * 城市
	 * @param FCITY
	 */
	public void setFCITY(String FCITY) {
		jsonstr.addFNumberData("FCITY",FCITY);
	}

	/**
	 * 默认收货地点
	 * @param FDefaultConsiLoc
	 */
	public void setFDefaultConsiLoc(String FDefaultConsiLoc) {
		jsonstr.addData("FDefaultConsiLoc", new StringBuffer(20).append("{\"FNUMBER\":\"")
				.append(FDefaultConsiLoc).append("\"}"));
	}
	/**
	 * 默认开票地点
	 * @param FDefaultSettleLoc
	 */
	public void setFDefaultSettleLoc(String FDefaultSettleLoc) {
		jsonstr.addData("FDefaultSettleLoc", new StringBuffer(20).append("{\"FNUMBER\":\"")
				.append(FDefaultSettleLoc).append("\"}"));
	}
	/**
	 * 默认付款地点
	 * @param FDefaultPayerLoc
	 */
	public void setFDefaultPayerLoc(String FDefaultPayerLoc){
		jsonstr.addData("FDefaultPayerLoc", new StringBuffer(20).append("{\"FNUMBER\":\"")
				.append(FDefaultPayerLoc).append("\"}"));
	}

	/**
	 * 默认联系人
	 * @param FDefaultContact
	 */
	public void setFDefaultContact(String FDefaultContact) {
		jsonstr.addFNumberData("FDefaultContact",FDefaultContact);
	}
	/**
	 * 保证金比例（%）
	 * @param FMarginLevel
	 */
	public void setFMarginLevel(double FMarginLevel){
		jsonstr.addData("FMarginLevel", FMarginLevel);
	}
	/**
	 * 结算卡
	 * @param FDebitCard
	 */
	public void setFDebitCard(String FDebitCard) {
		jsonstr.addData("FDebitCard", FDebitCard);
	}
}
