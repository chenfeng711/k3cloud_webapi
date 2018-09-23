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
	 * 地点编码
	 * @param FNUMBER1
	 */
	public void setFNUMBER1(String FNUMBER1){
		jsonstr.addData("FNUMBER1", FNUMBER1);
	}

	/**
	 * 地点名称
	 * @param FNAME1
	 */
	public void setFNAME1(String FNAME1){
		jsonstr.addData("FNAME1", FNAME1);
	}

	/**
	 * 详细地址
	 * @param FADDRESS1
	 */
	public void setFADDRESS1(String FADDRESS1){
		jsonstr.addData("FADDRESS1", FADDRESS1);
	}

	/**
	 * 运输提前期
	 * @param FTRANSLEADTIME1
	 */
	public void setFTRANSLEADTIME1(String FTRANSLEADTIME1){
		jsonstr.addData("FTRANSLEADTIME1", FTRANSLEADTIME1);
	}

	/**
	 * 移动电话
	 * @param FMOBILE
	 */
	public void setFMOBILE(String FMOBILE){
		jsonstr.addData("FMOBILE", FMOBILE);
	}

	/**
	 * 默认收货地址
	 * @param FIsDefaultConsignee
	 */
	public void setFIsDefaultConsignee(boolean FIsDefaultConsignee){
		jsonstr.addData("FIsDefaultConsignee", FIsDefaultConsignee);
	}

	/**
	 * 默认开票地址
	 * @param FIsDefaultSettle
	 */
	public void setFIsDefaultSettle(boolean FIsDefaultSettle){
		jsonstr.addData("FIsDefaultSettle", FIsDefaultSettle);
	}

	/**
	 * 默认付款地址
	 * @param FIsDefaultPayer
	 */
	public void setFIsDefaultPayer(boolean FIsDefaultPayer){
		jsonstr.addData("FIsDefaultPayer", FIsDefaultPayer);
	}

	/**
	 * 启用
	 * @param FIsUsed
	 */
	public void setFIsUsed(boolean FIsUsed){
		jsonstr.addData("FIsUsed", FIsUsed);
	}
}
