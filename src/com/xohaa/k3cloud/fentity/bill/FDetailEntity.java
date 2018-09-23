package com.xohaa.k3cloud.fentity.bill;
import com.xohaa.k3cloud.fentity.EntryData;
/**
 * ���ϵ�����Ŀ
 * @author chenjianxiong
 *
 */
public class FDetailEntity  extends EntryData{
	public FDetailEntity(){
		super();
	}
	
	/**
	 * 
	 * @param FEntryID
	 */
	public void setFEntryID(String FEntryID) {
		jsonstr.addData("FEntryID", FEntryID);
	}

	/**
	 * ���ϱ���(������)
	 * @param FMaterialId
	 */
	public void setFMaterialId(String FMaterialId) {
		jsonstr.addFNumberData("FMaterialId", FMaterialId);
	}

	/**
	 * ����˵��
	 * @param FMaterialDesc
	 */
	public void setFMaterialDesc(String FMaterialDesc) {
		jsonstr.addData("FMaterialDesc", FMaterialDesc);
	}

	/**
	 * ���ϵ�λ(������)
	 * @param FUnitId
	 */
	public void setFUnitId(String FUnitId) {
		jsonstr.addFNumberData("FUnitId", FUnitId);
	}

	/**
	 * ��������
	 * @param FActReceiveQty
	 */
	public void setFActReceiveQty(double FActReceiveQty) {
		jsonstr.addData("FActReceiveQty", FActReceiveQty);
	}

	/**
	 * ����˰����
	 * @param FPrice
	 */
	public void setFPrice(double FPrice) {
		jsonstr.addData("FPrice", FPrice);
	}

	/**
	 * ��˰����
	 * @param FTaxPrice
	 */
	public void setFTaxPrice(double FTaxPrice) {
		jsonstr.addData("FTaxPrice", FTaxPrice);
	}

	/**
	 * Ԥ�Ƶ�������
	 * @param FPreDeliveryDate
	 */
	public void setFPreDeliveryDate(String FPreDeliveryDate) {
		jsonstr.addData("FPreDeliveryDate", FPreDeliveryDate);
	}

	/**
	 * ��Ӧ�̽�������
	 * @param FSUPDELQTY
	 */
	public void setFSUPDELQTY(double FSUPDELQTY) {
		jsonstr.addData("FSUPDELQTY", FSUPDELQTY);
	}

	/**
	 * �Ƽ۵�λ(������)
	 * @param FPriceUnitId
	 */
	public void setFPriceUnitId(String FPriceUnitId) {
		jsonstr.addFNumberData("FPriceUnitId", FPriceUnitId);
	}

	/**
	 * �ֿ�
	 * @param FStockID
	 */
	public void setFStockID(String FStockID) {
		jsonstr.addFNumberData("FStockID", FStockID);
	}

	/**
	 * ��Ӧ��
	 * @param F_PAEZ_Base
	 */
	public void setF_PAEZ_Base(String F_PAEZ_Base) {
		jsonstr.addFNumberData("F_PAEZ_Base", F_PAEZ_Base);
	}

	/**
	 * ���״̬
	 * @param FStockStatusId
	 */
	public void setFStockStatusId(String FStockStatusId) {
		jsonstr.addFNumberData("FStockStatusId", FStockStatusId);
	}

	/**
	 * ����
	 * @param FLot
	 */
	public void setFLot(String FLot) {
		jsonstr.addFNumberData("FLot", FLot);
	}

	/**
	 * ����ԭ��
	 * @param FRejectReason
	 */
	public void setFRejectReason(String FRejectReason) {
		jsonstr.addData("FRejectReason", FRejectReason);
	}

	/**
	 * ��������
	 * @param FProduceDate
	 */
	public void setFProduceDate(String FProduceDate) {
		jsonstr.addData("FProduceDate", FProduceDate);
	}

	/**
	 * ������
	 * @param FDemandDeptId
	 */
	public void setFDemandDeptId(String FDemandDeptId) {
		jsonstr.addFNumberData("FDemandDeptId", FDemandDeptId);
	}

	/**
	 * �Ƿ���Ʒ
	 * @param FGiveAway
	 */
	public void setFGiveAway(boolean FGiveAway) {
		jsonstr.addData("FGiveAway", FGiveAway);
	}

