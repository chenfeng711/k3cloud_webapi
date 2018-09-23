package com.xohaa.k3cloud.fentity.contract;

import com.xohaa.k3cloud.fentity.EntryData;
public class FContractEntryTax  extends EntryData{
	public FContractEntryTax(){
		super();
	}
	/**
	 * 
	 * @param FDetailID
	 */
	public void setFDetailID(String FDetailID){
		jsonstr.addData("FDetailID",FDetailID);
	}

	/**
	 * 税率名称
	 * @param FTaxRateId
	 */
	public void setFTaxRateId(String FTaxRateId){
		jsonstr.addFNumberData("FTaxRateId",FTaxRateId);
	}

	/**
	 * 税率%
	 * @param FTaxRate
	 */
	public void setFTaxRate(double FTaxRate){
		jsonstr.addData("FTaxRate",FTaxRate);
	}
}
