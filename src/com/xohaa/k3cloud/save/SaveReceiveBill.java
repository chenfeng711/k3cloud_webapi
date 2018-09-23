package com.xohaa.k3cloud.save;
import com.xohaa.k3cloud.FormID;
import com.xohaa.k3cloud.fentity.bill.FDetailEntity;
import com.xohaa.k3cloud.fentity.bill.FinanceEntity;
import com.xohaa.k3cloud.webapi.Save;
/**
 * 收料单 
 * @author Administrator
 *
 */
public class SaveReceiveBill extends Save{
	public SaveReceiveBill() throws Exception{
		super(FormID.ReceiveBill);
	}
	/**
	 * 
	 * @param FID
	 */
	public void setFID(String FID) {
		this.setModelData("FID", FID);
	}

	/**
	 * 单据类型(必填项)
	 * @param FBillTypeID
	 */
	public void setFBillTypeID(String FBillTypeID) {
		this.setModelFNumberData("FBillTypeID", FBillTypeID);
	}

	/**
	 * 单据编号
	 * @param FBillNo
	 */
	public void setFBillNo(String FBillNo) {
		this.setModelData("FBillNo", FBillNo);
	}

	/**
	 * 收料日期(必填项)
	 * @param FDate
	 */
	public void setFDate(String FDate) {
		this.setModelData("FDate", FDate);
	}

	/**
	 * 收料组织(必填项)
	 * @param FStockOrgId
	 */
	public void setFStockOrgId(String FStockOrgId) {
		this.setModelFNumberData("FStockOrgId", FStockOrgId);
	}

	/**
	 * 收料部门
	 * @param FReceiveDeptId
	 */
	public void setFReceiveDeptId(String FReceiveDeptId) {
		this.setModelFNumberData("FReceiveDeptId", FReceiveDeptId);
	}

	/**
	 * 库存组
	 * @param FStockGroupId
	 */
	public void setFStockGroupId(String FStockGroupId) {
		this.setModelFNumberData("FStockGroupId", FStockGroupId);
	}

	/**
	 * 收料员
	 * @param FReceiverId
	 */
	public void setFReceiverId(String FReceiverId) {
		this.setModelFNumberData("FReceiverId", FReceiverId);
	}

	/**
	 * 需求组织
	 * @param FDemandOrgId
	 */
	public void setFDemandOrgId(String FDemandOrgId) {
		this.setModelFNumberData("FDemandOrgId", FDemandOrgId);
	}

	/**
	 * 采购组织(必填项)
	 * @param FPurOrgId
	 */
	public void setFPurOrgId(String FPurOrgId) {
		this.setModelFNumberData("FPurOrgId", FPurOrgId);
	}

	/**
	 * 对应组织
	 * @param FCorrespondOrgId
	 */
	public void setFCorrespondOrgId(String FCorrespondOrgId) {
		this.setModelFNumberData("FCorrespondOrgId", FCorrespondOrgId);
	}

	/**
	 * 采购部门
	 * @param FPurDeptId
	 */
	public void setFPurDeptId(String FPurDeptId) {
		this.setModelFNumberData("FPurDeptId", FPurDeptId);
	}

	/**
	 * 采购组织(必填项)
	 * @param FPurGroupId
	 */
	public void setFPurGroupId(String FPurGroupId) {
		this.setModelFNumberData("FPurGroupId", FPurGroupId);
	}

	/**
	 * 采购员
	 * @param FPurchaserId
	 */
	public void setFPurchaserId(String FPurchaserId) {
		this.setModelFNumberData("FPurchaserId", FPurchaserId);
	}

	/**
	 * 供应商(必填项)
	 * @param FSupplierId
	 */
	public void setFSupplierId(String FSupplierId) {
		this.setModelFNumberData("FSupplierId", FSupplierId);
	}

	/**
	 * 备注
	 * @param FNote
	 */
	public void setFNote(String FNote) {
		this.setModelData("FNote", FNote);
	}

	/**
	 * 供货方
	 * @param FSupplyId
	 */
	public void setFSupplyId(String FSupplyId) {
		this.setModelFNumberData("FSupplyId", FSupplyId);
	}

	/**
	 * 供货方地址
	 * @param FSupplyAddress
	 */
	public void setFSupplyAddress(String FSupplyAddress) {
		this.setModelData("FSupplyAddress", FSupplyAddress);
	}

	/**
	 * 结算方
	 * @param FSettleId
	 */
	public void setFSettleId(String FSettleId) {
		this.setModelFNumberData("FSettleId", FSettleId);
	}

	/**
	 * 收款方
	 * @param FChargeId
	 */
	public void setFChargeId(String FChargeId) {
		this.setModelFNumberData("FChargeId", FChargeId);
	}

	/**
	 * 货主类型(必填项)
	 * @param FOwnerTypeIdHead
	 */
	public void setFOwnerTypeIdHead(String FOwnerTypeIdHead) {
		this.setModelData("FOwnerTypeIdHead", FOwnerTypeIdHead);
	}

	/**
	 * 货主(必填项)
	 * @param FOwnerIdHead
	 */
	public void setFOwnerIdHead(String FOwnerIdHead) {
		this.setModelFNumberData("FOwnerIdHead", FOwnerIdHead);
	}

	/**
	 * 确认人
	 * @param FConfirmerId
	 */
	public void setFConfirmerId(String FConfirmerId) {
		this.setModelFNumberData("FConfirmerId", FConfirmerId);
	}

	/**
	 * 确认日期
	 * @param FConfirmDate
	 */
	public void setFConfirmDate(String FConfirmDate) {
		this.setModelData("FConfirmDate", FConfirmDate);
	}

	/**
	 * 外部单据
	 * @param FIsInsideBill
	 */
	public void setFIsInsideBill(boolean FIsInsideBill) {
		this.setModelData("FIsInsideBill", FIsInsideBill);
	}

	/**
	 * 来自移动
	 * @param FIsMobile
	 */
	public void setFIsMobile(boolean FIsMobile) {
		this.setModelData("FIsMobile", FIsMobile);
	}

	/**
	 * 序列号上传
	 * @param FScanBox
	 */
	public void setFScanBox(String FScanBox) {
		this.setModelData("FScanBox", FScanBox);
	}

	/**
	 * 供货方联系人
	 * @param FProviderContactId
	 */
	public void setFProviderContactId(String FProviderContactId) {
		StringBuffer tem = new StringBuffer(40);
		tem.append("{\"FCONTACTNUMBER\":\"").append(FProviderContactId).append("\"}");
		this.setModelData("FProviderContactId", tem);
		
	}

	/**
	 * 项目名称
	 * @param F_PAEZ_Assistant
	 */
	public void setF_PAEZ_Assistant(String F_PAEZ_Assistant) {
		this.setModelFNumberData("F_PAEZ_Assistant", F_PAEZ_Assistant);
	}

	/**
	 * 项目编号
	 * @param F_PAEZ_Text
	 */
	public void setF_PAEZ_Text(String F_PAEZ_Text) {
		this.setModelData("F_PAEZ_Text", F_PAEZ_Text);
	}

	/**
	 * 财务信息
	 * @param FinanceEntity
	 */
	public void setFinanceEntity(FinanceEntity FinanceEntity) {
		this.setModelData("FinanceEntity", FinanceEntity.getJSONObjectStr());
	}

	/**
	 * 行项目
	 * @param FDetailEntity
	 */
	public void setFDetailEntity(FDetailEntity FDetailEntity) {
		this.setModelData("FDetailEntity", FDetailEntity.getArrayListStr());
	}
	
}