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
	 * ��������(������)
	 * @param FBillTypeID
	 */
	public void setFBillTypeID(String FBillTypeID) {
		this.setModelFNumberData("FBillTypeID", FBillTypeID);
	}

	/**
	 * �ɹ�������
	 * @param FBillNo
	 */
	public void setFBillNo(String FBillNo) {
		this.setModelData("FBillNo", FBillNo);
	}

	/**
	 * �ɹ�����(������)
	 * @param FDate
	 */
	public void setFDate(String FDate) {
		this.setModelData("FDate", FDate);
	}

	/**
	 * ��Ӧ��(������)
	 * @param FSupplierId
	 */
	public void setFSupplierId(String FSupplierId) {
		this.setModelFNumberData("FSupplierId", FSupplierId);
	}

	/**
	 * �ɹ���֯(������)
	 * @param FPurchaseOrgId
	 */
	public void setFPurchaseOrgId(String FPurchaseOrgId) {
		this.setModelFNumberData("FPurchaseOrgId", FPurchaseOrgId);
	}

	/**
	 * �ɹ�����
	 * @param FPurchaseDeptId
	 */
	public void setFPurchaseDeptId(String FPurchaseDeptId) {
		this.setModelFNumberData("FPurchaseDeptId", FPurchaseDeptId);
	}

	/**
	 * �ɹ���
	 * @param FPurchaserGroupId
	 */
	public void setFPurchaserGroupId(String FPurchaserGroupId) {
		this.setModelFNumberData("FPurchaserGroupId", FPurchaserGroupId);
	}

	/**
	 * �ɹ�Ա
	 * @param FPurchaserId
	 */
	public void setFPurchaserId(String FPurchaserId) {
		this.setModelFNumberData("FPurchaserId", FPurchaserId);
	}

	/**
	 * ������
	 * @param FProviderId
	 */
	public void setFProviderId(String FProviderId) {
		this.setModelFNumberData("FProviderId", FProviderId);
	}

	/**
	 * ��������ϵ��
	 * @param FProviderContactId
	 * @throws JSONException 
	 */
	public void setFProviderContactId(String FProviderContactId){
		StringBuffer but = new StringBuffer(50);
		but.append("{\"FCONTACTNUMBER\":\"").append(FProviderContactId).append("\"}");
		this.setModelData("FProviderContactId", but);
	}

	/**
	 * ��������ַ
	 * @param FProviderAddress
	 */
	public void setFProviderAddress(String FProviderAddress) {
		this.setModelData("FProviderAddress", FProviderAddress);
	}

	/**
	 * ���㷽
	 * @param FSettleId
	 */
	public void setFSettleId(String FSettleId) {
		this.setModelFNumberData("FSettleId", FSettleId);
	}

	/**
	 * �տ
	 * @param FChargeId
	 */
	public void setFChargeId(String FChargeId) {
		this.setModelFNumberData("FChargeId", FChargeId);
	}

	/**
	 * ȷ����
	 * @param FConfirmerId
	 * @throws JSONException 
	 */
	public void setFConfirmerId(String FConfirmerId){
		StringBuffer but = new StringBuffer(50);
		but.append("{\"FUserID\":\"").append(FConfirmerId).append("\"}");
		this.setModelData("FConfirmerId", but);
	}

	/**
	 * ȷ������
	 * @param FConfirmDate
	 */
	public void setFConfirmDate(String FConfirmDate) {
		this.setModelData("FConfirmDate", FConfirmDate);
	}

	/**
	 * ��Ӧ��֯
	 * @param FCorrespondOrgId
	 */
	public void setFCorrespondOrgId(String FCorrespondOrgId) {
		this.setModelFNumberData("FCorrespondOrgId", FCorrespondOrgId);
	}

	/**
	 * ��������ϵ��(��)
	 * @param FProviderContact
	 */
	public void setFProviderContact(String FProviderContact) {
		this.setModelData("FProviderContact", FProviderContact);
	}

	/**
	 * �޸ı������
	 * @param FIsModificationOperator
	 */
	public void setFIsModificationOperator(boolean FIsModificationOperator) {
		this.setModelData("FIsModificationOperator", FIsModificationOperator);
	}

	/**
	 * ��Ŀ����
	 * @param F_PAEZ_Assistant
	 */
	public void setF_PAEZ_Assistant(String F_PAEZ_Assistant) {
		this.setModelFNumberData("F_PAEZ_Assistant", F_PAEZ_Assistant);
	}

	/**
	 * ��Ŀ���
	 * @param F_PAEZ_Text
	 */
	public void setF_PAEZ_Text(String F_PAEZ_Text) {
		this.setModelData("F_PAEZ_Text", F_PAEZ_Text);
	}

	/**
	 * ���� JSONObject
	 * @param FPOOrderFinance
	 * @throws JSONException 
	 */
	public void setFPOOrderFinance(FPOOrderFinance FPOOrderFinance){
		this.setModelData("FPOOrderFinance", FPOOrderFinance.getJSONObjectStr());
	}

	/**
	 * ���� JSONArray
	 * @param FPOOrderClause
	 */
	public void setFPOOrderClause(FPOOrderClause FPOOrderClause) {
		this.setModelData("FPOOrderClause", FPOOrderClause.getArrayListStr());
	}

	/**
	 * ����Ŀ JSONArray
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