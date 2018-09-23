package com.xohaa.k3cloud.save;
import com.xohaa.k3cloud.FormID;
import com.xohaa.k3cloud.fentity.bill.FDetailEntity;
import com.xohaa.k3cloud.fentity.bill.FinanceEntity;
import com.xohaa.k3cloud.webapi.Save;
/**
 * ���ϵ� 
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
	 * ��������(������)
	 * @param FBillTypeID
	 */
	public void setFBillTypeID(String FBillTypeID) {
		this.setModelFNumberData("FBillTypeID", FBillTypeID);
	}

	/**
	 * ���ݱ��
	 * @param FBillNo
	 */
	public void setFBillNo(String FBillNo) {
		this.setModelData("FBillNo", FBillNo);
	}

	/**
	 * ��������(������)
	 * @param FDate
	 */
	public void setFDate(String FDate) {
		this.setModelData("FDate", FDate);
	}

	/**
	 * ������֯(������)
	 * @param FStockOrgId
	 */
	public void setFStockOrgId(String FStockOrgId) {
		this.setModelFNumberData("FStockOrgId", FStockOrgId);
	}

	/**
	 * ���ϲ���
	 * @param FReceiveDeptId
	 */
	public void setFReceiveDeptId(String FReceiveDeptId) {
		this.setModelFNumberData("FReceiveDeptId", FReceiveDeptId);
	}

	/**
	 * �����
	 * @param FStockGroupId
	 */
	public void setFStockGroupId(String FStockGroupId) {
		this.setModelFNumberData("FStockGroupId", FStockGroupId);
	}

	/**
	 * ����Ա
	 * @param FReceiverId
	 */
	public void setFReceiverId(String FReceiverId) {
		this.setModelFNumberData("FReceiverId", FReceiverId);
	}

	/**
	 * ������֯
	 * @param FDemandOrgId
	 */
	public void setFDemandOrgId(String FDemandOrgId) {
		this.setModelFNumberData("FDemandOrgId", FDemandOrgId);
	}

	/**
	 * �ɹ���֯(������)
	 * @param FPurOrgId
	 */
	public void setFPurOrgId(String FPurOrgId) {
		this.setModelFNumberData("FPurOrgId", FPurOrgId);
	}

	/**
	 * ��Ӧ��֯
	 * @param FCorrespondOrgId
	 */
	public void setFCorrespondOrgId(String FCorrespondOrgId) {
		this.setModelFNumberData("FCorrespondOrgId", FCorrespondOrgId);
	}

	/**
	 * �ɹ�����
	 * @param FPurDeptId
	 */
	public void setFPurDeptId(String FPurDeptId) {
		this.setModelFNumberData("FPurDeptId", FPurDeptId);
	}

	/**
	 * �ɹ���֯(������)
	 * @param FPurGroupId
	 */
	public void setFPurGroupId(String FPurGroupId) {
		this.setModelFNumberData("FPurGroupId", FPurGroupId);
	}

	/**
	 * �ɹ�Ա
	 * @param FPurchaserId
	 */
	public void setFPurchaserId(String FPurchaserId) {
		this.setModelFNumberData("FPurchaserId", FPurchaserId);
	}

	/**
	 * ��Ӧ��(������)
	 * @param FSupplierId
	 */
	public void setFSupplierId(String FSupplierId) {
		this.setModelFNumberData("FSupplierId", FSupplierId);
	}

	/**
	 * ��ע
	 * @param FNote
	 */
	public void setFNote(String FNote) {
		this.setModelData("FNote", FNote);
	}

	/**
	 * ������
	 * @param FSupplyId
	 */
	public void setFSupplyId(String FSupplyId) {
		this.setModelFNumberData("FSupplyId", FSupplyId);
	}

	/**
	 * ��������ַ
	 * @param FSupplyAddress
	 */
	public void setFSupplyAddress(String FSupplyAddress) {
		this.setModelData("FSupplyAddress", FSupplyAddress);
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
	 * ��������(������)
	 * @param FOwnerTypeIdHead
	 */
	public void setFOwnerTypeIdHead(String FOwnerTypeIdHead) {
		this.setModelData("FOwnerTypeIdHead", FOwnerTypeIdHead);
	}

	/**
	 * ����(������)
	 * @param FOwnerIdHead
	 */
	public void setFOwnerIdHead(String FOwnerIdHead) {
		this.setModelFNumberData("FOwnerIdHead", FOwnerIdHead);
	}

	/**
	 * ȷ����
	 * @param FConfirmerId
	 */
	public void setFConfirmerId(String FConfirmerId) {
		this.setModelFNumberData("FConfirmerId", FConfirmerId);
	}

	/**
	 * ȷ������
	 * @param FConfirmDate
	 */
	public void setFConfirmDate(String FConfirmDate) {
		this.setModelData("FConfirmDate", FConfirmDate);
	}

	/**
	 * �ⲿ����
	 * @param FIsInsideBill
	 */
	public void setFIsInsideBill(boolean FIsInsideBill) {
		this.setModelData("FIsInsideBill", FIsInsideBill);
	}

	/**
	 * �����ƶ�
	 * @param FIsMobile
	 */
	public void setFIsMobile(boolean FIsMobile) {
		this.setModelData("FIsMobile", FIsMobile);
	}

	/**
	 * ���к��ϴ�
	 * @param FScanBox
	 */
	public void setFScanBox(String FScanBox) {
		this.setModelData("FScanBox", FScanBox);
	}

	/**
	 * ��������ϵ��
	 * @param FProviderContactId
	 */
	public void setFProviderContactId(String FProviderContactId) {
		StringBuffer tem = new StringBuffer(40);
		tem.append("{\"FCONTACTNUMBER\":\"").append(FProviderContactId).append("\"}");
		this.setModelData("FProviderContactId", tem);
		
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
	 * ������Ϣ
	 * @param FinanceEntity
	 */
	public void setFinanceEntity(FinanceEntity FinanceEntity) {
		this.setModelData("FinanceEntity", FinanceEntity.getJSONObjectStr());
	}

	/**
	 * ����Ŀ
	 * @param FDetailEntity
	 */
	public void setFDetailEntity(FDetailEntity FDetailEntity) {
		this.setModelData("FDetailEntity", FDetailEntity.getArrayListStr());
	}
	
}