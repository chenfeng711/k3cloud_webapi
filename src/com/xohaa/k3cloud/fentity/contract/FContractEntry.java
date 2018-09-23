package com.xohaa.k3cloud.fentity.contract;
import com.xohaa.k3cloud.fentity.EntryData;
/**
 * 行项目
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
	 * 物料编码(必填项
	 * @param FMaterialId
	 */
	public void setFMaterialId(String FMaterialId){
		jsonstr.addFNumberData("FMaterialId",FMaterialId);
	}

	/**
	 * 物料说明
	 * @param FMaterialDesc
	 */
	public void setFMaterialDesc(String FMaterialDesc){
		jsonstr.addData("FMaterialDesc", FMaterialDesc);
	}

	/**
	 * 采购单位(必填项
	 * @param FUnitId
	 */
	public void setFUnitId(String FUnitId){
		jsonstr.addFNumberData("FUnitId",FUnitId);
	}

	/**
	 * 辅助属性
	 * @param FAuxPropId
	 */
	public void setFAuxPropId(String FAuxPropId){
		jsonstr.addFNumberData("FAuxPropId",FAuxPropId);
	}

	/**
	 * 合同数量
	 * @param FQty
	 */
	public void setFQty(double FQty){
		jsonstr.addData("FQty", FQty);
	}

	/**
	 * 计价单位(必填项)
	 * @param FPriceUnitId
	 */
	public void setFPriceUnitId(String FPriceUnitId){
		jsonstr.addFNumberData("FPriceUnitId",FPriceUnitId);
	}

	/**
	 * 计价数量
	 * @param FPriceUnitQty
	 */
	public void setFPriceUnitQty(double FPriceUnitQty){
		jsonstr.addData("FPriceUnitQty", FPriceUnitQty);
	}

	/**
	 * 交货日期
	 * @param FDeliveryDate
	 */
	public void setFDeliveryDate(String FDeliveryDate){
		jsonstr.addData("FDeliveryDate", FDeliveryDate);
	}

	/**
	 * 单价
	 * @param FPrice
	 */
	public void setFPrice(double FPrice){
		jsonstr.addData("FPrice", FPrice);
	}

	/**
	 * 含税单价
	 * @param FTaxPrice
	 */
	public void setFTaxPrice(double FTaxPrice){
		jsonstr.addData("FTaxPrice", FTaxPrice);
	}

	/**
	 * 折扣率%
	 * @param FEntryDiscountRate
	 */
	public void setFEntryDiscountRate(double FEntryDiscountRate){
		jsonstr.addData("FEntryDiscountRate", FEntryDiscountRate);
	}

	/**
	 * 税组合
	 * @param FTaxCombination
	 */
	public void setFTaxCombination(String FTaxCombination){
		jsonstr.addFNumberData("FTaxCombination",FTaxCombination);
	}

	/**
	 * 税率%
	 * @param FEntryTaxRate
	 */
	public void setFEntryTaxRate(double FEntryTaxRate){
		jsonstr.addData("FEntryTaxRate", FEntryTaxRate);
	}

	/**
	 * 需求组织
	 * @param FRequireOrgId
	 */
	public void setFRequireOrgId(String FRequireOrgId){
		jsonstr.addFNumberData("FRequireOrgId",FRequireOrgId);
	}

	/**
	 * 收料组织
	 * @param FReceiveOrgId
	 */
	public void setFReceiveOrgId(String FReceiveOrgId){
		jsonstr.addFNumberData("FReceiveOrgId",FReceiveOrgId);
	}

	/**
	 * 价格系数
	 * @param FPriceCoefficient
	 */
	public void setFPriceCoefficient(double FPriceCoefficient){
		jsonstr.addData("FPriceCoefficient", FPriceCoefficient);
	}
	
	/**
	 * 结算组织(必填项)
	 * @param FSettleOrgId
	 */
	public void setFSettleOrgId(String FSettleOrgId){
		jsonstr.addFNumberData("FSettleOrgId",FSettleOrgId);
	}

	/**
	 * 需求部门
	 * @param FRequireDeptId
	 */
	public void setFRequireDeptId(String FRequireDeptId){
		jsonstr.addFNumberData("FRequireDeptId",FRequireDeptId);
	}

	/**
	 * 需求人
	 * @param FRequireStaffId
	 */
	public void setFRequireStaffId(String FRequireStaffId){
		jsonstr.addFNumberData("FRequireStaffId",FRequireStaffId);
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
	 * @param FEntryNote
	 */
	public void setFEntryNote(String FEntryNote){
		jsonstr.addData("FEntryNote", FEntryNote);
	}

	/**
	 * 计划跟踪号
	 * @param FMtoNo
	 */
	public void setFMtoNo(String FMtoNo){
		jsonstr.addData("FMtoNo", FMtoNo);
	}

	/**
	 * 交货地址
	 * @param FDeliveryAddr
	 */
	public void setFDeliveryAddr(String FDeliveryAddr){
		jsonstr.addData("FDeliveryAddr", FDeliveryAddr);
	}

	/**
	 * 计划确认
	 * @param FPlanConfirm
	 */
	public void setFPlanConfirm(boolean FPlanConfirm){
		jsonstr.addData("FPlanConfirm", FPlanConfirm);
	}

	/**
	 * 需求跟踪号
	 * @param FReqTraceNo
	 */
	public void setFReqTraceNo(String FReqTraceNo){
		jsonstr.addData("FReqTraceNo", FReqTraceNo);
	}

	/**
	 * BOM版本
	 * @param FBomId
	 */
	public void setFBomId(String FBomId){
		jsonstr.addData("FBomId",FBomId);
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
		jsonstr.addData("FSetPriceUnitID",FSetPriceUnitID);
	}

	/**
	 * 库存单位(必填项)
	 * @param FStockUnitID
	 */
	public void setFStockUnitID(String FStockUnitID){
		jsonstr.addData("FStockUnitID",FStockUnitID);
	}

	/**
	 * 库存数量
	 * @param FStockQty
	 */
	public void setFStockQty(double FStockQty){
		jsonstr.addData("FStockQty", FStockQty);
	}

	/**
	 * 库存基本数量
	 * @param FStockBaseQty
	 */
	public void setFStockBaseQty(double FStockBaseQty){
		jsonstr.addData("FStockBaseQty", FStockBaseQty);
	}

	/**
	 * 税率
	 * @param FContractEntryTax
	 */
	public void setFContractEntryTax(FContractEntryTax ContractEntryTax){
		jsonstr.addData("FContractEntryTax", ContractEntryTax.getArrayListStr());
	}
}
