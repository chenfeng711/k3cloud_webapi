package com.xohaa.k3cloud.fentity.cust;

import com.xohaa.k3cloud.fentity.EntryData;
public class FT_BD_CUSTLOCATION  extends EntryData{
	public FT_BD_CUSTLOCATION(){
		super();
	}

	/**
	 * ��ϵ�˱���
	 * @param FContactId
	 */
	public void setFContactId(String FContactId){
		jsonstr.addFNumberData("FContactId", FContactId);
	}

	/**
	 * Ĭ���ջ���ַ
	 * @param FIsDefaultConsigneeCT
	 */
	public void setFIsDefaultConsigneeCT(boolean FIsDefaultConsigneeCT){
		jsonstr.addData("FIsDefaultConsigneeCT", FIsDefaultConsigneeCT);
	}
}
