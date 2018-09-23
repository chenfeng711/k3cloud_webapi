package com.xohaa.k3cloud.fentity.contract;
import com.xohaa.k3cloud.fentity.EntryData;
/**
 * ����Ŀ
 * @author Administrator
 *
 */
public class FContractEntry  extends EntryData{
	public FContractEntry(){
		super();
	}
	/**
	 * 
	 * @param FEntryID
	 */
	public void setFEntryID(String FEntryID){
		jsonstr.addData("FEntryID", FEntryID);
	}

	/**
	 * ���ϱ���(������
	 * @param FMaterialId
	 */
	public void setFMaterialId(String FMaterialId){
		jsonstr.addFNumberData("FMaterialId",FMaterialId);
	}

	/**
	 * ����˵��
	 * @param FMaterialDesc
	 */
	public void setFMaterialDesc(String FMaterialDesc){
		jsonstr.addData("FMaterialDesc", FMaterialDesc);
	}

	/**
	 * �ɹ���λ(������
	 * @param FUnitId
	 */
	public void setFUnitId(String FUnitId){
		jsonstr.addFNumberData("FUnitId",FUnitId);
	}

	/**
	 * ��������
	 * @param FAuxPropId
	 */
	public void setFAuxPropId(String FAuxPropId){
		jsonstr.addFNumberData("FAuxPropId",FAuxPropId);
	}

	/**
	 * ��ͬ����
	 * @param FQty
	 */
	public void setFQty(double FQty){
		jsonstr.addData("FQty", FQty);
	}

	/**
	 * �Ƽ۵�λ(������)
	 * @param FPriceUnitId
	 */
	public void setFPriceUnitId(String FPriceUnitId){
		jsonstr.addFNumberData("FPriceUnitId",FPriceUnitId);
	}

	/**
	 * �Ƽ�����
	 * @param FPriceUnitQty
	 */
	public void setFPriceUnitQty(double FPriceUnitQty){
		jsonstr.addData("FPriceUnitQty", FPriceUnitQty);
	}

	/**
	 * ��������
	 * @param FDeliveryDate
	 */
	public void setFDeliveryDate(String FDeliveryDate){
		jsonstr.addData("FDeliveryDate", FDeliveryDate);
	}

	/**
	 * ����
	 * @param FPrice
	 */
	public void setFPrice(double FPrice){
		jsonstr.addData("FPrice", FPrice);
	}

	/**
	 * ��˰����
	 * @param FTaxPrice
	 */
	public void setFTaxPrice(double FTaxPrice){
		jsonstr.addData("FTaxPrice", FTaxPrice);
	}

	/**
	 * �ۿ���%
	 * @param FEntryDiscountRate
	 */
	public void setFEntryDiscountRate(double FEntryDiscountRate){
		jsonstr.addData("FEntryDiscountRate", FEntryDiscountRate);
	}

	/**
	 * ˰���
	 * @param FTaxCombination
	 */
	public void setFTaxCombination(String FTaxCombination){
		jsonstr.addFNumberData("FTaxCombination",FTaxCombination);
	}

	/**
	 * ˰��%
	 * @param FEntryTaxRate
	 */
	public void setFEntryTaxRate(double FEntryTaxRate){
		jsonstr.addData("FEntryTaxRate", FEntryTaxRate);
	}

	/**
	 * ������֯
	 * @param FRequireOrgId
	 */
	public void setFRequireOrgId(String FRequireOrgId){
		jsonstr.addFNumberData("FRequireOrgId",FRequireOrgId);
	}

	/**
	 * ������֯
	 * @param FReceiveOrgId
	 */
	public void setFReceiveOrgId(String FReceiveOrgId){
		jsonstr.addFNumberData("FReceiveOrgId",FReceiveOrgId);
	}

	/**
	 * �۸�ϵ��
	 * @param FPriceCoefficient
	 */
	public void setFPriceCoefficient(double FPriceCoefficient){
		jsonstr.addData("FPriceCoefficient", FPriceCoefficient);
	}
	
	/**
	 * ������֯(������)
	 * @param FSettleOrgId
	 */
	public void setFSettleOrgId(String FSettleOrgId){
		jsonstr.addFNumberData("FSettleOrgId",FSettleOrgId);
	}

	/**
	 * ������
	 * @param FRequireDeptId
	 */
	public void setFRequireDeptId(String FRequireDeptId){
		jsonstr.addFNumberData("FRequireDeptId",FRequireDeptId);
	}

	/**
	 * ������
	 * @param FRequireStaffId
	 */
	public void setFRequireStaffId(String FRequireStaffId){
		jsonstr.addFNumberData("FRequireStaffId",FRequireStaffId);
	}

	/**
	 * �Ƿ���Ʒ
	 * @param FGiveAway
	 */
	public void setFGiveAway(boolean FGiveAway){
		jsonstr.addData("FGiveAway", FGiveAway);
	}

	/**
	 * ��ע
	 * @param FEntryNote
	 */
	public void setFEntryNote(String FEntryNote){
		jsonstr.addData("FEntryNote", FEntryNote);
	}

	/**
	 * �ƻ����ٺ�
	 * @param FMtoNo
	 */
	public void setFMtoNo(String FMtoNo){
		jsonstr.addData("FMtoNo", FMtoNo);
	}

	/**
	 * ������ַ
	 * @param FDeliveryAddr
	 */
	public void setFDeliveryAddr(String FDeliveryAddr){
		jsonstr.addData("FDeliveryAddr", FDeliveryAddr);
	}

	/**
	 * �ƻ�ȷ��
	 * @param FPlanConfirm
	 */
	public void setFPlanConfirm(boolean FPlanConfirm){
		jsonstr.addData("FPlanConfirm", FPlanConfirm);
	}

	/**
	 * ������ٺ�
	 * @param FReqTraceNo
	 */
	public void setFReqTraceNo(String FReqTraceNo){
		jsonstr.addData("FReqTraceNo", FReqTraceNo);
	}

	/**
	 * BOM�汾
	 * @param FBomId
	 */
	public void setFBomId(String FBomId){
		jsonstr.addData("FBomId",FBomId);
	}

	/**
	 * �Ƽۻ�������
	 * @param FPriceBaseQty
	 */
	public void setFPriceBaseQty(double FPriceBaseQty){
		jsonstr.addData("FPriceBaseQty", FPriceBaseQty);
	}

	/**
	 * ���۵�λ
	 * @param FSetPriceUnitID
	 */
	public void setFSetPriceUnitID(String FSetPriceUnitID){
		jsonstr.addData("FSetPriceUnitID",FSetPriceUnitID);
	}

	/**
	 * ��浥λ(������)
	 * @param FStockUnitID
	 */
	public void setFStockUnitID(String FStockUnitID){
		jsonstr.addData("FStockUnitID",FStockUnitID);
	}

	/**
	 * �������
	 * @param FStockQty
	 */
	public void setFStockQty(double FStockQty){
		jsonstr.addData("FStockQty", FStockQty);
	}

	/**
	 * ����������
	 * @param FStockBaseQty
	 */
	public void setFStockBaseQty(double FStockBaseQty){
		jsonstr.addData("FStockBaseQty", FStockBaseQty);
	}

	/**
	 * ˰��
	 * @param FContractEntryTax
	 */
	public void setFContractEntryTax(FContractEntryTax ContractEntryTax){
		jsonstr.addData("FContractEntryTax", ContractEntryTax.getArrayListStr());
	}
}
