package com.xohaa.k3cloud.save;
import com.xohaa.k3cloud.FormID;
import com.xohaa.k3cloud.fentity.poorder.FIinstallment;
import com.xohaa.k3cloud.fentity.poorder.FPOOrderClause;
import com.xohaa.k3cloud.fentity.poorder.FPOOrderEntry;
import com.xohaa.k3cloud.fentity.poorder.FPOOrderFinance;
import com.xohaa.k3cloud.webapi.Save;
public class SavePurchaseOrder extends Save {
	public SavePurchaseOrder(){
		super(FormID.PURCHASEORDER);
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
	 * 采购订单号
	 * @param FBillNo
	 */
	public void setFBillNo(String FBillNo) {
		this.setModelData("FBillNo", FBillNo);
	}

	/**
	 * 采购日期(必填项)
	 * @param FDate
	 */
	public void setFDate(String FDate) {
		this.setModelData("FDate", FDate);
	}

	/**
	 * 供应商(必填项)
	 * @param FSupplierId
	 */
	public void setFSupplierId(String FSupplierId) {
		this.setModelFNumberData("FSupplierId", FSupplierId);
	}

	/**
	 * 采购组织(必填项)
	 * @param FPurchaseOrgId
	 */
	public void setFPurchaseOrgId(String FPurchaseOrgId) {
		this.setModelFNumberData("FPurchaseOrgId", FPurchaseOrgId);
	}

	/**
	 * 采购部门
	 * @param FPurchaseDeptId
	 */
	public void setFPurchaseDeptId(String FPurchaseDeptId) {
		this.setModelFNumberData("FPurchaseDeptId", FPurchaseDeptId);
	}

	/**
	 * 采购组
	 * @param FPurchaserGroupId
	 */
	public void setFPurchaserGroupId(String FPurchaserGroupId) {
		this.setModelFNumberData("FPurchaserGroupId", FPurchaserGroupId);
	}

	/**
	 * 采购员
	 * @param FPurchaserId
	 */
	public void setFPurchaserId(String FPurchaserId) {
		this.setModelFNumberData("FPurchaserId", FPurchaserId);
	}

	/**
	 * 供货方
	 * @param FProviderId
	 */
	public void setFProviderId(String FProviderId) {
		this.setModelFNumberData("FProviderId", FProviderId);
	}

	/**
	 * 供货方联系人
	 * @param FProviderContactId
	 * @throws JSONException 
	 */
	public void setFProviderContactId(String FProviderContactId){
		StringBuffer but = new StringBuffer(50);
		but.append("{\"FCONTACTNUMBER\":\"").append(FProviderContactId).append("\"}");
		this.setModelData("FProviderContactId", but);
	}

	/**
	 * 供货方地址
	 * @param FProviderAddress
	 */
	public void setFProviderAddress(String FProviderAddress) {
		this.setModelData("FProviderAddress", FProviderAddress);
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
	 * 确认人
	 * @param FConfirmerId
	 * @throws JSONException 
	 */
	public void setFConfirmerId(String FConfirmerId){
		StringBuffer but = new StringBuffer(50);
		but.append("{\"FUserID\":\"").append(FConfirmerId).append("\"}");
		this.setModelData("FConfirmerId", but);
	}

	/**
	 * 确认日期
	 * @param FConfirmDate
	 */
	public void setFConfirmDate(String FConfirmDate) {
		this.setModelData("FConfirmDate", FConfirmDate);
	}

	/**
	 * 对应组织
	 * @param FCorrespondOrgId
	 */
	public void setFCorrespondOrgId(String FCorrespondOrgId) {
		this.setModelFNumberData("FCorrespondOrgId", FCorrespondOrgId);
	}

	/**
	 * 供货方联系人(旧)
	 * @param FProviderContact
	 */
	public void setFProviderContact(String FProviderContact) {
		this.setModelData("FProviderContact", FProviderContact);
	}

	/**
	 * 修改变更操作
	 * @param FIsModificationOperator
	 */
	public void setFIsModificationOperator(boolean FIsModificationOperator) {
		this.setModelData("FIsModificationOperator", FIsModificationOperator);
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
	 * 付款 JSONObject
	 * @param FPOOrderFinance
	 * @throws JSONException 
	 */
	public void setFPOOrderFinance(FPOOrderFinance FPOOrderFinance){
		this.setModelData("FPOOrderFinance", FPOOrderFinance.getJSONObjectStr());
	}

	/**
	 * 条款 JSONArray
	 * @param FPOOrderClause
	 */
	public void setFPOOrderClause(FPOOrderClause FPOOrderClause) {
		this.setModelData("FPOOrderClause", FPOOrderClause.getArrayListStr());
	}

	/**
	 * 行项目 JSONArray
	 * @param FPOOrderEntry
	 */
	public void setFPOOrderEntry(FPOOrderEntry FPOOrderEntry) {
		this.setModelData("FPOOrderEntry", FPOOrderEntry.getArrayListStr());
	}

	/**
	 * 
	 * @param FIinstallment
	 */
	public void setFIinstallment(FIinstallment FIinstallment) {
		this.setModelData("FIinstallment", FIinstallment.getArrayListStr());
	}
}