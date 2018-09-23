package com.xohaa.k3cloud.fentity.poorder;
import com.xohaa.k3cloud.fentity.EntryData;
public class FPOOrderEntry extends EntryData{
	public FPOOrderEntry(){
		super();
	}
	/**
	 * 
	 * @param FEntryID
	 */
	public void setFEntryID(String FEntryID)  {
		jsonstr.addData("FEntryID",FEntryID);
	}

	/**
	 * 产品类型
	 * @param FProductType
	 */
	public void setFProductType(String FProductType)  {
		jsonstr.addData("FProductType",FProductType);
	}

	/**
	 * 物料编码(必填项)
	 * @param FMaterialId
	 */
	public void setFMaterialId(String FMaterialId)  {
		jsonstr.addFNumberData("FMaterialId", FMaterialId);
	}

	/**
	 * BOM版本
	 * @param FBomId
	 */
	public void setFBomId(String FBomId)  {
		jsonstr.addFNumberData("FBomId", FBomId);
	}

	/**
	 * 辅助属性
	 * @param FAuxPropId
	 */
	public void setFAuxPropId(String FAuxPropId)  {
		jsonstr.addFNumberData("FAuxPropId", FAuxPropId);
	}

	/**
	 * 物料说明
	 * @param FMaterialDesc
	 */
	public void setFMaterialDesc(String FMaterialDesc)  {
		jsonstr.addData("FMaterialDesc",FMaterialDesc);
	}
	/**
	 * 采购单位(必填项)
	 * @param FUnitId
	 */
	public void setFUnitId(String FUnitId)  {
		jsonstr.addFNumberData("FUnitId", FUnitId);
	}
	/**
	 * 采购数量
	 * @param FQty
	 */
	public void setFQty(double FQty)  {
		jsonstr.addData("FQty",FQty);
	}
	/**
	 * 计价单位(必填项)
	 * @param FPriceUnitId
	 */
	public void setFPriceUnitId(String FPriceUnitId)  {
		jsonstr.addFNumberData("FPriceUnitId", FPriceUnitId);
	}

	/**
	 * 计价数量
	 * @param FPriceUnitQty
	 */
	public void setFPriceUnitQty(double FPriceUnitQty)  {
		jsonstr.addData("FPriceUnitQty",FPriceUnitQty);
	}

	/**
	 * 计价基本数量
	 * @param FPriceBaseQty
	 */
	public void setFPriceBaseQty(double FPriceBaseQty)  {
		jsonstr.addData("FPriceBaseQty",FPriceBaseQty);
	}

	/**
	 * 交货日期
	 * @param FDeliveryDate
	 */
	public void setFDeliveryDate(String FDeliveryDate)  {
		jsonstr.addData("FDeliveryDate",FDeliveryDate);
	}

	/**
	 * 交货地点
	 * @param FLocation
	 */
	public void setFLocation(String FLocation)  {
		jsonstr.addData("FLocation",FLocation);
	}

	/**
	 * 交货地址
	 * @param FLocationAddress
	 */
	public void setFLocationAddress(String FLocationAddress)  {
		jsonstr.addData("FLocationAddress",FLocationAddress);
	}

	/**
	 * 不含税单价
	 * @param FPrice
	 */
	public void setFPrice(double FPrice)  {
		jsonstr.addData("FPrice",FPrice);
	}

	/**
	 * 含税单价
	 * @param FTaxPrice
	 */
	public void setFTaxPrice(double FTaxPrice)  {
		jsonstr.addData("FTaxPrice",FTaxPrice);
	}

	/**
	 * 折扣率%
	 * @param FEntryDiscountRate
	 */
	public void setFEntryDiscountRate(double FEntryDiscountRate)  {
		jsonstr.addData("FEntryDiscountRate",FEntryDiscountRate);
	}

	/**
	 * 税组合
	 * @param FTaxCombination
	 */
	public void setFTaxCombination(String FTaxCombination)  {
		jsonstr.addFNumberData("FTaxCombination", FTaxCombination);
	}

	/**
	 * 税率%
	 * @param FEntryTaxRate
	 */
	public void setFEntryTaxRate(double FEntryTaxRate)  {
		jsonstr.addData("FEntryTaxRate",FEntryTaxRate);
	}

	/**
	 * 计划到货日期
	 * @param F_PAEZ_Date
	 */
	public void setF_PAEZ_Date(String F_PAEZ_Date)  {
		jsonstr.addData("F_PAEZ_Date",F_PAEZ_Date);
	}