	/**
	 * ������Ŀ
	 * @param FChargeProjectID
	 */
	public void setFChargeProjectID(String FChargeProjectID) {
		jsonstr.addFNumberData("FChargeProjectID", FChargeProjectID);
	}

	/**
	 * �����������
	 * @param FCtrlStockInPercent
	 */
	public void setFCtrlStockInPercent(boolean FCtrlStockInPercent) {
		jsonstr.addData("FCtrlStockInPercent", FCtrlStockInPercent);
	}

	/**
	 * �ƻ����ٺ�
	 * @param FMtoNo
	 */
	public void setFMtoNo(String FMtoNo) {
		jsonstr.addData("FMtoNo", FMtoNo);
	}

	/**
	 * ����λ
	 * @param FExtAuxUnitId
	 */
	public void setFExtAuxUnitId(String FExtAuxUnitId) {
		jsonstr.addFNumberData("FExtAuxUnitId", FExtAuxUnitId);
	}

	/**
	 * ʵ������(����λ)
	 * @param FExtAuxUnitQty
	 */
	public void setFExtAuxUnitQty(double FExtAuxUnitQty) {
		jsonstr.addData("FExtAuxUnitQty", FExtAuxUnitQty);
	}

	/**
	 * ��Ŀ���
	 * @param FProjectNo
	 */
	public void setFProjectNo(String FProjectNo) {
		jsonstr.addData("FProjectNo", FProjectNo);
	}

	/**
	 * �������������������λ��
	 * @param FCheckJoinBaseQty
	 */
	public void setFCheckJoinBaseQty(double FCheckJoinBaseQty) {
		jsonstr.addData("FCheckJoinBaseQty", FCheckJoinBaseQty);
	}

	/**
	 * �ϸ�������������λ��
	 * @param FReceiveBaseQty
	 */
	public void setFReceiveBaseQty(double FReceiveBaseQty) {
		jsonstr.addData("FReceiveBaseQty", FReceiveBaseQty);
	}

	/**
	 * ����������������λ��
	 * @param FRefuseBaseQty
	 */
	public void setFRefuseBaseQty(double FRefuseBaseQty) {
		jsonstr.addData("FRefuseBaseQty", FRefuseBaseQty);
	}

	/**
	 * �����ƻ�������������λ��
	 * @param FSampleDamageBaseQty
	 */
	public void setFSampleDamageBaseQty(double FSampleDamageBaseQty) {
		jsonstr.addData("FSampleDamageBaseQty", FSampleDamageBaseQty);
	}

	/**
	 * �����������
	 * @param FCheckJoinQty
	 */
	public void setFCheckJoinQty(double FCheckJoinQty) {
		jsonstr.addData("FCheckJoinQty", FCheckJoinQty);
	}

	/**
	 * �ϸ�����
	 * @param FReceiveQty
	 */
	public void setFReceiveQty(double FReceiveQty) {
		jsonstr.addData("FReceiveQty", FReceiveQty);
	}

	/**
	 * ��������
	 * @param FRefuseQty
	 */
	public void setFRefuseQty(double FRefuseQty) {
		jsonstr.addData("FRefuseQty", FRefuseQty);
	}

	/**
	 * �����ƻ�����
	 * @param FSampleDamageQty
	 */
	public void setFSampleDamageQty(double FSampleDamageQty) {
		jsonstr.addData("FSampleDamageQty", FSampleDamageQty);
	}

	/**
	 * ���ϼ���
	 * @param FCheckInComing
	 */
	public void setFCheckInComing(boolean FCheckInComing) {
		jsonstr.addData("FCheckInComing", FCheckInComing);
	}

	/**
	 * �����ص�(2.0ɾ��)
	 * @param FDeliverySite
	 */
	public void setFDeliverySite(String FDeliverySite) {
		jsonstr.addData("FDeliverySite", FDeliverySite);
	}

	/**
	 * ��Ƭ��������
	 * @param FCardJoinQty
	 */
	public void setFCardJoinQty(double FCardJoinQty) {
		jsonstr.addData("FCardJoinQty", FCardJoinQty);
	}

	/**
	 * ��Ƭ����
	 * @param FCardQty
	 */
	public void setFCardQty(double FCardQty) {
		jsonstr.addData("FCardQty", FCardQty);
	}

