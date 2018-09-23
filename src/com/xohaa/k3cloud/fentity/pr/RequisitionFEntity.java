package com.xohaa.k3cloud.fentity.pr;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.xohaa.k3cloud.fentity.EntryData;
/**
 * 
 * @author chenjianxiong
 *
 */
public class RequisitionFEntity extends EntryData {
	private JSONObject json = null;
	private JSONArray arr = null;
	public JSONArray getJSONArray() {
		return arr;
	}
	public JSONObject getJSONObject() {
		return json;
	}
	/**
	 * 
	 */
	public RequisitionFEntity(){
		json = new JSONObject();
		arr = new JSONArray();
	}

	/**
	 * 
	 */
	public void addJSONToArray(){
		arr.put(json);
		json = new JSONObject();
	}

	/**
	 * 
	 * @param FEntryID
	 * @throws JSONException
	 */
	public void setFEntryID(long FEntryID) throws JSONException {
		this.json.put("FEntryID", FEntryID);
	}

	/**
	 * 需求组织(必填项)
	 * @param FRequireOrgId
	 * @throws JSONException
	 */
	public void setFRequireOrgId(String FRequireOrgId)throws JSONException {
		this.json.put("FRequireOrgId", new JSONObject().put("FNumber", FRequireOrgId));
	}

	/**
	 * 物料编码(必填项)
	 * @param FMaterialId
	 * @throws JSONException
	 */
	public void setFMaterialId(String FMaterialId)throws JSONException {
		this.json.put("FMaterialId", new JSONObject().put("FNumber", FMaterialId));
	}

	/**
	 * 辅助属性
	 * @param FAuxpropId
	 * @throws JSONException
	 */
	public void setFAuxpropId(String FAuxpropId)throws JSONException {
		this.json.put("FAuxpropId", FAuxpropId);
	}
	
	/**
	 * 物料说明
	 * @param FMaterialDesc
	 * @throws JSONException
	 */
	public void setFMaterialDesc(String FMaterialDesc)throws JSONException {
		this.json.put("FMaterialDesc", FMaterialDesc);
	}

	/**
	 * 申请单位(必填项)
	 * @param FUnitId
	 * @throws JSONException
	 */
	public void setFUnitId(String FUnitId)throws JSONException {
		this.json.put("FUnitId", new JSONObject().put("FNumber", FUnitId));
	}

	/**
	 * 申请数量
	 * @param FReqQty
	 * @throws JSONException
	 */
	public void setFReqQty(String FReqQty) throws JSONException{
		this.json.put("FReqQty", FReqQty);
	}

	/**
	 * 需求日期
	 * @param F_PAEZ_Date
	 * @throws JSONException
	 */
	public void setF_PAEZ_Date(String F_PAEZ_Date) throws JSONException{
		this.json.put("F_PAEZ_Date", F_PAEZ_Date);
	}

	/**
	 * 采购组织(必填项)
	 * @param FPurchaseOrgId
	 * @throws JSONException
	 */
	public void setFPurchaseOrgId(String FPurchaseOrgId)throws JSONException {
		this.json.put("FPurchaseOrgId", new JSONObject().put("FNumber", FPurchaseOrgId));
	}

	/**
	 * 建议供应商
	 * @param FSuggestSupplierId
	 * @throws JSONException
	 */
	public void setFSuggestSupplierId(String FSuggestSupplierId)throws JSONException {
		this.json.put("FSuggestSupplierId", new JSONObject().put("FNumber", FSuggestSupplierId));
	}

	/**
	 * 收料组织
	 * @param FReceiveOrgId
	 * @throws JSONException
	 */
	public void setFReceiveOrgId(String FReceiveOrgId)throws JSONException {
		this.json.put("FReceiveOrgId", new JSONObject().put("FNumber", FReceiveOrgId));
	}

	/**
	 * 预估单价
	 * @param FEvaluatePrice
	 * @throws JSONException
	 */
	public void setFEvaluatePrice(double FEvaluatePrice)throws JSONException {
		this.json.put("FEvaluatePrice", FEvaluatePrice);
	}