	/**
	 * 需求组织
	 * @param FRequireOrgId
	 */
	public void setFRequireOrgId(String FRequireOrgId)  {
		jsonstr.addFNumberData("FRequireOrgId", FRequireOrgId);
	}

	/**
	 * 需求部门
	 * @param FRequireDeptId
	 */
	public void setFRequireDeptId(String FRequireDeptId)  {
		jsonstr.addFNumberData("FRequireDeptId", FRequireDeptId);
	}

	/**
	 * 需求人
	 * @param FRequireStaffId
	 */
	public void setFRequireStaffId(String FRequireStaffId)  {
		jsonstr.addFNumberData("FRequireStaffId", FRequireStaffId);
	}

	/**
	 * 收料组织
	 * @param FReceiveOrgId
	 */
	public void setFReceiveOrgId(String FReceiveOrgId)  {
		jsonstr.addFNumberData("FReceiveOrgId", FReceiveOrgId);
	}

	/**
	 * 收料部门
	 * @param FReceiveDeptId
	 */
	public void setFReceiveDeptId(String FReceiveDeptId)  {
		jsonstr.addFNumberData("FReceiveDeptId", FReceiveDeptId);
	}

	/**
	 * 结算组织(必填项)
	 * @param FEntrySettleOrgId
	 */
	public void setFEntrySettleOrgId(String FEntrySettleOrgId)  {
		jsonstr.addFNumberData("FEntrySettleOrgId", FEntrySettleOrgId);
	}

	/**
	 * 是否赠品
	 * @param FGiveAway
	 */
	public void setFGiveAway(boolean FGiveAway)  {
		jsonstr.addData("FGiveAway",FGiveAway);
	}

	/**
	 * 备注
	 * @param FEntryNote
	 */
	public void setFEntryNote(String FEntryNote)  {
		jsonstr.addData("FEntryNote",FEntryNote);
	}

	/**
	 * 供应商物料编码
	 * @param FSupMatId
	 */
	public void setFSupMatId(String FSupMatId)  {
		jsonstr.addData("FSupMatId",FSupMatId);
	}

	/**
	 * 供应商物料名称
	 * @param FSupMatName
	 */
	public void setFSupMatName(String FSupMatName)  {
		jsonstr.addData("FSupMatName",FSupMatName);
	}

	/**
	 * 库存单位(必填项)
	 * @param FStockUnitID
	 */
	public void setFStockUnitID(String FStockUnitID)  {
		jsonstr.addFNumberData("FStockUnitID", FStockUnitID);
	}

	/**
	 * 库存数量
	 * @param FStockQty
	 */
	public void setFStockQty(double FStockQty)  {
		jsonstr.addData("FStockQty",FStockQty);
	}

	/**
	 * 库存基本数量
	 * @param FStockBaseQty
	 */
	public void setFStockBaseQty(double FStockBaseQty)  {
		jsonstr.addData("FStockBaseQty",FStockBaseQty);
	}

	/**
	 * 批号
	 * @param FLot
	 */
	public void setFLot(String FLot)  {
		jsonstr.addFNumberData("FLot", FLot);
	}

	/**
	 * 供应商批号
	 * @param FSupplierLot
	 */
	public void setFSupplierLot(String FSupplierLot)  {
		jsonstr.addData("FSupplierLot",FSupplierLot);
	}

	/**
	 * 加工商
	 * @param FProcesser
	 */
	public void setFProcesser(String FProcesser)  {
		jsonstr.addFNumberData("FProcesser", FProcesser);
	}

	/**
	 * 控制交货数量
	 * @param FDeliveryControl
	 */
	public void setFDeliveryControl(boolean FDeliveryControl)  {
		jsonstr.addData("FDeliveryControl",FDeliveryControl);
	}

	/**
	 * 控制交货时间
	 * @param FTimeControl
	 */
	public void setFTimeControl(boolean FTimeControl)  {
		jsonstr.addData("FTimeControl",FTimeControl);
	}

	/**
	 * 交货上限
	 * @param FDeliveryMaxQty
	 */
	public void setFDeliveryMaxQty(double FDeliveryMaxQty)  {
		jsonstr.addData("FDeliveryMaxQty",FDeliveryMaxQty);
	}

	/**
	 * 交货下限
	 * @param FDeliveryMinQty
	 */
	public void setFDeliveryMinQty(double FDeliveryMinQty)  {
		jsonstr.addData("FDeliveryMinQty",FDeliveryMinQty);
	}

