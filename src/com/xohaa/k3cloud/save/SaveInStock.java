package com.xohaa.k3cloud.save;
import com.xohaa.k3cloud.FormID;
import com.xohaa.k3cloud.fentity.finstock.FInStockEntry;
import com.xohaa.k3cloud.fentity.finstock.FInStockFin;
import com.xohaa.k3cloud.webapi.Save;

public class SaveInStock extends Save {
	public SaveInStock(){
		super(FormID.InStock);
	}

	/**
	 * 
	 * @param FID
	 */
	public void setFID(String FID) {
		this.setModelData("FID",FID);
	}

	/**
	 * 单据类型(必填项)
	 * @param FBillTypeID
	 */
	public void setFBillTypeID(String FBillTypeID) {
		this.setModelFNumberData("FBillTypeID",FBillTypeID);
	}

	/**
	 * 单据编号
	 * @param FBillNo
	 */
	public void setFBillNo(String FBillNo) {
		this.setModelData("FBillNo",FBillNo);
	}

	/**
	 * 收货日期(必填项)
	 * @param FDate
	 */
	public void setFDate(String FDate) {
		this.setModelData("FDate",FDate);
	}

	/**
	 * 收料组织(必填项)
	 * @param FStockOrgId
	 */
	public void setFStockOrgId(String FStockOrgId) {
		this.setModelFNumberData("FStockOrgId",FStockOrgId);
	}

	/**
	 * 收料部门
	 * @param FStockDeptId
	 */
	public void setFStockDeptId(String FStockDeptId) {
		this.setModelFNumberData("FStockDeptId",FStockDeptId);
	}

	/**
	 * 库存组
	 * @param FStockerGroupId
	 */
	public void setFStockerGroupId(String FStockerGroupId) {
		this.setModelFNumberData("FStockerGroupId",FStockerGroupId);
	}

	/**
	 * 仓管员
	 * @param FStockerId
	 */
	public void setFStockerId(String FStockerId) {
		this.setModelFNumberData("FStockerId",FStockerId);
	}

	/**
	 * 需求组织
	 * @param FDemandOrgId
	 */
	public void setFDemandOrgId(String FDemandOrgId) {
		this.setModelFNumberData("FDemandOrgId",FDemandOrgId);
	}

	/**
	 * 采购组织(必填项)
	 * @param FPurchaseOrgId
	 */
	public void setFPurchaseOrgId(String FPurchaseOrgId) {
		this.setModelFNumberData("FPurchaseOrgId",FPurchaseOrgId);
	}

	/**
	 * 对应组织
	 * @param FCorrespondOrgId
	 */
	public void setFCorrespondOrgId(String FCorrespondOrgId) {
		this.setModelFNumberData("FCorrespondOrgId",FCorrespondOrgId);
	}

	/**
	 * 采购部门
	 * @param FPurchaseDeptId
	 */
	public void setFPurchaseDeptId(String FPurchaseDeptId) {
		this.setModelFNumberData("FPurchaseDeptId",FPurchaseDeptId);
	}

	/**
	 * 采购组
	 * @param FPurchaserGroupId
	 */
	public void setFPurchaserGroupId(String FPurchaserGroupId) {
		this.setModelFNumberData("FPurchaserGroupId",FPurchaserGroupId);
	}

	/**
	 * 采购员
	 * @param FPurchaserId
	 */
	public void setFPurchaserId(String FPurchaserId) {
		this.setModelFNumberData("FPurchaserId",FPurchaserId);
	}

	/**
	 * 供应商(必填项)
	 * @param FSupplierId
	 */
	public void setFSupplierId(String FSupplierId) {
		this.setModelFNumberData("FSupplierId",FSupplierId);
	}

	/**
	 * 供货方
	 * @param FSupplyId
	 */
	public void setFSupplyId(String FSupplyId) {
		this.setModelFNumberData("FSupplyId",FSupplyId);
	}

	/**
	 * 供货方地址
	 * @param FSupplyAddress
	 */
	public void setFSupplyAddress(String FSupplyAddress) {
		this.setModelData("FSupplyAddress",FSupplyAddress);
	}

