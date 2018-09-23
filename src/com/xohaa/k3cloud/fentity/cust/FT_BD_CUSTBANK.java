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
	 * ��������
	 * @param FCOUNTRY1
	 */
	public void setFCOUNTRY1(String FCOUNTRY1){
		jsonstr.addFNumberData("FCOUNTRY1", FCOUNTRY1);
	}
	/**
	 * ��������
	 * @param FOPENBANKNAME
	 */
	public void setFOPENBANKNAME(String FOPENBANKNAME){
		jsonstr.addData("FOPENBANKNAME", FOPENBANKNAME);
	}

	/**
	 * �����˺�
	 * @param FBANKCODE
	 */
	public void setFBANKCODE(String FBANKCODE){
		jsonstr.addData("FBANKCODE", FBANKCODE);
	}

	/**
	 * �˻�����
	 * @param FACCOUNTNAME
	 */
	public void setFACCOUNTNAME(String FACCOUNTNAME){
		jsonstr.addData("FACCOUNTNAME", FACCOUNTNAME);
	}

	/**
	 * �տ�����
	 * @param FBankTypeRec
	 */
	public void setFBankTypeRec(String FBankTypeRec){
		jsonstr.addFNumberData("FBankTypeRec", FBankTypeRec);
	}

	/**
	 * �����е�ַ
	 * @param FOpenAddressRec
	 */
	public void setFOpenAddressRec(String FOpenAddressRec){
		jsonstr.addData("FOpenAddressRec", FOpenAddressRec);
	}

	/**
	 * ���к�
	 * @param FCNAPS
	 */
	public void setFCNAPS(String FCNAPS){
		jsonstr.addData("FCNAPS", FCNAPS);
	}

	/**
	 * �ұ�
	 * @param FCURRENCYID
	 */
	public void setFCURRENCYID(String FCURRENCYID){
		jsonstr.addFNumberData("FCURRENCYID",FCURRENCYID);
	}

	/**
	 * Ĭ��
	 * @param FISDEFAULT1
	 */
	public void setFISDEFAULT1(boolean FISDEFAULT1){
		jsonstr.addData("FISDEFAULT1", FISDEFAULT1);
	}
}
