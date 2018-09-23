package com.xohaa.k3cloud.save;
import com.xohaa.k3cloud.FormID;
import com.xohaa.k3cloud.fentity.contract.FContractClause;
import com.xohaa.k3cloud.fentity.contract.FContractEntry;
import com.xohaa.k3cloud.fentity.contract.FContractFin;
import com.xohaa.k3cloud.fentity.contract.FPayPlanEntry;
import com.xohaa.k3cloud.webapi.Save;
/**
 * 采购合同
 * @author Administrator
 *
 */
public class SaveContract extends Save{
	public SaveContract() throws Exception{
		super(FormID.CONTRACT);
	}

	/**
	 * 
	 * @param FID
	 */
	public void setFID(String FID) {
		this.setModelData("FID", FID);
		
	}

	/**
	 * 单据类型(必填项)
	 * @param FBillTypeID
	 */
	public void setFBillTypeID(String fnumber) {
		this.setModelFNumberData("FBillTypeID", fnumber);
	}
	/**
	 * 对应组织
	 * @param FCorrespondOrgId
	 */
	public void setFCorrespondOrgId(String fnumber) {
		this.setModelFNumberData("FCorrespondOrgId", fnumber);
	}

	/**
	 * 合同编号
	 * @param FBillNo
	 */
	public void setFBillNo(String FBillNo) {
		this.setModelData("FBillNo", FBillNo);
	}
	
	/**
	 * 合同签订日期(必填项)
	 * @param FDate
	 */
	public void setFDate(String FDate) {
		this.setModelData("FDate", FDate);
	}

	/**
	 * 合同开始日期(必填项)
	 * @param FBeginDate
	 */
	public void setFBeginDate(String FBeginDate) {
		this.setModelData("FBeginDate", FBeginDate);
	}

	/**
	 * 合同结束日期(必填项)
	 * @param FEndDate
	 */
	public void setFEndDate(String FEndDate) {
		this.setModelData("FEndDate", FEndDate);
	}

	/**
	 * 供应商(必填项)
	 * @param FSupplierId
	 */
	public void setFSupplierId(String FSupplierId) {
		this.setModelFNumberData("FSupplierId", FSupplierId);
	}

	/**
	 * 采购组织(必填项)
	 * @param FPurchaseOrgId
	 */
	public void setFPurchaseOrgId(String FPurchaseOrgId) {
		this.setModelFNumberData("FPurchaseOrgId", FPurchaseOrgId);
	}

	/**
	 * 采购部门
	 * @param FPurchaseDeptId
	 */
	public void setFPurchaseDeptId(String FPurchaseDeptId) {
		this.setModelFNumberData("FPurchaseDeptId", FPurchaseDeptId);
	}

	/**
	 * 采购组
	 * @param FPurchaserGroupId
	 */
	public void setFPurchaserGroupId(String FPurchaserGroupId) {
		this.setModelFNumberData("FPurchaserGroupId", FPurchaserGroupId);
	}

	/**
	 * 采购员
	 * @param FPurchaserId
	 */
	public void setFPurchaserId(String FPurchaserId) {
		this.setModelFNumberData("FPurchaserId", FPurchaserId);
	}

	/**
	 * 供货方
	 * @param FProviderId
	 */
	public void setFProviderId(String FProviderId) {
		this.setModelFNumberData("FProviderId", FProviderId);
	}

	/**
	 * 供货方地址
	 * @param FProviderAddress
	 */
	public void setFProviderAddress(String FProviderAddress) {
		this.setModelData("FProviderAddress", FProviderAddress);
	}

	/**
	 * 结算方
	 * @param FSettleId
	 */
	public void setFSettleId(String FSettleId) {
		this.setModelFNumberData("FSettleId", FSettleId);
	}

	/**
	 * 收款方
	 * @param FChargeId
	 */
	public void setFChargeId(String FChargeId) {
		this.setModelFNumberData("FChargeId", FChargeId);
	}

	/**
	 * 合同名称(必填项)
	 * @param FCONTRACTNAME
	 */
	public void setFCONTRACTNAME(String FCONTRACTNAME) {
		this.setModelData("FCONTRACTNAME", FCONTRACTNAME);
	}

