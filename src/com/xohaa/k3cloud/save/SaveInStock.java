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
	 * ��������(������)
	 * @param FBillTypeID
	 */
	public void setFBillTypeID(String FBillTypeID) {
		this.setModelFNumberData("FBillTypeID",FBillTypeID);
	}

	/**
	 * ���ݱ��
	 * @param FBillNo
	 */
	public void setFBillNo(String FBillNo) {
		this.setModelData("FBillNo",FBillNo);
	}

	/**
	 * �ջ�����(������)
	 * @param FDate
	 */
	public void setFDate(String FDate) {
		this.setModelData("FDate",FDate);
	}

	/**
	 * ������֯(������)
	 * @param FStockOrgId
	 */
	public void setFStockOrgId(String FStockOrgId) {
		this.setModelFNumberData("FStockOrgId",FStockOrgId);
	}

	/**
	 * ���ϲ���
	 * @param FStockDeptId
	 */
	public void setFStockDeptId(String FStockDeptId) {
		this.setModelFNumberData("FStockDeptId",FStockDeptId);
	}

	/**
	 * �����
	 * @param FStockerGroupId
	 */
	public void setFStockerGroupId(String FStockerGroupId) {
		this.setModelFNumberData("FStockerGroupId",FStockerGroupId);
	}

	/**
	 * �ֹ�Ա
	 * @param FStockerId
	 */
	public void setFStockerId(String FStockerId) {
		this.setModelFNumberData("FStockerId",FStockerId);
	}

	/**
	 * ������֯
	 * @param FDemandOrgId
	 */
	public void setFDemandOrgId(String FDemandOrgId) {
		this.setModelFNumberData("FDemandOrgId",FDemandOrgId);
	}

	/**
	 * �ɹ���֯(������)
	 * @param FPurchaseOrgId
	 */
	public void setFPurchaseOrgId(String FPurchaseOrgId) {
		this.setModelFNumberData("FPurchaseOrgId",FPurchaseOrgId);
	}

	/**
	 * ��Ӧ��֯
	 * @param FCorrespondOrgId
	 */
	public void setFCorrespondOrgId(String FCorrespondOrgId) {
		this.setModelFNumberData("FCorrespondOrgId",FCorrespondOrgId);
	}

	/**
	 * �ɹ�����
	 * @param FPurchaseDeptId
	 */
	public void setFPurchaseDeptId(String FPurchaseDeptId) {
		this.setModelFNumberData("FPurchaseDeptId",FPurchaseDeptId);
	}

	/**
	 * �ɹ���
	 * @param FPurchaserGroupId
	 */
	public void setFPurchaserGroupId(String FPurchaserGroupId) {
		this.setModelFNumberData("FPurchaserGroupId",FPurchaserGroupId);
	}

	/**
	 * �ɹ�Ա
	 * @param FPurchaserId
	 */
	public void setFPurchaserId(String FPurchaserId) {
		this.setModelFNumberData("FPurchaserId",FPurchaserId);
	}

	/**
	 * ��Ӧ��(������)
	 * @param FSupplierId
	 */
	public void setFSupplierId(String FSupplierId) {
		this.setModelFNumberData("FSupplierId",FSupplierId);
	}

	/**
	 * ������
	 * @param FSupplyId
	 */
	public void setFSupplyId(String FSupplyId) {
		this.setModelFNumberData("FSupplyId",FSupplyId);
	}

	/**
	 * ��������ַ
	 * @param FSupplyAddress
	 */
	public void setFSupplyAddress(String FSupplyAddress) {
		this.setModelData("FSupplyAddress",FSupplyAddress);
	}

	/**
	 * ���㷽
	 * @param FSettleId
	 */
	public void setFSettleId(String FSettleId) {
		this.setModelFNumberData("FSettleId",FSettleId);
	}

	/**
	 * �տ
	 * @param FChargeId
	 */
	public void setFChargeId(String FChargeId) {
		this.setModelFNumberData("FChargeId",FChargeId);
	}

	/**
	 * ��������(������)
	 * @param FOwnerTypeIdHead
	 */
	public void setFOwnerTypeIdHead(String FOwnerTypeIdHead) {
		this.setModelData("FOwnerTypeIdHead",FOwnerTypeIdHead);
	}

	/**
	 * ����(������)
	 * @param FOwnerIdHead
	 */
	public void setFOwnerIdHead(String FOwnerIdHead) {
		this.setModelFNumberData("FOwnerIdHead",FOwnerIdHead);
	}

	/**
	 * ȷ����
	 * @param FConfirmerId
	 */
	public void setFConfirmerId(String FConfirmerId) {
		StringBuffer temp = new StringBuffer(40);
		temp.append("{\"FUserID\":\"").append(FConfirmerId).append("\"}");
		this.setModelData("FConfirmerId",temp);
	}

	/**
	 * ȷ������
	 * @param FConfirmDate
	 */
	public void setFConfirmDate(String FConfirmDate) {
		this.setModelData("FConfirmDate",FConfirmDate);
	}

	/**
	 * ���к��ϴ�
	 * @param FScanBox
	 */
	public void setFScanBox(String FScanBox) {
		this.setModelData("FScanBox",FScanBox);
	}

	/**
	 * ��������ƫ�Ƶ�λ
	 * @param FCDateOffsetUnit
	 */
	public void setFCDateOffsetUnit(String FCDateOffsetUnit) {
		this.setModelData("FCDateOffsetUnit",FCDateOffsetUnit);
	}

	/**
	 * ��������ƫ����
	 * @param FCDateOffsetValue
	 */
	public void setFCDateOffsetValue(String FCDateOffsetValue) {
		this.setModelData("FCDateOffsetValue",FCDateOffsetValue);
	}

	/**
	 * ��������ϵ��
	 * @param FProviderContactID
	 */
	public void setFProviderContactID(String FProviderContactID) {
		StringBuffer temp = new StringBuffer(40);
		temp.append("{\"FCONTACTNUMBER\":\"").append(FProviderContactID).append("\"}");
		this.setModelData("FProviderContactID",temp);
	}

	/**
	 * ��Ŀ���
	 * @param F_PAEZ_Text
	 */
	public void setF_PAEZ_Text(String F_PAEZ_Text) {
		this.setModelData("F_PAEZ_Text",F_PAEZ_Text);
	}

	/**
	 * ��Ŀ����
	 * @param F_PAEZ_Assistant
	 */
	public void setF_PAEZ_Assistant(String F_PAEZ_Assistant) {
		this.setModelFNumberData("F_PAEZ_Assistant",F_PAEZ_Assistant);
	}

	/**
	 * �ϼƽ��
	 * @param F_PAEZ_Amount
	 */
	public void setF_PAEZ_Amount(double F_PAEZ_Amount) {
		this.setModelData("F_PAEZ_Amount",F_PAEZ_Amount);
	}
	/**
	 * �ͻ�
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