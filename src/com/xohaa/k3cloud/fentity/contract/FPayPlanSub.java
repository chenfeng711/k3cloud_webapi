package com.xohaa.k3cloud.fentity.contract;
import com.xohaa.k3cloud.fentity.EntryData;
/**
 * 
 * @author Administrator
 *
 */
public class FPayPlanSub  extends EntryData{
	public FPayPlanSub(){
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
	 * �������
	 * @param FPAYBILLID
	 */
	public void setFPAYBILLID(String FPAYBILLID) {
		jsonstr.addData("FPAYBILLID",FPAYBILLID);
	}

	/**
	 * �����¼����
	 * @param FPAYBILLENTRYID
	 */
	public void setFPAYBILLENTRYID(String FPAYBILLENTRYID){
		jsonstr.addData("FPAYBILLENTRYID",FPAYBILLENTRYID);
	}

	/**
	 * �ɹ���ͬ����
	 * @param FContractId
	 */
	public void setFContractId(String FContractId) {
		jsonstr.addData("FContractId",FContractId);
	}

	/**
	 * ʵ��Ԥ�����
	 * @param FACTUALSUBAMOUNT
	 */
	public void setFACTUALSUBAMOUNT(double FACTUALSUBAMOUNT) {
		jsonstr.addData("FACTUALSUBAMOUNT",FACTUALSUBAMOUNT);
	}

	/**
	 * Ԥ������
	 * @param FPRESUBAMOUNT
	 */
	public void setFPRESUBAMOUNT(double FPRESUBAMOUNT) {
		jsonstr.addData("FPRESUBAMOUNT",FPRESUBAMOUNT);
	}
}