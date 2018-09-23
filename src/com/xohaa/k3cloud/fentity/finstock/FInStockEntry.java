package com.xohaa.k3cloud.fentity.finstock;
import com.xohaa.k3cloud.fentity.EntryData;
public class FInStockEntry extends EntryData {
	public FInStockEntry(){
		super();
	}
	/**
	 * 
	 * @param FEntryID
	 * 
	 */
	public void setFEntryID(String FEntryID){
		jsonstr.addData("FEntryID", FEntryID);
	}

	/**
	 * ��Ʒ����
	 * @param FRowType
	 */
	public void setFRowType(String FRowType){
		jsonstr.addData("FRowType", FRowType);
	}

	/**
	 * ���ϱ���(������)
	 * @param FMaterialId
	 */
	public void setFMaterialId(String FMaterialId){
		jsonstr.addFNumberData("FMaterialId", FMaterialId);
	}

	/**
	 * �������
	 * @param FWWInType
	 */
	public void setFWWInType(String FWWInType){
		jsonstr.addData("FWWInType", FWWInType);
	}

	/**
	 * ��浥λ(������)
	 * @param FUnitID
	 */
	public void setFUnitID(String FUnitID){
		jsonstr.addFNumberData("FUnitID", FUnitID);
	}

	/**
	 * �Ƽ۵�λ(������)
	 * @param FPriceUnitID
	 */
	public void setFPriceUnitID(String FPriceUnitID){
		jsonstr.addFNumberData("FPriceUnitID", FPriceUnitID);
	}

	/**
	 * ��������
	 * @param FAuxPropId
	 */
	public void setFAuxPropId(String FAuxPropId){
		jsonstr.addFNumberData("FAuxPropId", FAuxPropId);
	}

	/**
	 * ����˰����
	 * @param FPrice
	 */
	public void setFPrice(double FPrice){
		jsonstr.addData("FPrice", FPrice);
	}

	/**
	 * �����Ʒ
	 * @param FParentMatId
	 */
	public void setFParentMatId(String FParentMatId){
		jsonstr.addFNumberData("FParentMatId", FParentMatId);
	}

	/**
	 * ��˰����
	 * @param FTaxPrice
	 */
	public void setFTaxPrice(double FTaxPrice){
		jsonstr.addData("FTaxPrice", FTaxPrice);
	}

	/**
	 * ʵ������
	 * @param FRealQty
	 */
	public void setFRealQty(double FRealQty){
		jsonstr.addData("FRealQty", FRealQty);
	}

	/**
	 * ˰��(%)
	 * @param FEntryTaxRate
	 */
	public void setFEntryTaxRate(double FEntryTaxRate){
		jsonstr.addData("FEntryTaxRate", FEntryTaxRate);
	}

	/**
	 * �ֿ�
	 * @param FStockId
	 */
	public void setFStockId(String FStockId){
		jsonstr.addFNumberData("FStockId", FStockId);
	}

	/**
	 * �ջ�����
	 * @param F_PAEZ_Date
	 */
	public void setF_PAEZ_Date(String F_PAEZ_Date){
		jsonstr.addData("F_PAEZ_Date", F_PAEZ_Date);
	}

	/**
	 * ����
	 * @param FLot
	 */
	public void setFLot(String FLot){
		jsonstr.addFNumberData("FLot", FLot);
	}

	/**
	 * ˰���
	 * @param FTaxCombination
	 */
	public void setFTaxCombination(String FTaxCombination){
		jsonstr.addFNumberData("FTaxCombination", FTaxCombination);
	}

	/**
	 * ���������Ƽۣ�
	 * @param FDisPriceQty
	 */
	public void setFDisPriceQty(double FDisPriceQty){
		jsonstr.addData("FDisPriceQty", FDisPriceQty);
	}

	/**
	 * ��λ
	 * @param FStockLocId
	 */
	public void setFStockLocId(String FStockLocId){
		jsonstr.addFNumberData("FStockLocId", FStockLocId);
	}

