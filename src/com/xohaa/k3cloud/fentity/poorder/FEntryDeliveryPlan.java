package com.xohaa.k3cloud.fentity.poorder;
import com.xohaa.k3cloud.fentity.EntryData;
/**
 * �����ƻ�
 * @author Administrator
 */
public class FEntryDeliveryPlan extends EntryData {
	public FEntryDeliveryPlan(){
		super();
	}
	/**
	 * 
	 * @param FDetailId
	 */
	public void setFDetailId(String FDetailId) {
		jsonstr.addData("FDetailId",FDetailId);
	}

	/**
	 * ��������
	 * @param FDeliveryDate_Plan
	 */
	public void setFDeliveryDate_Plan(String FDeliveryDate_Plan) {
		jsonstr.addData("FDeliveryDate_Plan",FDeliveryDate_Plan);
	}

	/**
	 * ����
	 * @param FPlanQty
	 */
	public void setFPlanQty(double FPlanQty) {
		jsonstr.addData("FPlanQty",FPlanQty);
	}

	/**
	 * �����ص�
	 * @param FELocation
	 */
	public void setFELocation(String FELocation) {
		jsonstr.addData("FELocation",FELocation);
	}

	/**
	 * ������ַ
	 * @param FELocationAddress
	 */
	public void setFELocationAddress(String FELocationAddress) {
		jsonstr.addData("FELocationAddress",FELocationAddress);
	}

	/**
	 * ��Ӧ�̷�������
	 * @param FSUPPLIERDELIVERYDATE
	 */
	public void setFSUPPLIERDELIVERYDATE(String FSUPPLIERDELIVERYDATE) {
		jsonstr.addData("FSUPPLIERDELIVERYDATE",FSUPPLIERDELIVERYDATE);
	}

	/**
	 * Ԥ�Ƶ�������
	 * @param FPREARRIVALDATE
	 */
	public void setFPREARRIVALDATE(String FPREARRIVALDATE) {
		jsonstr.addData("FPREARRIVALDATE",FPREARRIVALDATE);
	}

	/**
	 * ������ǰ��
	 * @param FTRLT
	 */
	public void setFTRLT(String FTRLT) {
		jsonstr.addData("FTRLT",FTRLT);
	}

	/**
	 * ȷ�Ͻ�������
	 * @param FConfirmDeliQty
	 */
	public void setFConfirmDeliQty(double FConfirmDeliQty) {
		jsonstr.addData("FConfirmDeliQty",FConfirmDeliQty);
	}

	/**
	 * ȷ�Ͻ�������
	 * @param FConfirmDeliDate
	 */
	public void setFConfirmDeliDate(String FConfirmDeliDate) {
		jsonstr.addData("FConfirmDeliDate",FConfirmDeliDate);
	}

	/**
	 * ȷ�����
	 * @param FConfirmInfo
	 */
	public void setFConfirmInfo(String FConfirmInfo) {
		jsonstr.addData("FConfirmInfo",FConfirmInfo);
	}

	/**
	 * �����ص�
	 * @param FELocationId
	 */
	public void setFELocationId(String FELocationId) {
		jsonstr.addFNumberData("FELocationId", FELocationId);
	}
}