	/**
	 * 交货提前天数
	 * @param FDeliveryBeforeDays
	 */
	public void setFDeliveryBeforeDays(int FDeliveryBeforeDays)  {
		jsonstr.addData("FDeliveryBeforeDays",FDeliveryBeforeDays);
	}

	/**
	 * 交货延迟天数
	 * @param FDeliveryDelayDays
	 */
	public void setFDeliveryDelayDays(int FDeliveryDelayDays)  {
		jsonstr.addData("FDeliveryDelayDays",FDeliveryDelayDays);
	}

	/**
	 * 最早交货日期
	 * @param FDeliveryEarlyDate
	 */
	public void setFDeliveryEarlyDate(String FDeliveryEarlyDate)  {
		jsonstr.addData("FDeliveryEarlyDate",FDeliveryEarlyDate);
	}

	/**
	 * 最晚交货日期
	 * @param FDeliveryLastDate
	 */
	public void setFDeliveryLastDate(String FDeliveryLastDate)  {
		jsonstr.addData("FDeliveryLastDate",FDeliveryLastDate);
	}

	/**
	 * 价格系数
	 * @param FPriceCoefficient
	 */
	public void setFPriceCoefficient(double FPriceCoefficient)  {
		jsonstr.addData("FPriceCoefficient",FPriceCoefficient);
	}

	/**
	 * 结算方式
	 * @param FEntrySettleModeId
	 */
	public void setFEntrySettleModeId(String FEntrySettleModeId)  {
		jsonstr.addFNumberData("FEntrySettleModeId", FEntrySettleModeId);
	}

	/**
	 * 消耗汇总数量
	 * @param FConsumeSumQty
	 */
	public void setFConsumeSumQty(double FConsumeSumQty)  {
		jsonstr.addData("FConsumeSumQty",FConsumeSumQty);
	}

	/**
	 * 合同单号
	 * @param FContractNo
	 */
	public void setFContractNo(String FContractNo) {
		jsonstr.addData("FContractNo",FContractNo);
	}

	/**
	 * 需求跟踪号
	 * @param FReqTraceNo
	 */
	public void setFReqTraceNo(String FReqTraceNo) {
		jsonstr.addData("FReqTraceNo",FReqTraceNo);
	}

	/**
	 * 计划跟踪号
	 * @param FMtoNo
	 */
	public void setFMtoNo(String FMtoNo) {
		jsonstr.addData("FMtoNo",FMtoNo);
	}

	/**
	 * 需求来源
	 * @param FDEMANDTYPE
	 */
	public void setFDEMANDTYPE(String FDEMANDTYPE) {
		jsonstr.addData("FDEMANDTYPE",FDEMANDTYPE);
	}

	/**
	 * 需求单据编号
	 * @param FDEMANDBILLNO
	 */
	public void setFDEMANDBILLNO(String FDEMANDBILLNO) {
		jsonstr.addData("FDEMANDBILLNO",FDEMANDBILLNO);
	}

	/**
	 * 0需求单据行号
	 * @param FDEMANDBILLENTRYSEQ
	 */
	public void setFDEMANDBILLENTRYSEQ(String FDEMANDBILLENTRYSEQ) {
		jsonstr.addData("FDEMANDBILLENTRYSEQ",FDEMANDBILLENTRYSEQ);
	}

	/**
	 * 需求单据分录内码
	 * @param FDEMANDBILLENTRYID
	 */
	public void setFDEMANDBILLENTRYID(String FDEMANDBILLENTRYID) {
		jsonstr.addData("FDEMANDBILLENTRYID",FDEMANDBILLENTRYID);
	}

	/**
	 * 交货地点
	 * @param FLocationId
	 */
	public void setFLocationId(String FLocationId) {
		jsonstr.addFNumberData("FLocationId", FLocationId);
	}

	/**
	 * 计划确认
	 * @param FPlanConfirm
	 */
	public void setFPlanConfirm(boolean FPlanConfirm) {
		jsonstr.addData("FPlanConfirm",FPlanConfirm);
	}

	/**
	 * 销售单位
	 * @param FSalUnitID
	 */
	public void setFSalUnitID(String FSalUnitID) {
		jsonstr.addFNumberData("FSalUnitID", FSalUnitID);
	}

	/**
	 * 销售数量
	 * @param FSalQty
	 */
	public void setFSalQty(double FSalQty) {
		jsonstr.addData("FSalQty",FSalQty);
	}