	/**
	 * ��Ƭ����(������λ)
	 * @param FCardBaseQty
	 */
	public void setFCardBaseQty(double FCardBaseQty) {
		jsonstr.addData("FCardBaseQty", FCardBaseQty);
	}

	/**
	 * ��Ƭ��������(������λ)
	 * @param FCardJoinBaseQty
	 */
	public void setFCardJoinBaseQty(double FCardJoinBaseQty) {
		jsonstr.addData("FCardJoinBaseQty", FCardJoinBaseQty);
	}

	/**
	 * ����������������λ��
	 * @param FCheckBaseQty
	 */
	public void setFCheckBaseQty(double FCheckBaseQty) {
		jsonstr.addData("FCheckBaseQty", FCheckBaseQty);
	}

	/**
	 * ��������
	 * @param FCheckQty
	 */
	public void setFCheckQty(double FCheckQty) {
		jsonstr.addData("FCheckQty", FCheckQty);
	}

	/**
	 * �ۼƵ�������(������λ)
	 * @param FTransferBaseQty
	 */
	public void setFTransferBaseQty(double FTransferBaseQty) {
		jsonstr.addData("FTransferBaseQty", FTransferBaseQty);
	}

	/**
	 * ���ϸ��¿��(����)
	 * @param FIsReceiveUpdateStock
	 */
	public void setFIsReceiveUpdateStock(boolean FIsReceiveUpdateStock) {
		jsonstr.addData("FIsReceiveUpdateStock", FIsReceiveUpdateStock);
	}

	/**
	 * �ۼƵ�������
	 * @param FTransferQty
	 */
	public void setFTransferQty(double FTransferQty) {
		jsonstr.addData("FTransferQty", FTransferQty);
	}

	/**
	 * BOM�汾
	 * @param FBomId
	 */
	public void setFBomId(String FBomId) {
		jsonstr.addFNumberData("FBomId", FBomId);
	}

	/**
	 * ��Ӧ������
	 * @param FSupplierLot
	 */
	public void setFSupplierLot(String FSupplierLot) {
		jsonstr.addData("FSupplierLot", FSupplierLot);
	}

	/**
	 * ��Ч����
	 * @param FExpiryDate
	 */
	public void setFExpiryDate(String FExpiryDate) {
		jsonstr.addData("FExpiryDate", FExpiryDate);
	}

	/**
	 * ��渨��λ����
	 * @param FAuxUnitQty
	 */
	public void setFAuxUnitQty(double FAuxUnitQty) {
		jsonstr.addData("FAuxUnitQty", FAuxUnitQty);
	}

	/**
	 * ��ע
	 * @param FDescription
	 */
	public void setFDescription(String FDescription) {
		jsonstr.addData("FDescription", FDescription);
	}

	/**
	 * �������
	 * @param FStockInMaxQty
	 */
	public void setFStockInMaxQty(double FStockInMaxQty) {
		jsonstr.addData("FStockInMaxQty", FStockInMaxQty);
	}

	/**
	 * �������
	 * @param FStockInMinQty
	 */
	public void setFStockInMinQty(double FStockInMinQty) {
		jsonstr.addData("FStockInMinQty", FStockInMinQty);
	}

	/**
	 * ˰��%
	 * @param FEntryTaxRate
	 */
	public void setFEntryTaxRate(double FEntryTaxRate) {
		jsonstr.addData("FEntryTaxRate", FEntryTaxRate);
	}

	/**
	 * ˰���
	 * @param FTaxCombination
	 */
	public void setFTaxCombination(String FTaxCombination) {
		jsonstr.addFNumberData("FTaxCombination", FTaxCombination);
	}

	/**
	 * �ۿ���%
	 * @param FDiscountRate
	 */
	public void setFDiscountRate(double FDiscountRate) {
		jsonstr.addData("FDiscountRate", FDiscountRate);
	}

	/**
	 * ��������(������λ)
	 * @param FProcScrapBaseQty
	 */
	public void setFProcScrapBaseQty(double FProcScrapBaseQty) {
		jsonstr.addData("FProcScrapBaseQty", FProcScrapBaseQty);
	}

	/**
	 * ��������
	 * @param FProcScrapQty
	 */
	public void setFProcScrapQty(double FProcScrapQty) {
		jsonstr.addData("FProcScrapQty", FProcScrapQty);
	}

