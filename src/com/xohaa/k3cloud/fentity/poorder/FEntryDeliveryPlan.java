package com.xohaa.k3cloud.fentity.poorder;
import com.xohaa.k3cloud.fentity.EntryData;
/**
 * 交货计划
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
	 * 交货日期
	 * @param FDeliveryDate_Plan
	 */
	public void setFDeliveryDate_Plan(String FDeliveryDate_Plan) {
		jsonstr.addData("FDeliveryDate_Plan",FDeliveryDate_Plan);
	}

	/**
	 * 数量
	 * @param FPlanQty
	 */
	public void setFPlanQty(double FPlanQty) {
		jsonstr.addData("FPlanQty",FPlanQty);
	}

	/**
	 * 交货地点
	 * @param FELocation
	 */
	public void setFELocation(String FELocation) {
		jsonstr.addData("FELocation",FELocation);
	}

	/**
	 * 交货地址
	 * @param FELocationAddress
	 */
	public void setFELocationAddress(String FELocationAddress) {
		jsonstr.addData("FELocationAddress",FELocationAddress);
	}

	/**
	 * 供应商发货日期
	 * @param FSUPPLIERDELIVERYDATE
	 */
	public void setFSUPPLIERDELIVERYDATE(String FSUPPLIERDELIVERYDATE) {
		jsonstr.addData("FSUPPLIERDELIVERYDATE",FSUPPLIERDELIVERYDATE);
	}

	/**
	 * 预计到货日期
	 * @param FPREARRIVALDATE
	 */
	public void setFPREARRIVALDATE(String FPREARRIVALDATE) {
		jsonstr.addData("FPREARRIVALDATE",FPREARRIVALDATE);
	}

	/**
	 * 运输提前期
	 * @param FTRLT
	 */
	public void setFTRLT(String FTRLT) {
		jsonstr.addData("FTRLT",FTRLT);
	}

	/**
	 * 确认交货数量
	 * @param FConfirmDeliQty
	 */
	public void setFConfirmDeliQty(double FConfirmDeliQty) {
		jsonstr.addData("FConfirmDeliQty",FConfirmDeliQty);
	}

	/**
	 * 确认交货日期
	 * @param FConfirmDeliDate
	 */
	public void setFConfirmDeliDate(String FConfirmDeliDate) {
		jsonstr.addData("FConfirmDeliDate",FConfirmDeliDate);
	}

	/**
	 * 确认意见
	 * @param FConfirmInfo
	 */
	public void setFConfirmInfo(String FConfirmInfo) {
		jsonstr.addData("FConfirmInfo",FConfirmInfo);
	}

	/**
	 * 交货地点
	 * @param FELocationId
	 */
	public void setFELocationId(String FELocationId) {
		jsonstr.addFNumberData("FELocationId", FELocationId);
	}
}