	/**
	 * 对方联系人
	 * @param FProviderContactId
	 * @
	 */
	public void setFProviderContactId(String FProviderContactId) {
		StringBuffer buf = new StringBuffer(40);
		buf.append("(\"FCONTACTNUMBER\":\"").append(FProviderContactId).append("\"}");
		this.setModelData("FProviderContactId",buf);
	}

	/**
	 * 录入明细
	 * @param FISINPUTDETAIL
	 */
	public void setFISINPUTDETAIL(boolean FISINPUTDETAIL) {
		this.setModelData("FISINPUTDETAIL", FISINPUTDETAIL);
	}

	/**
	 * 项目名称
	 * @param F_PAEZ_Assistant
	 */
	public void setF_PAEZ_Assistant(String F_PAEZ_Assistant) {
		this.setModelFNumberData("F_PAEZ_Assistant", F_PAEZ_Assistant);
	}

	/**
	 * 合同类型
	 * @param F_PAEZ_Combo
	 */
	public void setF_PAEZ_Combo(String F_PAEZ_Combo) {
		this.setModelData("F_PAEZ_Combo", F_PAEZ_Combo);
	}

	/**
	 * 金蝶合同号
	 * @param F_PAEZ_Text
	 */
	public void setF_PAEZ_Text(String F_PAEZ_Text) {
		this.setModelData("F_PAEZ_Text", F_PAEZ_Text);
	}

	/**
	 * 项目编号
	 * @param F_PAEZ_Text1
	 */
	public void setF_PAEZ_Text1(String F_PAEZ_Text1) {
		this.setModelData("F_PAEZ_Text1", F_PAEZ_Text1);
	}

	/**
	 * 合同金额
	 * @param F_PAEZ_Amount
	 */
	public void setF_PAEZ_Amount(double F_PAEZ_Amount) {
		this.setModelData("F_PAEZ_Amount", F_PAEZ_Amount);
	}

	/**
	 * 交货/完工时间
	 * @param F_PAEZ_Date
	 */
	public void setF_PAEZ_Date(String F_PAEZ_Date) {
		this.setModelData("F_PAEZ_Date", F_PAEZ_Date);
	}

	/**
	 * 备注
	 * @param F_PAEZ_Text2
	 */
	public void setF_PAEZ_Text2(String F_PAEZ_Text2) {
		this.setModelData("F_PAEZ_Text2", F_PAEZ_Text2);
	}

	/**
	 * 承包方式
	 * @param F_PAEZ_Combo1
	 */
	public void setF_PAEZ_Combo1(String F_PAEZ_Combo1) {
		this.setModelData("F_PAEZ_Combo1", F_PAEZ_Combo1);
	}

	/**
	 * 付款方式
	 * @param F_PAEZ_Text3
	 */
	public void setF_PAEZ_Text3(String F_PAEZ_Text3) {
		this.setModelData("F_PAEZ_Text3", F_PAEZ_Text3);
	}

	/**
	 * 交货方式
	 * @param F_PAEZ_Combo2
	 */
	public void setF_PAEZ_Combo2(String F_PAEZ_Combo2) {
		this.setModelData("F_PAEZ_Combo2", F_PAEZ_Combo2);
	}

	/**
	 * 价外税 JSONObject
	 * @param FContractFin
	 */
	public void setFContractFin(FContractFin FContractFin) {
		this.setModelData("FContractFin", FContractFin.getJSONObjectStr());
		//this.setModelFNumberData("FContractFin", FContractFin);
	}

	/**
	 * 条款编码 JSONArray
	 * @param FContractClause
	 * @
	 */
	public void setFContractClause(FContractClause FContractClause) {
		this.setModelData("FContractClause", FContractClause.getArrayListStr());
	}
	/**
	 * 行项目
	 * @param FContractEntry

	 */
	public void setFContractEntry(FContractEntry FContractEntry) {
		this.setModelData("FContractEntry", FContractEntry.getArrayListStr());
	}

	/**
	 * 付款
	 * @param FPayPlanEntry
	 */
	public void setFPayPlanEntry(FPayPlanEntry FPayPlanEntry) {
		this.setModelData("FPayPlanEntry", FPayPlanEntry.getArrayListStr());
	}
}