package com.xohaa.k3cloud.fentity.cust;
import com.xohaa.k3cloud.fentity.EntryData;
/**
 * 
 * @author chenjianxiong
 *
 */
public class FT_BD_CUSTCONTACT  extends EntryData{
	public FT_BD_CUSTCONTACT(){
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
	 * �ص����
	 * @param FNUMBER1
	 */
	public void setFNUMBER1(String FNUMBER1){
		jsonstr.addData("FNUMBER1", FNUMBER1);
	}

	/**
	 * �ص�����
	 * @param FNAME1
	 */
	public void setFNAME1(String FNAME1){
		jsonstr.addData("FNAME1", FNAME1);
	}

	/**
	 * ��ϸ��ַ
	 * @param FADDRESS1
	 */
	public void setFADDRESS1(String FADDRESS1){
		jsonstr.addData("FADDRESS1", FADDRESS1);
	}

	/**
	 * ������ǰ��
	 * @param FTRANSLEADTIME1
	 */
	public void setFTRANSLEADTIME1(String FTRANSLEADTIME1){
		jsonstr.addData("FTRANSLEADTIME1", FTRANSLEADTIME1);
	}

	/**
	 * �ƶ��绰
	 * @param FMOBILE
	 */
	public void setFMOBILE(String FMOBILE){
		jsonstr.addData("FMOBILE", FMOBILE);
	}

	/**
	 * Ĭ���ջ���ַ
	 * @param FIsDefaultConsignee
	 */
	public void setFIsDefaultConsignee(boolean FIsDefaultConsignee){
		jsonstr.addData("FIsDefaultConsignee", FIsDefaultConsignee);
	}

	/**
	 * Ĭ�Ͽ�Ʊ��ַ
	 * @param FIsDefaultSettle
	 */
	public void setFIsDefaultSettle(boolean FIsDefaultSettle){
		jsonstr.addData("FIsDefaultSettle", FIsDefaultSettle);
	}

	/**
	 * Ĭ�ϸ����ַ
	 * @param FIsDefaultPayer
	 */
	public void setFIsDefaultPayer(boolean FIsDefaultPayer){
		jsonstr.addData("FIsDefaultPayer", FIsDefaultPayer);
	}

	/**
	 * ����
	 * @param FIsUsed
	 */
	public void setFIsUsed(boolean FIsUsed){
		jsonstr.addData("FIsUsed", FIsUsed);
	}
}