	/**
	 * 含税单价
	 * @param FTAXPRICE
	 * @throws JSONException
	 */
	public void setFTAXPRICE(double FTAXPRICE) throws JSONException{
		this.json.put("FTAXPRICE", FTAXPRICE);
	}

	/**
	 * 税率%
	 * @param FTAXRATE
	 * @throws JSONException
	 */
	public void setFTAXRATE(double FTAXRATE)throws JSONException {
		this.json.put("FTAXRATE", FTAXRATE);
	}

	/**
	 * 计价单位(必填项)
	 * @param FPriceUnitId
	 * @throws JSONException
	 */
	public void setFPriceUnitId(String FPriceUnitId) throws JSONException{
		this.json.put("FPriceUnitId", new JSONObject().put("FNumber", FPriceUnitId));
	}

	/**
	 * 库存单位(必填项)
	 * @param FREQSTOCKUNITID
	 * @throws JSONException
	 */
	public void setFREQSTOCKUNITID(String FREQSTOCKUNITID) throws JSONException{
		this.json.put("FREQSTOCKUNITID", new JSONObject().put("FNumber", FREQSTOCKUNITID));
	}

	/**
	 * 库存数量
	 * @param FREQSTOCKQTY
	 * @throws JSONException
	 */
	public void setFREQSTOCKQTY(double FREQSTOCKQTY) throws JSONException{
		this.json.put("FREQSTOCKQTY", FREQSTOCKQTY);
	}

	/**
	 * 提前期
	 * @param FLeadTime
	 * @throws JSONException
	 */
	public void setFLeadTime(double FLeadTime) throws JSONException{
		this.json.put("FLeadTime", FLeadTime);
	}

	/**
	 * 指定供应商(6.0作废)
	 * @param FSupplierId
	 * @throws JSONException
	 */
	public void setFSupplierId(String FSupplierId) throws JSONException{
		this.json.put("FSupplierId", new JSONObject().put("FNumber", FSupplierId));
	}

	/**
	 * 费用项目
	 * @param FChargeProjectID
	 * @throws JSONException
	 */
	public void setFChargeProjectID(String FChargeProjectID)throws JSONException {
		this.json.put("FChargeProjectID", new JSONObject().put("FNumber", FChargeProjectID));
	}

	/**
	 * 采购部门
	 * @param FPurchaseDeptId
	 * @throws JSONException
	 */
	public void setFPurchaseDeptId(String FPurchaseDeptId)throws JSONException {
		this.json.put("FPurchaseDeptId", new JSONObject().put("FNumber", FPurchaseDeptId));
	}

	/**
	 * 交货地址
	 * @param FReceiveAddress
	 * @throws JSONException
	 */
	public void setFReceiveAddress(String FReceiveAddress) throws JSONException {
		this.json.put("FReceiveAddress", FReceiveAddress);
	}

	/**
	 * 备注
	 * @param FEntryNote
	 * @throws JSONException
	 */
	public void setFEntryNote(String FEntryNote) throws JSONException{
		this.json.put("FEntryNote", FEntryNote);
	}

	/**
	 * 采购员
	 * @param FPurchaserId
	 * @throws JSONException
	 */
	public void setFPurchaserId(String FPurchaserId)throws JSONException {
		this.json.put("FPurchaserId", new JSONObject().put("FNumber", FPurchaserId));
	}
	
	/**
	 * 采购组
	 * @param FPurchaseGroupId
	 * @throws JSONException
	 */
	public void setFPurchaseGroupId(String FPurchtaseGroupId)throws JSONException {
		this.json.put("FPurchaseGroupId", new JSONObject().put("FNumber", FPurchtaseGroupId));
	}

	/**
	 * BOM版本
	 * @param FBOMNoId
	 * @throws JSONException
	 */
	public void setFBOMNoId(String FBOMNoId) throws JSONException{
		this.json.put("FBOMNoId", new JSONObject().put("FNumber", FBOMNoId));
	}

	/**
	 * 仓库
	 * @param FStockId
	 * @throws JSONException
	 */
	public void setFStockId(String FStockId)throws JSONException {
		this.json.put("FStockId", new JSONObject().put("FNumber", FStockId));
	}

	/**
	 * 供货地点
	 * @param FProviderId
	 * @throws JSONException
	 */
	public void setFProviderId(String FProviderId) throws JSONException{
		this.json.put("FProviderId", new JSONObject().put("FNumber", FProviderId));
	}

