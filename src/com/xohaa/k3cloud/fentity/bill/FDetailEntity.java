package com.xohaa.k3cloud.fentity.bill;
import com.xohaa.k3cloud.fentity.EntryData;
/**
 * 收料单行项目
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
	 * 物料编码(必填项)
	 * @param FMaterialId
	 */
	public void setFMaterialId(String FMaterialId) {
		jsonstr.addFNumberData("FMaterialId", FMaterialId);
	}

	/**
	 * 物料说明
	 * @param FMaterialDesc
	 */
	public void setFMaterialDesc(String FMaterialDesc) {
		jsonstr.addData("FMaterialDesc", FMaterialDesc);
	}

	/**
	 * 收料单位(必填项)
	 * @param FUnitId
	 */
	public void setFUnitId(String FUnitId) {
		jsonstr.addFNumberData("FUnitId", FUnitId);
	}

	/**
	 * 交货数量
	 * @param FActReceiveQty
	 */
	public void setFActReceiveQty(double FActReceiveQty) {
		jsonstr.addData("FActReceiveQty", FActReceiveQty);
	}

	/**
	 * 不含税单价
	 * @param FPrice
	 */
	public void setFPrice(double FPrice) {
		jsonstr.addData("FPrice", FPrice);
	}

	/**
	 * 含税单价
	 * @param FTaxPrice
	 */
	public void setFTaxPrice(double FTaxPrice) {
		jsonstr.addData("FTaxPrice", FTaxPrice);
	}

	/**
	 * 预计到货日期
	 * @param FPreDeliveryDate
	 */
	public void setFPreDeliveryDate(String FPreDeliveryDate) {
		jsonstr.addData("FPreDeliveryDate", FPreDeliveryDate);
	}

	/**
	 * 供应商交货数量
	 * @param FSUPDELQTY
	 */
	public void setFSUPDELQTY(double FSUPDELQTY) {
		jsonstr.addData("FSUPDELQTY", FSUPDELQTY);
	}

	/**
	 * 计价单位(必填项)
	 * @param FPriceUnitId
	 */
	public void setFPriceUnitId(String FPriceUnitId) {
		jsonstr.addFNumberData("FPriceUnitId", FPriceUnitId);
	}

	/**
	 * 仓库
	 * @param FStockID
	 */
	public void setFStockID(String FStockID) {
		jsonstr.addFNumberData("FStockID", FStockID);
	}

	/**
	 * 供应商
	 * @param F_PAEZ_Base
	 */
	public void setF_PAEZ_Base(String F_PAEZ_Base) {
		jsonstr.addFNumberData("F_PAEZ_Base", F_PAEZ_Base);
	}

	/**
	 * 库存状态
	 * @param FStockStatusId
	 */
	public void setFStockStatusId(String FStockStatusId) {
		jsonstr.addFNumberData("FStockStatusId", FStockStatusId);
	}

	/**
	 * 批号
	 * @param FLot
	 */
	public void setFLot(String FLot) {
		jsonstr.addFNumberData("FLot", FLot);
	}

	/**
	 * 拒收原因
	 * @param FRejectReason
	 */
	public void setFRejectReason(String FRejectReason) {
		jsonstr.addData("FRejectReason", FRejectReason);
	}

	/**
	 * 生产日期
	 * @param FProduceDate
	 */
	public void setFProduceDate(String FProduceDate) {
		jsonstr.addData("FProduceDate", FProduceDate);
	}

	/**
	 * 需求部门
	 * @param FDemandDeptId
	 */
	public void setFDemandDeptId(String FDemandDeptId) {
		jsonstr.addFNumberData("FDemandDeptId", FDemandDeptId);
	}

	/**
	 * 是否赠品
	 * @param FGiveAway
	 */
	public void setFGiveAway(boolean FGiveAway) {
		jsonstr.addData("FGiveAway", FGiveAway);
	}

	/**
	 * 费用项目
	 * @param FChargeProjectID
	 */
	public void setFChargeProjectID(String FChargeProjectID) {
		jsonstr.addFNumberData("FChargeProjectID", FChargeProjectID);
	}

	/**
	 * 控制入库数量
	 * @param FCtrlStockInPercent
	 */
	public void setFCtrlStockInPercent(boolean FCtrlStockInPercent) {
		jsonstr.addData("FCtrlStockInPercent", FCtrlStockInPercent);
	}

	/**
	 * 计划跟踪号
	 * @param FMtoNo
	 */
	public void setFMtoNo(String FMtoNo) {
		jsonstr.addData("FMtoNo", FMtoNo);
	}

	/**
	 * 辅单位
	 * @param FExtAuxUnitId
	 */
	public void setFExtAuxUnitId(String FExtAuxUnitId) {
		jsonstr.addFNumberData("FExtAuxUnitId", FExtAuxUnitId);
	}

	/**
	 * 实收数量(辅单位)
	 * @param FExtAuxUnitQty
	 */
	public void setFExtAuxUnitQty(double FExtAuxUnitQty) {
		jsonstr.addData("FExtAuxUnitQty", FExtAuxUnitQty);
	}

	/**
	 * 项目编号
	 * @param FProjectNo
	 */
	public void setFProjectNo(String FProjectNo) {
		jsonstr.addData("FProjectNo", FProjectNo);
	}

	/**
	 * 检验关联数量（基本单位）
	 * @param FCheckJoinBaseQty
	 */
	public void setFCheckJoinBaseQty(double FCheckJoinBaseQty) {
		jsonstr.addData("FCheckJoinBaseQty", FCheckJoinBaseQty);
	}

	/**
	 * 合格数量（基本单位）
	 * @param FReceiveBaseQty
	 */
	public void setFReceiveBaseQty(double FReceiveBaseQty) {
		jsonstr.addData("FReceiveBaseQty", FReceiveBaseQty);
	}

	/**
	 * 判退数量（基本单位）
	 * @param FRefuseBaseQty
	 */
	public void setFRefuseBaseQty(double FRefuseBaseQty) {
		jsonstr.addData("FRefuseBaseQty", FRefuseBaseQty);
	}

	/**
	 * 样本破坏数量（基本单位）
	 * @param FSampleDamageBaseQty
	 */
	public void setFSampleDamageBaseQty(double FSampleDamageBaseQty) {
		jsonstr.addData("FSampleDamageBaseQty", FSampleDamageBaseQty);
	}

	/**
	 * 检验关联数量
	 * @param FCheckJoinQty
	 */
	public void setFCheckJoinQty(double FCheckJoinQty) {
		jsonstr.addData("FCheckJoinQty", FCheckJoinQty);
	}

	/**
	 * 合格数量
	 * @param FReceiveQty
	 */
	public void setFReceiveQty(double FReceiveQty) {
		jsonstr.addData("FReceiveQty", FReceiveQty);
	}

	/**
	 * 判退数量
	 * @param FRefuseQty
	 */
	public void setFRefuseQty(double FRefuseQty) {
		jsonstr.addData("FRefuseQty", FRefuseQty);
	}

	/**
	 * 样本破坏数量
	 * @param FSampleDamageQty
	 */
	public void setFSampleDamageQty(double FSampleDamageQty) {
		jsonstr.addData("FSampleDamageQty", FSampleDamageQty);
	}

	/**
	 * 来料检验
	 * @param FCheckInComing
	 */
	public void setFCheckInComing(boolean FCheckInComing) {
		jsonstr.addData("FCheckInComing", FCheckInComing);
	}

	/**
	 * 交货地点(2.0删除)
	 * @param FDeliverySite
	 */
	public void setFDeliverySite(String FDeliverySite) {
		jsonstr.addData("FDeliverySite", FDeliverySite);
	}

	/**
	 * 卡片关联数量
	 * @param FCardJoinQty
	 */
	public void setFCardJoinQty(double FCardJoinQty) {
		jsonstr.addData("FCardJoinQty", FCardJoinQty);
	}

	/**
	 * 卡片数量
	 * @param FCardQty
	 */
	public void setFCardQty(double FCardQty) {
		jsonstr.addData("FCardQty", FCardQty);
	}

	/**
	 * 卡片数量(基本单位)
	 * @param FCardBaseQty
	 */
	public void setFCardBaseQty(double FCardBaseQty) {
		jsonstr.addData("FCardBaseQty", FCardBaseQty);
	}

	/**
	 * 卡片关联数量(基本单位)
	 * @param FCardJoinBaseQty
	 */
	public void setFCardJoinBaseQty(double FCardJoinBaseQty) {
		jsonstr.addData("FCardJoinBaseQty", FCardJoinBaseQty);
	}

	/**
	 * 检验数量（基本单位）
	 * @param FCheckBaseQty
	 */
	public void setFCheckBaseQty(double FCheckBaseQty) {
		jsonstr.addData("FCheckBaseQty", FCheckBaseQty);
	}

	/**
	 * 检验数量
	 * @param FCheckQty
	 */
	public void setFCheckQty(double FCheckQty) {
		jsonstr.addData("FCheckQty", FCheckQty);
	}

	/**
	 * 累计调拨数量(基本单位)
	 * @param FTransferBaseQty
	 */
	public void setFTransferBaseQty(double FTransferBaseQty) {
		jsonstr.addData("FTransferBaseQty", FTransferBaseQty);
	}

	/**
	 * 收料更新库存(废弃)
	 * @param FIsReceiveUpdateStock
	 */
	public void setFIsReceiveUpdateStock(boolean FIsReceiveUpdateStock) {
		jsonstr.addData("FIsReceiveUpdateStock", FIsReceiveUpdateStock);
	}

	/**
	 * 累计调拨数量
	 * @param FTransferQty
	 */
	public void setFTransferQty(double FTransferQty) {
		jsonstr.addData("FTransferQty", FTransferQty);
	}

	/**
	 * BOM版本
	 * @param FBomId
	 */
	public void setFBomId(String FBomId) {
		jsonstr.addFNumberData("FBomId", FBomId);
	}

	/**
	 * 供应商批号
	 * @param FSupplierLot
	 */
	public void setFSupplierLot(String FSupplierLot) {
		jsonstr.addData("FSupplierLot", FSupplierLot);
	}

	/**
	 * 有效期至
	 * @param FExpiryDate
	 */
	public void setFExpiryDate(String FExpiryDate) {
		jsonstr.addData("FExpiryDate", FExpiryDate);
	}

	/**
	 * 库存辅单位数量
	 * @param FAuxUnitQty
	 */
	public void setFAuxUnitQty(double FAuxUnitQty) {
		jsonstr.addData("FAuxUnitQty", FAuxUnitQty);
	}

	/**
	 * 备注
	 * @param FDescription
	 */
	public void setFDescription(String FDescription) {
		jsonstr.addData("FDescription", FDescription);
	}

	/**
	 * 入库上限
	 * @param FStockInMaxQty
	 */
	public void setFStockInMaxQty(double FStockInMaxQty) {
		jsonstr.addData("FStockInMaxQty", FStockInMaxQty);
	}

	/**
	 * 入库下限
	 * @param FStockInMinQty
	 */
	public void setFStockInMinQty(double FStockInMinQty) {
		jsonstr.addData("FStockInMinQty", FStockInMinQty);
	}

	/**
	 * 税率%
	 * @param FEntryTaxRate
	 */
	public void setFEntryTaxRate(double FEntryTaxRate) {
		jsonstr.addData("FEntryTaxRate", FEntryTaxRate);
	}

	/**
	 * 税组合
	 * @param FTaxCombination
	 */
	public void setFTaxCombination(String FTaxCombination) {
		jsonstr.addFNumberData("FTaxCombination", FTaxCombination);
	}

	/**
	 * 折扣率%
	 * @param FDiscountRate
	 */
	public void setFDiscountRate(double FDiscountRate) {
		jsonstr.addData("FDiscountRate", FDiscountRate);
	}

	/**
	 * 工废数量(基本单位)
	 * @param FProcScrapBaseQty
	 */
	public void setFProcScrapBaseQty(double FProcScrapBaseQty) {
		jsonstr.addData("FProcScrapBaseQty", FProcScrapBaseQty);
	}

	/**
	 * 工废数量
	 * @param FProcScrapQty
	 */
	public void setFProcScrapQty(double FProcScrapQty) {
		jsonstr.addData("FProcScrapQty", FProcScrapQty);
	}

	/**
	 * 料废数量(基本单位)
	 * @param FMtrlScrapBaseQty
	 */
	public void setFMtrlScrapBaseQty(double FMtrlScrapBaseQty) {
		jsonstr.addData("FMtrlScrapBaseQty", FMtrlScrapBaseQty);
	}

	/**
	 * 料废数量
	 * @param FMtrlScrapQty
	 */
	public void setFMtrlScrapQty(double FMtrlScrapQty) {
		jsonstr.addData("FMtrlScrapQty", FMtrlScrapQty);
	}

	/**
	 * 让步接收数量(基本单位)
	 * @param FCsnReceiveBaseQty
	 */
	public void setFCsnReceiveBaseQty(double FCsnReceiveBaseQty) {
		jsonstr.addData("FCsnReceiveBaseQty", FCsnReceiveBaseQty);
	}

	/**
	 * 让步接收数量
	 * @param FCsnReceiveQty
	 */
	public void setFCsnReceiveQty(double FCsnReceiveQty) {
		jsonstr.addData("FCsnReceiveQty", FCsnReceiveQty);
	}

	/**
	 * 不合格关联数量(基本单位)
	 * @param FRefuseJoinBaseQty
	 */
	public void setFRefuseJoinBaseQty(double FRefuseJoinBaseQty) {
		jsonstr.addData("FRefuseJoinBaseQty", FRefuseJoinBaseQty);
	}

	/**
	 * 不合格关联数量
	 * @param FRefuseJoinQty
	 */
	public void setFRefuseJoinQty(double FRefuseJoinQty) {
		jsonstr.addData("FRefuseJoinQty", FRefuseJoinQty);
	}

	/**
	 * 让步接收关联数量(基本单位)
	 * @param FCsnReceiveJoinBaseQty
	 */
	public void setFCsnReceiveJoinBaseQty(double FCsnReceiveJoinBaseQty) {
		jsonstr.addData("FCsnReceiveJoinBaseQty", FCsnReceiveJoinBaseQty);
	}

	/**
	 * 让步接收关联数量
	 * @param FCsnReceiveJoinQty
	 */
	public void setFCsnReceiveJoinQty(double FCsnReceiveJoinQty) {
		jsonstr.addData("FCsnReceiveJoinQty", FCsnReceiveJoinQty);
	}

	/**
	 * 计价基本数量
	 * @param FPriceBaseQty
	 */
	public void setFPriceBaseQty(double FPriceBaseQty) {
		jsonstr.addData("FPriceBaseQty", FPriceBaseQty);
	}

	/**
	 * 定价单位
	 * @param FSetPriceUnitID
	 */
	public void setFSetPriceUnitID(String FSetPriceUnitID) {
		jsonstr.addFNumberData("FSetPriceUnitID", FSetPriceUnitID);
	}

	/**
	 * 库存单位(必填项)
	 * @param FStockUnitID
	 */
	public void setFStockUnitID(String FStockUnitID) {
		jsonstr.addFNumberData("FStockUnitID", FStockUnitID);
	}

	/**
	 * 库存数量
	 * @param FStockQty
	 */
	public void setFStockQty(double FStockQty) {
		jsonstr.addData("FStockQty", FStockQty);
	}

	/**
	 * 库存基本数量
	 * @param FStockBaseQty
	 */
	public void setFStockBaseQty(double FStockBaseQty) {
		jsonstr.addData("FStockBaseQty", FStockBaseQty);
	}

	/**
	 * 实到数量
	 * @param FActlandQty
	 */
	public void setFActlandQty(double FActlandQty) {
		jsonstr.addData("FActlandQty", FActlandQty);
	}

	/**
	 * 确认交货数量
	 * @param FConfirmDeliQty
	 */
	public void setFConfirmDeliQty(double FConfirmDeliQty) {
		jsonstr.addData("FConfirmDeliQty", FConfirmDeliQty);
	}

	/**
	 * 确认到货日期
	 * @param FConfirmDeliDate
	 */
	public void setFConfirmDeliDate(String FConfirmDeliDate) {
		jsonstr.addData("FConfirmDeliDate", FConfirmDeliDate);
	}

	/**
	 * 确认意见
	 * @param FConfirmInfo
	 */
	public void setFConfirmInfo(String FConfirmInfo) {
		jsonstr.addData("FConfirmInfo", FConfirmInfo);
	}
}