	/**
	 * 销售订单关联数量
	 * @param FSalJoinQty
	 */
	public void setFSalJoinQty(double FSalJoinQty) {
		jsonstr.addData("FSalJoinQty",FSalJoinQty);
	}

	/**
	 * 销售订单关联数量（采购基本）
	 * @param FBaseSalJoinQty
	 */
	public void setFBaseSalJoinQty(double FBaseSalJoinQty) {
		jsonstr.addData("FBaseSalJoinQty",FBaseSalJoinQty);
	}

	/**
	 * 定价单位
	 * @param FSetPriceUnitID
	 */
	public void setFSetPriceUnitID(String FSetPriceUnitID) {
		jsonstr.addFNumberData("FSetPriceUnitID", FSetPriceUnitID);
	}

	/**
	 * 当前库存
	 * @param FInventoryQty
	 */
	public void setFInventoryQty(double FInventoryQty) {
		jsonstr.addData("FInventoryQty",FInventoryQty);
	}

	/**
	 * 费用项目
	 * @param FChargeProjectID
	 */
	public void setFChargeProjectID(String FChargeProjectID) {
		jsonstr.addFNumberData("FChargeProjectID", FChargeProjectID);
	}

	/**
	 * 集中结算组织(6.0废弃)
	 * @param FCentSettleOrgId
	 */
	public void setFCentSettleOrgId(String FCentSettleOrgId) {
		jsonstr.addFNumberData("FCentSettleOrgId", FCentSettleOrgId);
	}

	/**
	 * 分散结算组织(6.0废弃)
	 * @param FDispSettleOrgId
	 */
	public void setFDispSettleOrgId(String FDispSettleOrgId) {
		jsonstr.addFNumberData("FDispSettleOrgId", FDispSettleOrgId);
	}

	/**
	 * 组别
	 * @param FGroup
	 */
	public void setFGroup(double FGroup) {
		jsonstr.addData("FGroup",FGroup);
	}

	/**
	 * 交货库存状态
	 * @param FDeliveryStockStatus
	 */
	public void setFDeliveryStockStatus(String FDeliveryStockStatus) {
		jsonstr.addFNumberData("FDeliveryStockStatus", FDeliveryStockStatus);
	}

	/**
	 * 最低报价(6.1废弃)
	 * @param FMinPrice
	 */
	public void setFMinPrice(double FMinPrice) {
		jsonstr.addData("FMinPrice",FMinPrice);
	}

	/**
	 * 最高报价(6.1废弃)
	 * @param FMaxPrice
	 */
	public void setFMaxPrice(double FMaxPrice) {
		jsonstr.addData("FMaxPrice",FMaxPrice);
	}

	/**
	 * 是否可库存
	 * @param FIsStock
	 */
	public void setFIsStock(boolean FIsStock) {
		jsonstr.addData("FIsStock",FIsStock);
	}

	/**
	 * 消耗汇总基本单位数量
	 * @param FBaseConsumeSumQty
	 */
	public void setFBaseConsumeSumQty(double FBaseConsumeSumQty) {
		jsonstr.addData("FBaseConsumeSumQty",FBaseConsumeSumQty);
	}

	/**
	 * 销售基本数量
	 * @param FSalBaseQty
	 */
	public void setFSalBaseQty(double FSalBaseQty) {
		jsonstr.addData("FSalBaseQty",FSalBaseQty);
	}

	/**
	 * 委外组织
	 * @param FSubOrgId
	 */
	public void setFSubOrgId(String FSubOrgId) {
		jsonstr.addFNumberData("FSubOrgId", FSubOrgId);
	}

	/**
	 * 付款组织
	 * @param FEntryPayOrgId
	 */
	public void setFEntryPayOrgId(String FEntryPayOrgId) {
		jsonstr.addFNumberData("FEntryPayOrgId", FEntryPayOrgId);
	}

	/**
	 * 交货计划
	 * @param FEntryDeliveryPlan
	 */
	public void setFEntryDeliveryPlan(FEntryDeliveryPlan FEntryDeliveryPlan) {
		jsonstr.addData("FEntryDeliveryPlan", FEntryDeliveryPlan.getArrayListStr());
	}

	/**
	 * 税率
	 * @param FTaxDetailSubEntity
	 */
	public void setFTaxDetailSubEntity(FTaxDetailSubEntity FTaxDetailSubEntity) {
		jsonstr.addData("FTaxDetailSubEntity", FTaxDetailSubEntity.getArrayListStr());
	}
}
