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
	 * 产品类型
	 * @param FRowType
	 */
	public void setFRowType(String FRowType){
		jsonstr.addData("FRowType", FRowType);
	}

	/**
	 * 物料编码(必填项)
	 * @param FMaterialId
	 */
	public void setFMaterialId(String FMaterialId){
		jsonstr.addFNumberData("FMaterialId", FMaterialId);
	}

	/**
	 * 入库类型
	 * @param FWWInType
	 */
	public void setFWWInType(String FWWInType){
		jsonstr.addData("FWWInType", FWWInType);
	}

	/**
	 * 库存单位(必填项)
	 * @param FUnitID
	 */
	public void setFUnitID(String FUnitID){
		jsonstr.addFNumberData("FUnitID", FUnitID);
	}

	/**
	 * 计价单位(必填项)
	 * @param FPriceUnitID
	 */
	public void setFPriceUnitID(String FPriceUnitID){
		jsonstr.addFNumberData("FPriceUnitID", FPriceUnitID);
	}

	/**
	 * 辅助属性
	 * @param FAuxPropId
	 */
	public void setFAuxPropId(String FAuxPropId){
		jsonstr.addFNumberData("FAuxPropId", FAuxPropId);
	}

	/**
	 * 不含税单价
	 * @param FPrice
	 */
	public void setFPrice(double FPrice){
		jsonstr.addData("FPrice", FPrice);
	}

	/**
	 * 父项产品
	 * @param FParentMatId
	 */
	public void setFParentMatId(String FParentMatId){
		jsonstr.addFNumberData("FParentMatId", FParentMatId);
	}

	/**
	 * 含税单价
	 * @param FTaxPrice
	 */
	public void setFTaxPrice(double FTaxPrice){
		jsonstr.addData("FTaxPrice", FTaxPrice);
	}

	/**
	 * 实收数量
	 * @param FRealQty
	 */
	public void setFRealQty(double FRealQty){
		jsonstr.addData("FRealQty", FRealQty);
	}

	/**
	 * 税率(%)
	 * @param FEntryTaxRate
	 */
	public void setFEntryTaxRate(double FEntryTaxRate){
		jsonstr.addData("FEntryTaxRate", FEntryTaxRate);
	}

	/**
	 * 仓库
	 * @param FStockId
	 */
	public void setFStockId(String FStockId){
		jsonstr.addFNumberData("FStockId", FStockId);
	}

	/**
	 * 收货日期
	 * @param F_PAEZ_Date
	 */
	public void setF_PAEZ_Date(String F_PAEZ_Date){
		jsonstr.addData("F_PAEZ_Date", F_PAEZ_Date);
	}

	/**
	 * 批号
	 * @param FLot
	 */
	public void setFLot(String FLot){
		jsonstr.addFNumberData("FLot", FLot);
	}

	/**
	 * 税组合
	 * @param FTaxCombination
	 */
	public void setFTaxCombination(String FTaxCombination){
		jsonstr.addFNumberData("FTaxCombination", FTaxCombination);
	}

	/**
	 * 拆单数量（计价）
	 * @param FDisPriceQty
	 */
	public void setFDisPriceQty(double FDisPriceQty){
		jsonstr.addData("FDisPriceQty", FDisPriceQty);
	}

	/**
	 * 仓位
	 * @param FStockLocId
	 */
	public void setFStockLocId(String FStockLocId){
		jsonstr.addFNumberData("FStockLocId", FStockLocId);
	}

	/**
	 * 库存状态
	 * @param FStockStatusId
	 */
	public void setFStockStatusId(String FStockStatusId){
		jsonstr.addFNumberData("FStockStatusId", FStockStatusId);
	}

	/**
	 * 计划跟踪号
	 * @param FMtoNo
	 */
	public void setFMtoNo(String FMtoNo){
		jsonstr.addData("FMtoNo", FMtoNo);
	}

	/**
	 * 是否赠品
	 * @param FGiveAway
	 */
	public void setFGiveAway(boolean FGiveAway){
		jsonstr.addData("FGiveAway", FGiveAway);
	}

	/**
	 * 备注
	 * @param FNote
	 */
	public void setFNote(String FNote){
		jsonstr.addData("FNote", FNote);
	}

	/**
	 * 生产日期
	 * @param FProduceDate
	 */
	public void setFProduceDate(String FProduceDate){
		jsonstr.addData("FProduceDate", FProduceDate);
	}

	/**
	 * 辅单位
	 * @param FExtAuxUnitId
	 */
	public void setFExtAuxUnitId(String FExtAuxUnitId){
		jsonstr.addFNumberData("FExtAuxUnitId", FExtAuxUnitId);
	}

	/**
	 * 实收数量(辅单位)
	 * @param FExtAuxUnitQty
	 */
	public void setFExtAuxUnitQty(double FExtAuxUnitQty){
		jsonstr.addData("FExtAuxUnitQty", FExtAuxUnitQty);
	}

	/**
	 * 来料检验
	 * @param FCheckInComing
	 */
	public void setFCheckInComing(boolean FCheckInComing){
		jsonstr.addData("FCheckInComing", FCheckInComing);
	}

	/**
	 * 项目编号
	 * @param FProjectNo
	 */
	public void setFProjectNo(String FProjectNo){
		jsonstr.addData("FProjectNo", FProjectNo);
	}

	/**
	 * 样本破坏数量(计价单位)
	 * @param FSampleDamageQty
	 */
	public void setFSampleDamageQty(double FSampleDamageQty){
		jsonstr.addData("FSampleDamageQty", FSampleDamageQty);
	}

	/**
	 * 样本破坏数量（计价基本）
	 * @param FSampleDamageBaseQty
	 */
	public void setFSampleDamageBaseQty(double FSampleDamageBaseQty){
		jsonstr.addData("FSampleDamageBaseQty", FSampleDamageBaseQty);
	}

	/**
	 * 收料更新库存
	 * @param FIsReceiveUpdateStock
	 */
	public void setFIsReceiveUpdateStock(boolean FIsReceiveUpdateStock){
		jsonstr.addData("FIsReceiveUpdateStock", FIsReceiveUpdateStock);
	}

	/**
	 * 已开票关联数量
	 * @param FInvoicedJoinQty
	 */
	public void setFInvoicedJoinQty(double FInvoicedJoinQty){
		jsonstr.addData("FInvoicedJoinQty", FInvoicedJoinQty);
	}

	/**
	 * 计价基本数量
	 * @param FPriceBaseQty
	 */
	public void setFPriceBaseQty(double FPriceBaseQty){
		jsonstr.addData("FPriceBaseQty", FPriceBaseQty);
	}

	/**
	 * 定价单位
	 * @param FSetPriceUnitID
	 */
	public void setFSetPriceUnitID(String FSetPriceUnitID){
		jsonstr.addFNumberData("FSetPriceUnitID", FSetPriceUnitID);
	}

	/**
	 * 采购单位(必填项)
	 * @param FRemainInStockUnitId
	 */
	public void setFRemainInStockUnitId(String FRemainInStockUnitId){
		jsonstr.addFNumberData("FRemainInStockUnitId", FRemainInStockUnitId);
	}

	/**
	 * 立账关闭
	 * @param FBILLINGCLOSE
	 */
	public void setFBILLINGCLOSE(boolean FBILLINGCLOSE){
		jsonstr.addData("FBILLINGCLOSE", FBILLINGCLOSE);
	}

	/**
	 * 采购数量
	 * @param FRemainInStockQty
	 */
	public void setFRemainInStockQty(double FRemainInStockQty){
		jsonstr.addData("FRemainInStockQty", FRemainInStockQty);
	}

	/**
	 * 未关联应付数量（计价单位）
	 * @param FAPNotJoinQty
	 */
	public void setFAPNotJoinQty(double FAPNotJoinQty){
		jsonstr.addData("FAPNotJoinQty", FAPNotJoinQty);
	}

	/**
	 * 采购基本数量
	 * @param FRemainInStockBaseQty
	 */
	public void setFRemainInStockBaseQty(double FRemainInStockBaseQty){
		jsonstr.addData("FRemainInStockBaseQty", FRemainInStockBaseQty);
	}

	/**
	 * 折扣率(%)
	 * @param FDiscountRate
	 */
	public void setFDiscountRate(double FDiscountRate){
		jsonstr.addData("FDiscountRate", FDiscountRate);
	}

	/**
	 * 成本价
	 * @param FCostPrice
	 */
	public void setFCostPrice(double FCostPrice){
		jsonstr.addData("FCostPrice", FCostPrice);
	}

	/**
	 * BOM版本
	 * @param FBOMId
	 */
	public void setFBOMId(String FBOMId){
		jsonstr.addFNumberData("FBOMId", FBOMId);
	}

	/**
	 * 供应商批号
	 * @param FSupplierLot
	 */
	public void setFSupplierLot(String FSupplierLot){
		jsonstr.addData("FSupplierLot", FSupplierLot);
	}

	/**
	 * 有效期至
	 * @param FExpiryDate
	 */
	public void setFExpiryDate(String FExpiryDate){
		jsonstr.addData("FExpiryDate", FExpiryDate);
	}

	/**
	 * 数量（库存辅单位）
	 * @param FAuxUnitQty
	 */
	public void setFAuxUnitQty(double FAuxUnitQty){
		jsonstr.addData("FAuxUnitQty", FAuxUnitQty);
	}

	/**
	 * 拆单前原计价数量
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
	 * 税率
	 * @param FDetailID
	 * @param FTaxRate 税率%
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
	 * 序列号
	 * @param FDetailID
	 * @param FSerialNo 序列号
	 * @param FSerialNote 备注
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
