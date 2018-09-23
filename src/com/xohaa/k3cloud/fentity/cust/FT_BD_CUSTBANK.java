package com.xohaa.k3cloud.fentity.cust;

import com.xohaa.k3cloud.fentity.EntryData;
public class FT_BD_CUSTBANK  extends EntryData{
	public FT_BD_CUSTBANK(){
		super();
	}
	/**
	 * 
	 * @param FENTRYID
	 */
	public void setFENTRYID(String FENTRYID){
		jsonstr.addData("FENTRYID", FENTRYID);
	}
	/**
	 * 开户国家
	 * @param FCOUNTRY1
	 */
	public void setFCOUNTRY1(String FCOUNTRY1){
		jsonstr.addFNumberData("FCOUNTRY1", FCOUNTRY1);
	}
	/**
	 * 开户银行
	 * @param FOPENBANKNAME
	 */
	public void setFOPENBANKNAME(String FOPENBANKNAME){
		jsonstr.addData("FOPENBANKNAME", FOPENBANKNAME);
	}

	/**
	 * 银行账号
	 * @param FBANKCODE
	 */
	public void setFBANKCODE(String FBANKCODE){
		jsonstr.addData("FBANKCODE", FBANKCODE);
	}

	/**
	 * 账户名称
	 * @param FACCOUNTNAME
	 */
	public void setFACCOUNTNAME(String FACCOUNTNAME){
		jsonstr.addData("FACCOUNTNAME", FACCOUNTNAME);
	}

	/**
	 * 收款银行
	 * @param FBankTypeRec
	 */
	public void setFBankTypeRec(String FBankTypeRec){
		jsonstr.addFNumberData("FBankTypeRec", FBankTypeRec);
	}

	/**
	 * 开户行地址
	 * @param FOpenAddressRec
	 */
	public void setFOpenAddressRec(String FOpenAddressRec){
		jsonstr.addData("FOpenAddressRec", FOpenAddressRec);
	}

	/**
	 * 联行号
	 * @param FCNAPS
	 */
	public void setFCNAPS(String FCNAPS){
		jsonstr.addData("FCNAPS", FCNAPS);
	}

	/**
	 * 币别
	 * @param FCURRENCYID
	 */
	public void setFCURRENCYID(String FCURRENCYID){
		jsonstr.addFNumberData("FCURRENCYID",FCURRENCYID);
	}

	/**
	 * 默认
	 * @param FISDEFAULT1
	 */
	public void setFISDEFAULT1(boolean FISDEFAULT1){
		jsonstr.addData("FISDEFAULT1", FISDEFAULT1);
	}
}