	/**
	 * �Ϸ�����(������λ)
	 * @param FMtrlScrapBaseQty
	 */
	public void setFMtrlScrapBaseQty(double FMtrlScrapBaseQty) {
		jsonstr.addData("FMtrlScrapBaseQty", FMtrlScrapBaseQty);
	}

	/**
	 * �Ϸ�����
	 * @param FMtrlScrapQty
	 */
	public void setFMtrlScrapQty(double FMtrlScrapQty) {
		jsonstr.addData("FMtrlScrapQty", FMtrlScrapQty);
	}

	/**
	 * �ò���������(������λ)
	 * @param FCsnReceiveBaseQty
	 */
	public void setFCsnReceiveBaseQty(double FCsnReceiveBaseQty) {
		jsonstr.addData("FCsnReceiveBaseQty", FCsnReceiveBaseQty);
	}

	/**
	 * �ò���������
	 * @param FCsnReceiveQty
	 */
	public void setFCsnReceiveQty(double FCsnReceiveQty) {
		jsonstr.addData("FCsnReceiveQty", FCsnReceiveQty);
	}

	/**
	 * ���ϸ��������(������λ)
	 * @param FRefuseJoinBaseQty
	 */
	public void setFRefuseJoinBaseQty(double FRefuseJoinBaseQty) {
		jsonstr.addData("FRefuseJoinBaseQty", FRefuseJoinBaseQty);
	}

	/**
	 * ���ϸ��������
	 * @param FRefuseJoinQty
	 */
	public void setFRefuseJoinQty(double FRefuseJoinQty) {
		jsonstr.addData("FRefuseJoinQty", FRefuseJoinQty);
	}

	/**
	 * �ò����չ�������(������λ)
	 * @param FCsnReceiveJoinBaseQty
	 */
	public void setFCsnReceiveJoinBaseQty(double FCsnReceiveJoinBaseQty) {
		jsonstr.addData("FCsnReceiveJoinBaseQty", FCsnReceiveJoinBaseQty);
	}

	/**
	 * �ò����չ�������
	 * @param FCsnReceiveJoinQty
	 */
	public void setFCsnReceiveJoinQty(double FCsnReceiveJoinQty) {
		jsonstr.addData("FCsnReceiveJoinQty", FCsnReceiveJoinQty);
	}

	/**
	 * �Ƽۻ�������
	 * @param FPriceBaseQty
	 */
	public void setFPriceBaseQty(double FPriceBaseQty) {
		jsonstr.addData("FPriceBaseQty", FPriceBaseQty);
	}

	/**
	 * ���۵�λ
	 * @param FSetPriceUnitID
	 */
	public void setFSetPriceUnitID(String FSetPriceUnitID) {
		jsonstr.addFNumberData("FSetPriceUnitID", FSetPriceUnitID);
	}

	/**
	 * ��浥λ(������)
	 * @param FStockUnitID
	 */
	public void setFStockUnitID(String FStockUnitID) {
		jsonstr.addFNumberData("FStockUnitID", FStockUnitID);
	}

	/**
	 * �������
	 * @param FStockQty
	 */
	public void setFStockQty(double FStockQty) {
		jsonstr.addData("FStockQty", FStockQty);
	}

	/**
	 * ����������
	 * @param FStockBaseQty
	 */
	public void setFStockBaseQty(double FStockBaseQty) {
		jsonstr.addData("FStockBaseQty", FStockBaseQty);
	}

	/**
	 * ʵ������
	 * @param FActlandQty
	 */
	public void setFActlandQty(double FActlandQty) {
		jsonstr.addData("FActlandQty", FActlandQty);
	}

	/**
	 * ȷ�Ͻ�������
	 * @param FConfirmDeliQty
	 */
	public void setFConfirmDeliQty(double FConfirmDeliQty) {
		jsonstr.addData("FConfirmDeliQty", FConfirmDeliQty);
	}

	/**
	 * ȷ�ϵ�������
	 * @param FConfirmDeliDate
	 */
	public void setFConfirmDeliDate(String FConfirmDeliDate) {
		jsonstr.addData("FConfirmDeliDate", FConfirmDeliDate);
	}

	/**
	 * ȷ�����
	 * @param FConfirmInfo
	 */
	public void setFConfirmInfo(String FConfirmInfo) {
		jsonstr.addData("FConfirmInfo", FConfirmInfo);
	}
}
