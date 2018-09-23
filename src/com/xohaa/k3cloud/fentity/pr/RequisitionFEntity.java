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
	 * ������֯(������)
	 * @param FRequireOrgId
	 * @throws JSONException
	 */
	public void setFRequireOrgId(String FRequireOrgId)throws JSONException {
		this.json.put("FRequireOrgId", new JSONObject().put("FNumber", FRequireOrgId));
	}

	/**
	 * ���ϱ���(������)
	 * @param FMaterialId
	 * @throws JSONException
	 */
	public void setFMaterialId(String FMaterialId)throws JSONException {
		this.json.put("FMaterialId", new JSONObject().put("FNumber", FMaterialId));
	}

	/**
	 * ��������
	 * @param FAuxpropId
	 * @throws JSONException
	 */
	public void setFAuxpropId(String FAuxpropId)throws JSONException {
		this.json.put("FAuxpropId", FAuxpropId);
	}
	
	/**
	 * ����˵��
	 * @param FMaterialDesc
	 * @throws JSONException
	 */
	public void setFMaterialDesc(String FMaterialDesc)throws JSONException {
		this.json.put("FMaterialDesc", FMaterialDesc);
	}

	/**
	 * ���뵥λ(������)
	 * @param FUnitId
	 * @throws JSONException
	 */
	public void setFUnitId(String FUnitId)throws JSONException {
		this.json.put("FUnitId", new JSONObject().put("FNumber", FUnitId));
	}

	/**
	 * ��������
	 * @param FReqQty
	 * @throws JSONException
	 */
	public void setFReqQty(String FReqQty) throws JSONException{
		this.json.put("FReqQty", FReqQty);
	}

	/**
	 * ��������
	 * @param F_PAEZ_Date
	 * @throws JSONException
	 */
	public void setF_PAEZ_Date(String F_PAEZ_Date) throws JSONException{
		this.json.put("F_PAEZ_Date", F_PAEZ_Date);
	}

	/**
	 * �ɹ���֯(������)
	 * @param FPurchaseOrgId
	 * @throws JSONException
	 */
	public void setFPurchaseOrgId(String FPurchaseOrgId)throws JSONException {
		this.json.put("FPurchaseOrgId", new JSONObject().put("FNumber", FPurchaseOrgId));
	}

	/**
	 * ���鹩Ӧ��
	 * @param FSuggestSupplierId
	 * @throws JSONException
	 */
	public void setFSuggestSupplierId(String FSuggestSupplierId)throws JSONException {
		this.json.put("FSuggestSupplierId", new JSONObject().put("FNumber", FSuggestSupplierId));
	}

	/**
	 * ������֯
	 * @param FReceiveOrgId
	 * @throws JSONException
	 */
	public void setFReceiveOrgId(String FReceiveOrgId)throws JSONException {
		this.json.put("FReceiveOrgId", new JSONObject().put("FNumber", FReceiveOrgId));
	}

	/**
	 * Ԥ������
	 * @param FEvaluatePrice
	 * @throws JSONException
	 */
	public void setFEvaluatePrice(double FEvaluatePrice)throws JSONException {
		this.json.put("FEvaluatePrice", FEvaluatePrice);
	}

	/**
	 * ��˰����
	 * @param FTAXPRICE
	 * @throws JSONException
	 */
	public void setFTAXPRICE(double FTAXPRICE) throws JSONException{
		this.json.put("FTAXPRICE", FTAXPRICE);
	}

	/**
	 * ˰��%
	 * @param FTAXRATE
	 * @throws JSONException
	 */
	public void setFTAXRATE(double FTAXRATE)throws JSONException {
		this.json.put("FTAXRATE", FTAXRATE);
	}

	/**
	 * �Ƽ۵�λ(������)
	 * @param FPriceUnitId
	 * @throws JSONException
	 */
	public void setFPriceUnitId(String FPriceUnitId) throws JSONException{
		this.json.put("FPriceUnitId", new JSONObject().put("FNumber", FPriceUnitId));
	}

	/**
	 * ��浥λ(������)
	 * @param FREQSTOCKUNITID
	 * @throws JSONException
	 */
	public void setFREQSTOCKUNITID(String FREQSTOCKUNITID) throws JSONException{
		this.json.put("FREQSTOCKUNITID", new JSONObject().put("FNumber", FREQSTOCKUNITID));
	}

	/**
	 * �������
	 * @param FREQSTOCKQTY
	 * @throws JSONException
	 */
	public void setFREQSTOCKQTY(double FREQSTOCKQTY) throws JSONException{
		this.json.put("FREQSTOCKQTY", FREQSTOCKQTY);
	}

	/**
	 * ��ǰ��
	 * @param FLeadTime
	 * @throws JSONException
	 */
	public void setFLeadTime(double FLeadTime) throws JSONException{
		this.json.put("FLeadTime", FLeadTime);
	}

	/**
	 * ָ����Ӧ��(6.0����)
	 * @param FSupplierId
	 * @throws JSONException
	 */
	public void setFSupplierId(String FSupplierId) throws JSONException{
		this.json.put("FSupplierId", new JSONObject().put("FNumber", FSupplierId));
	}

	/**
	 * ������Ŀ
	 * @param FChargeProjectID
	 * @throws JSONException
	 */
	public void setFChargeProjectID(String FChargeProjectID)throws JSONException {
		this.json.put("FChargeProjectID", new JSONObject().put("FNumber", FChargeProjectID));
	}

	/**
	 * �ɹ�����
	 * @param FPurchaseDeptId
	 * @throws JSONException
	 */
	public void setFPurchaseDeptId(String FPurchaseDeptId)throws JSONException {
		this.json.put("FPurchaseDeptId", new JSONObject().put("FNumber", FPurchaseDeptId));
	}

	/**
	 * ������ַ
	 * @param FReceiveAddress
	 * @throws JSONException
	 */
	public void setFReceiveAddress(String FReceiveAddress) throws JSONException {
		this.json.put("FReceiveAddress", FReceiveAddress);
	}

	/**
	 * ��ע
	 * @param FEntryNote
	 * @throws JSONException
	 */
	public void setFEntryNote(String FEntryNote) throws JSONException{
		this.json.put("FEntryNote", FEntryNote);
	}

	/**
	 * �ɹ�Ա
	 * @param FPurchaserId
	 * @throws JSONException
	 */
	public void setFPurchaserId(String FPurchaserId)throws JSONException {
		this.json.put("FPurchaserId", new JSONObject().put("FNumber", FPurchaserId));
	}
	
	/**
	 * �ɹ���
	 * @param FPurchaseGroupId
	 * @throws JSONException
	 */
	public void setFPurchaseGroupId(String FPurchtaseGroupId)throws JSONException {
		this.json.put("FPurchaseGroupId", new JSONObject().put("FNumber", FPurchtaseGroupId));
	}

	/**
	 * BOM�汾
	 * @param FBOMNoId
	 * @throws JSONException
	 */
	public void setFBOMNoId(String FBOMNoId) throws JSONException{
		this.json.put("FBOMNoId", new JSONObject().put("FNumber", FBOMNoId));
	}

	/**
	 * �ֿ�
	 * @param FStockId
	 * @throws JSONException
	 */
	public void setFStockId(String FStockId)throws JSONException {
		this.json.put("FStockId", new JSONObject().put("FNumber", FStockId));
	}

	/**
	 * �����ص�
	 * @param FProviderId
	 * @throws JSONException
	 */
	public void setFProviderId(String FProviderId) throws JSONException{
		this.json.put("FProviderId", new JSONObject().put("FNumber", FProviderId));
	}

	/**
	 * �ƻ����ٺ�
	 * @param FMtoNo
	 * @throws JSONException
	 */
	public void setFMtoNo(String FMtoNo)throws JSONException {
		this.json.put("FMtoNo", FMtoNo);
	}

	/**
	 * ��������(������λ)
	 * @param FBaseReqQty
	 * @throws JSONException
	 */
	public void setFBaseReqQty(String FBaseReqQty) throws JSONException{
		this.json.put("FBaseReqQty", FBaseReqQty);
	}

	/**
	 * ���ϲ���
	 * @param FReceiveDeptId
	 * @throws JSONException
	 */
	public void setFReceiveDeptId(String FReceiveDeptId)throws JSONException {
		this.json.put("FReceiveDeptId", new JSONObject().put("FNumber", FReceiveDeptId));
	}

	/**
	 * ������
	 * @param FRequireDeptId
	 * @throws JSONException
	 */
	public void setFRequireDeptId(String FRequireDeptId)throws JSONException {
		this.json.put("FRequireDeptId", new JSONObject().put("FNumber", FRequireDeptId));
	}

	/**
	 * ���۵�λ
	 * @param FSalUnitID
	 * @throws JSONException
	 */
	public void setFSalUnitID(String FSalUnitID) throws JSONException{
		this.json.put("FSalUnitID", new JSONObject().put("FNumber", FSalUnitID));
	}

	/**
	 * ��������
	 * @param FSalQty
	 * @throws JSONException
	 */
	public void setFSalQty(double FSalQty)throws JSONException {
		this.json.put("FSalQty", FSalQty);
	}

	/**
	 * ���ۻ�������
	 * @param FSalBaseQty
	 * @throws JSONException
	 */
	public void setFSalBaseQty(double FSalBaseQty)throws JSONException {
		this.json.put("FSalBaseQty", FSalBaseQty);
	}

	/**
	 * ����������
	 * @param FREQSTOCKBASEQTY
	 * @throws JSONException
	 */
	public void setFREQSTOCKBASEQTY(double FREQSTOCKBASEQTY) throws JSONException{
		this.json.put("FREQSTOCKBASEQTY", FREQSTOCKBASEQTY);
	}

	/**
	 * �Ƽۻ�������
	 * @param FPRICEBASEQTY
	 * @throws JSONException
	 */
	public void setFPRICEBASEQTY(double FPRICEBASEQTY) throws JSONException{
		this.json.put("FPRICEBASEQTY", FPRICEBASEQTY);
	}

	/**
	 * VMIҵ��
	 * @param FIsVmiBusiness
	 * @throws JSONException
	 */
	public void setFIsVmiBusiness(boolean FIsVmiBusiness)throws JSONException {
		this.json.put("FIsVmiBusiness", FIsVmiBusiness);
	}

	/**
	 * ������Դ
	 * @param FDEMANDTYPE
	 * @throws JSONException
	 */
	public void setFDEMANDTYPE(String FDEMANDTYPE) throws JSONException{
		this.json.put("FDEMANDTYPE", FDEMANDTYPE);
	}

	/**
	 * ���󵥾ݱ��
	 * @param FDEMANDBILLNO
	 * @throws JSONException
	 */
	public void setFDEMANDBILLNO(String FDEMANDBILLNO)throws JSONException {
		this.json.put("FDEMANDBILLNO", FDEMANDBILLNO);
	}

	/**
	 * ���󵥾��к�
	 * @param FDEMANDBILLENTRYSEQ
	 * @throws JSONException
	 */
	public void setFDEMANDBILLENTRYSEQ(long FDEMANDBILLENTRYSEQ) throws JSONException {
		this.json.put("FDEMANDBILLENTRYSEQ", FDEMANDBILLENTRYSEQ);
	}

	/**
	 * ���󵥾ݷ�¼����
	 * @param FDEMANDBILLENTRYID
	 * @throws JSONException
	 */
	public void setFDEMANDBILLENTRYID(long FDEMANDBILLENTRYID) throws JSONException {
		this.json.put("FDEMANDBILLENTRYID", FDEMANDBILLENTRYID);
	}
}