package com.xohaa.k3cloud.fentity.cust;

import com.xohaa.k3cloud.fentity.EntryData;
public class FT_BD_CUSTLOCATION  extends EntryData{
	public FT_BD_CUSTLOCATION(){
		super();
	}

	/**
	 * 联系人编码
	 * @param FContactId
	 */
	public void setFContactId(String FContactId){
		jsonstr.addFNumberData("FContactId", FContactId);
	}

	/**
	 * 默认收货地址
	 * @param FIsDefaultConsigneeCT
	 */
	public void setFIsDefaultConsigneeCT(boolean FIsDefaultConsigneeCT){
		jsonstr.addData("FIsDefaultConsigneeCT", FIsDefaultConsigneeCT);
	}
}