	/**
	 * ���״̬
	 * @param FStockStatusId
	 */
	public void setFStockStatusId(String FStockStatusId){
		jsonstr.addFNumberData("FStockStatusId", FStockStatusId);
	}

	/**
	 * �ƻ����ٺ�
	 * @param FMtoNo
	 */
	public void setFMtoNo(String FMtoNo){
		jsonstr.addData("FMtoNo", FMtoNo);
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
	 * @param FNote
	 */
	public void setFNote(String FNote){
		jsonstr.addData("FNote", FNote);
	}

	/**
	 * ��������
	 * @param FProduceDate
	 */
	public void setFProduceDate(String FProduceDate){
		jsonstr.addData("FProduceDate", FProduceDate);
	}

	/**
	 * ����λ
	 * @param FExtAuxUnitId
	 */
	public void setFExtAuxUnitId(String FExtAuxUnitId){
		jsonstr.addFNumberData("FExtAuxUnitId", FExtAuxUnitId);
	}

	/**
	 * ʵ������(����λ)
	 * @param FExtAuxUnitQty
	 */
	public void setFExtAuxUnitQty(double FExtAuxUnitQty){
		jsonstr.addData("FExtAuxUnitQty", FExtAuxUnitQty);
	}

	/**
	 * ���ϼ���
	 * @param FCheckInComing
	 */
	public void setFCheckInComing(boolean FCheckInComing){
		jsonstr.addData("FCheckInComing", FCheckInComing);
	}

	/**
	 * ��Ŀ���
	 * @param FProjectNo
	 */
	public void setFProjectNo(String FProjectNo){
		jsonstr.addData("FProjectNo", FProjectNo);
	}

	/**
	 * �����ƻ�����(�Ƽ۵�λ)
	 * @param FSampleDamageQty
	 */
	public void setFSampleDamageQty(double FSampleDamageQty){
		jsonstr.addData("FSampleDamageQty", FSampleDamageQty);
	}

	/**
	 * �����ƻ��������Ƽۻ�����
	 * @param FSampleDamageBaseQty
	 */
	public void setFSampleDamageBaseQty(double FSampleDamageBaseQty){
		jsonstr.addData("FSampleDamageBaseQty", FSampleDamageBaseQty);
	}

	/**
	 * ���ϸ��¿��
	 * @param FIsReceiveUpdateStock
	 */
	public void setFIsReceiveUpdateStock(boolean FIsReceiveUpdateStock){
		jsonstr.addData("FIsReceiveUpdateStock", FIsReceiveUpdateStock);
	}

	/**
	 * �ѿ�Ʊ��������
	 * @param FInvoicedJoinQty
	 */
	public void setFInvoicedJoinQty(double FInvoicedJoinQty){
		jsonstr.addData("FInvoicedJoinQty", FInvoicedJoinQty);
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
		jsonstr.addFNumberData("FSetPriceUnitID", FSetPriceUnitID);
	}

	/**
	 * �ɹ���λ(������)
	 * @param FRemainInStockUnitId
	 */
	public void setFRemainInStockUnitId(String FRemainInStockUnitId){
		jsonstr.addFNumberData("FRemainInStockUnitId", FRemainInStockUnitId);
	}

	/**
	 * ���˹ر�
	 * @param FBILLINGCLOSE
	 */
	public void setFBILLINGCLOSE(boolean FBILLINGCLOSE){
		jsonstr.addData("FBILLINGCLOSE", FBILLINGCLOSE);
	}

	/**
	 * �ɹ�����
	 * @param FRemainInStockQty
	 */
	public void setFRemainInStockQty(double FRemainInStockQty){
		jsonstr.addData("FRemainInStockQty", FRemainInStockQty);
	}

	/**
	 * δ����Ӧ���������Ƽ۵�λ��
	 * @param FAPNotJoinQty
	 */
	public void setFAPNotJoinQty(double FAPNotJoinQty){
		jsonstr.addData("FAPNotJoinQty", FAPNotJoinQty);
	}

	/**
	 * �ɹ���������
	 * @param FRemainInStockBaseQty
	 */
	public void setFRemainInStockBaseQty(double FRemainInStockBaseQty){
		jsonstr.addData("FRemainInStockBaseQty", FRemainInStockBaseQty);
	}

	/**
	 * �ۿ���(%)
	 * @param FDiscountRate
	 */
	public void setFDiscountRate(double FDiscountRate){
		jsonstr.addData("FDiscountRate", FDiscountRate);
	}

	/**
	 * �ɱ���
	 * @param FCostPrice
	 */
	public void setFCostPrice(double FCostPrice){
		jsonstr.addData("FCostPrice", FCostPrice);
	}

	/**
	 * BOM�汾
	 * @param FBOMId
	 */
	public void setFBOMId(String FBOMId){
		jsonstr.addFNumberData("FBOMId", FBOMId);
	}

	/**
	 * ��Ӧ������
	 * @param FSupplierLot
	 */
	public void setFSupplierLot(String FSupplierLot){
		jsonstr.addData("FSupplierLot", FSupplierLot);
	}

	/**
	 * ��Ч����
	 * @param FExpiryDate
	 */
	public void setFExpiryDate(String FExpiryDate){
		jsonstr.addData("FExpiryDate", FExpiryDate);
	}

	/**
	 * ��������渨��λ��
	 * @param FAuxUnitQty
	 */
	public void setFAuxUnitQty(double FAuxUnitQty){
		jsonstr.addData("FAuxUnitQty", FAuxUnitQty);
	}

	/**
	 * ��ǰԭ�Ƽ�����
	 * @param FBeforeDisPriceQty
	 */
	public void setFBeforeDisPriceQty(double FBeforeDisPriceQty){
		jsonstr.addData("FBeforeDisPriceQty", FBeforeDisPriceQty);
	}

	/**
	 * 
	 * @param FEntryPruCost
	 */
	public void setFEntryPruCost(String FEntryPruCost){
		
		/*
		JSONArray arr = null;
		JSONObject json1 = new JSONObject();
		json1.put("FDetailID",FEntryPruCost);
		if(this.json.has("FEntryPruCost")){
			arr = this.json.getJSONArray("FEntryPruCost");
			arr.put(json1);
		}else{
			arr = new JSONArray();
			arr.put(json1);
			this.json.put("FEntryPruCost", arr);
		}*/
	}

	/**
	 * ˰��
	 * @param FDetailID
	 * @param FTaxRate ˰��%
	 */
	public void setFTaxDetailSubEntity(String FDetailID,double FTaxRate){
		/*
		JSONArray arr = null;
		JSONObject json1 = new JSONObject();
		json1.put("FDetailID",FDetailID);
		json1.put("FTaxRate",FTaxRate);
		if(this.json.has("FTaxDetailSubEntity")){
			arr = this.json.getJSONArray("FTaxDetailSubEntity");
			arr.put(json1);
		}else{ 
			arr = new JSONArray();
			arr.put(json1);
			this.json.put("FTaxDetailSubEntity", arr);
		}*/
	}

	/**
	 * ���к�
	 * @param FDetailID
	 * @param FSerialNo ���к�
	 * @param FSerialNote ��ע
	 */
	public void setFSerialSubEntity(String FDetailID,String FSerialNo,String FSerialNote){
		/*
		JSONArray arr = null;
		JSONObject json1 = new JSONObject();
		json1.put("FDetailID",FDetailID);
		json1.put("FSerialNo",FSerialNo);
		json1.put("FDetailID",FSerialNote);
		if(this.json.has("FSerialSubEntity")){
			arr = this.json.getJSONArray("FSerialSubEntity");
			arr.put(json1);
		}else{
			arr = new JSONArray();
			arr.put(json1);
			this.json.put("FSerialSubEntity", arr);
		}
		*/
	}
}