	/**
	 * 结算方
	 * @param FSettleId
	 */
	public void setFSettleId(String FSettleId) {
		this.setModelFNumberData("FSettleId",FSettleId);
	}

	/**
	 * 收款方
	 * @param FChargeId
	 */
	public void setFChargeId(String FChargeId) {
		this.setModelFNumberData("FChargeId",FChargeId);
	}

	/**
	 * 货主类型(必填项)
	 * @param FOwnerTypeIdHead
	 */
	public void setFOwnerTypeIdHead(String FOwnerTypeIdHead) {
		this.setModelData("FOwnerTypeIdHead",FOwnerTypeIdHead);
	}

	/**
	 * 货主(必填项)
	 * @param FOwnerIdHead
	 */
	public void setFOwnerIdHead(String FOwnerIdHead) {
		this.setModelFNumberData("FOwnerIdHead",FOwnerIdHead);
	}

	/**
	 * 确认人
	 * @param FConfirmerId
	 */
	public void setFConfirmerId(String FConfirmerId) {
		StringBuffer temp = new StringBuffer(40);
		temp.append("{\"FUserID\":\"").append(FConfirmerId).append("\"}");
		this.setModelData("FConfirmerId",temp);
	}

	/**
	 * 确认日期
	 * @param FConfirmDate
	 */
	public void setFConfirmDate(String FConfirmDate) {
		this.setModelData("FConfirmDate",FConfirmDate);
	}

	/**
	 * 序列号上传
	 * @param FScanBox
	 */
	public void setFScanBox(String FScanBox) {
		this.setModelData("FScanBox",FScanBox);
	}

	/**
	 * 创建日期偏移单位
	 * @param FCDateOffsetUnit
	 */
	public void setFCDateOffsetUnit(String FCDateOffsetUnit) {
		this.setModelData("FCDateOffsetUnit",FCDateOffsetUnit);
	}

	/**
	 * 创建日期偏移量
	 * @param FCDateOffsetValue
	 */
	public void setFCDateOffsetValue(String FCDateOffsetValue) {
		this.setModelData("FCDateOffsetValue",FCDateOffsetValue);
	}

	/**
	 * 供货方联系人
	 * @param FProviderContactID
	 */
	public void setFProviderContactID(String FProviderContactID) {
		StringBuffer temp = new StringBuffer(40);
		temp.append("{\"FCONTACTNUMBER\":\"").append(FProviderContactID).append("\"}");
		this.setModelData("FProviderContactID",temp);
	}

	/**
	 * 项目编号
	 * @param F_PAEZ_Text
	 */
	public void setF_PAEZ_Text(String F_PAEZ_Text) {
		this.setModelData("F_PAEZ_Text",F_PAEZ_Text);
	}

	/**
	 * 项目名称
	 * @param F_PAEZ_Assistant
	 */
	public void setF_PAEZ_Assistant(String F_PAEZ_Assistant) {
		this.setModelFNumberData("F_PAEZ_Assistant",F_PAEZ_Assistant);
	}

	/**
	 * 合计金额
	 * @param F_PAEZ_Amount
	 */
	public void setF_PAEZ_Amount(double F_PAEZ_Amount) {
		this.setModelData("F_PAEZ_Amount",F_PAEZ_Amount);
	}
	/**
	 * 客户
	 * @param F_PAEZ_Base
	 */
	public void setF_PAEZ_Baset(String F_PAEZ_Base) {
		this.setModelFNumberData("F_PAEZ_Base", F_PAEZ_Base);
	}
	/**
	 * 
	 * @param FInStockFin
	 */
	public void setFInStockFin(FInStockFin fInStockFin) {
		this.setModelData("FInStockFin",fInStockFin.getJSONObjectStr());
	}

	/**
	 * 
	 * @param FInStockEntry
	 */
	public void setFInStockEntry(FInStockEntry FInStockEntry) {
		this.setModelData("FInStockEntry", FInStockEntry.getArrayListStr());
	}


}