	/**
	 * 计划跟踪号
	 * @param FMtoNo
	 * @throws JSONException
	 */
	public void setFMtoNo(String FMtoNo)throws JSONException {
		this.json.put("FMtoNo", FMtoNo);
	}

	/**
	 * 申请数量(基本单位)
	 * @param FBaseReqQty
	 * @throws JSONException
	 */
	public void setFBaseReqQty(String FBaseReqQty) throws JSONException{
		this.json.put("FBaseReqQty", FBaseReqQty);
	}

	/**
	 * 收料部门
	 * @param FReceiveDeptId
	 * @throws JSONException
	 */
	public void setFReceiveDeptId(String FReceiveDeptId)throws JSONException {
		this.json.put("FReceiveDeptId", new JSONObject().put("FNumber", FReceiveDeptId));
	}

	/**
	 * 需求部门
	 * @param FRequireDeptId
	 * @throws JSONException
	 */
	public void setFRequireDeptId(String FRequireDeptId)throws JSONException {
		this.json.put("FRequireDeptId", new JSONObject().put("FNumber", FRequireDeptId));
	}

	/**
	 * 销售单位
	 * @param FSalUnitID
	 * @throws JSONException
	 */
	public void setFSalUnitID(String FSalUnitID) throws JSONException{
		this.json.put("FSalUnitID", new JSONObject().put("FNumber", FSalUnitID));
	}

	/**
	 * 销售数量
	 * @param FSalQty
	 * @throws JSONException
	 */
	public void setFSalQty(double FSalQty)throws JSONException {
		this.json.put("FSalQty", FSalQty);
	}

	/**
	 * 销售基本数量
	 * @param FSalBaseQty
	 * @throws JSONException
	 */
	public void setFSalBaseQty(double FSalBaseQty)throws JSONException {
		this.json.put("FSalBaseQty", FSalBaseQty);
	}

	/**
	 * 库存基本数量
	 * @param FREQSTOCKBASEQTY
	 * @throws JSONException
	 */
	public void setFREQSTOCKBASEQTY(double FREQSTOCKBASEQTY) throws JSONException{
		this.json.put("FREQSTOCKBASEQTY", FREQSTOCKBASEQTY);
	}

	/**
	 * 计价基本数量
	 * @param FPRICEBASEQTY
	 * @throws JSONException
	 */
	public void setFPRICEBASEQTY(double FPRICEBASEQTY) throws JSONException{
		this.json.put("FPRICEBASEQTY", FPRICEBASEQTY);
	}

	/**
	 * VMI业务
	 * @param FIsVmiBusiness
	 * @throws JSONException
	 */
	public void setFIsVmiBusiness(boolean FIsVmiBusiness)throws JSONException {
		this.json.put("FIsVmiBusiness", FIsVmiBusiness);
	}

	/**
	 * 需求来源
	 * @param FDEMANDTYPE
	 * @throws JSONException
	 */
	public void setFDEMANDTYPE(String FDEMANDTYPE) throws JSONException{
		this.json.put("FDEMANDTYPE", FDEMANDTYPE);
	}

	/**
	 * 需求单据编号
	 * @param FDEMANDBILLNO
	 * @throws JSONException
	 */
	public void setFDEMANDBILLNO(String FDEMANDBILLNO)throws JSONException {
		this.json.put("FDEMANDBILLNO", FDEMANDBILLNO);
	}

	/**
	 * 需求单据行号
	 * @param FDEMANDBILLENTRYSEQ
	 * @throws JSONException
	 */
	public void setFDEMANDBILLENTRYSEQ(long FDEMANDBILLENTRYSEQ) throws JSONException {
		this.json.put("FDEMANDBILLENTRYSEQ", FDEMANDBILLENTRYSEQ);
	}

	/**
	 * 需求单据分录内码
	 * @param FDEMANDBILLENTRYID
	 * @throws JSONException
	 */
	public void setFDEMANDBILLENTRYID(long FDEMANDBILLENTRYID) throws JSONException {
		this.json.put("FDEMANDBILLENTRYID", FDEMANDBILLENTRYID);
	}
}