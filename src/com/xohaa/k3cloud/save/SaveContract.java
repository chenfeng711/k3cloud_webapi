package com.xohaa.k3cloud.save;
import com.xohaa.k3cloud.FormID;
import com.xohaa.k3cloud.fentity.contract.FContractClause;
import com.xohaa.k3cloud.fentity.contract.FContractEntry;
import com.xohaa.k3cloud.fentity.contract.FContractFin;
import com.xohaa.k3cloud.fentity.contract.FPayPlanEntry;
import com.xohaa.k3cloud.webapi.Save;
/**
 * �ɹ���ͬ
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
	 * ��������(������)
	 * @param FBillTypeID
	 */
	public void setFBillTypeID(String fnumber) {
		this.setModelFNumberData("FBillTypeID", fnumber);
	}
	/**
	 * ��Ӧ��֯
	 * @param FCorrespondOrgId
	 */
	public void setFCorrespondOrgId(String fnumber) {
		this.setModelFNumberData("FCorrespondOrgId", fnumber);
	}

	/**
	 * ��ͬ���
	 * @param FBillNo
	 */
	public void setFBillNo(String FBillNo) {
		this.setModelData("FBillNo", FBillNo);
	}
	
	/**
	 * ��ͬǩ������(������)
	 * @param FDate
	 */
	public void setFDate(String FDate) {
		this.setModelData("FDate", FDate);
	}

	/**
	 * ��ͬ��ʼ����(������)
	 * @param FBeginDate
	 */
	public void setFBeginDate(String FBeginDate) {
		this.setModelData("FBeginDate", FBeginDate);
	}

	/**
	 * ��ͬ��������(������)
	 * @param FEndDate
	 */
	public void setFEndDate(String FEndDate) {
		this.setModelData("FEndDate", FEndDate);
	}

	/**
	 * ��Ӧ��(������)
	 * @param FSupplierId
	 */
	public void setFSupplierId(String FSupplierId) {
		this.setModelFNumberData("FSupplierId", FSupplierId);
	}

	/**
	 * �ɹ���֯(������)
	 * @param FPurchaseOrgId
	 */
	public void setFPurchaseOrgId(String FPurchaseOrgId) {
		this.setModelFNumberData("FPurchaseOrgId", FPurchaseOrgId);
	}

	/**
	 * �ɹ�����
	 * @param FPurchaseDeptId
	 */
	public void setFPurchaseDeptId(String FPurchaseDeptId) {
		this.setModelFNumberData("FPurchaseDeptId", FPurchaseDeptId);
	}

	/**
	 * �ɹ���
	 * @param FPurchaserGroupId
	 */
	public void setFPurchaserGroupId(String FPurchaserGroupId) {
		this.setModelFNumberData("FPurchaserGroupId", FPurchaserGroupId);
	}

	/**
	 * �ɹ�Ա
	 * @param FPurchaserId
	 */
	public void setFPurchaserId(String FPurchaserId) {
		this.setModelFNumberData("FPurchaserId", FPurchaserId);
	}

	/**
	 * ������
	 * @param FProviderId
	 */
	public void setFProviderId(String FProviderId) {
		this.setModelFNumberData("FProviderId", FProviderId);
	}

	/**
	 * ��������ַ
	 * @param FProviderAddress
	 */
	public void setFProviderAddress(String FProviderAddress) {
		this.setModelData("FProviderAddress", FProviderAddress);
	}

	/**
	 * ���㷽
	 * @param FSettleId
	 */
	public void setFSettleId(String FSettleId) {
		this.setModelFNumberData("FSettleId", FSettleId);
	}

	/**
	 * �տ
	 * @param FChargeId
	 */
	public void setFChargeId(String FChargeId) {
		this.setModelFNumberData("FChargeId", FChargeId);
	}

	/**
	 * ��ͬ����(������)
	 * @param FCONTRACTNAME
	 */
	public void setFCONTRACTNAME(String FCONTRACTNAME) {
		this.setModelData("FCONTRACTNAME", FCONTRACTNAME);
	}

	/**
	 * �Է���ϵ��
	 * @param FProviderContactId
	 * @
	 */
	public void setFProviderContactId(String FProviderContactId) {
		StringBuffer buf = new StringBuffer(40);
		buf.append("(\"FCONTACTNUMBER\":\"").append(FProviderContactId).append("\"}");
		this.setModelData("FProviderContactId",buf);
	}

	/**
	 * ¼����ϸ
	 * @param FISINPUTDETAIL
	 */
	public void setFISINPUTDETAIL(boolean FISINPUTDETAIL) {
		this.setModelData("FISINPUTDETAIL", FISINPUTDETAIL);
	}

	/**
	 * ��Ŀ����
	 * @param F_PAEZ_Assistant
	 */
	public void setF_PAEZ_Assistant(String F_PAEZ_Assistant) {
		this.setModelFNumberData("F_PAEZ_Assistant", F_PAEZ_Assistant);
	}

	/**
	 * ��ͬ����
	 * @param F_PAEZ_Combo
	 */
	public void setF_PAEZ_Combo(String F_PAEZ_Combo) {
		this.setModelData("F_PAEZ_Combo", F_PAEZ_Combo);
	}

	/**
	 * �����ͬ��
	 * @param F_PAEZ_Text
	 */
	public void setF_PAEZ_Text(String F_PAEZ_Text) {
		this.setModelData("F_PAEZ_Text", F_PAEZ_Text);
	}

	/**
	 * ��Ŀ���
	 * @param F_PAEZ_Text1
	 */
	public void setF_PAEZ_Text1(String F_PAEZ_Text1) {
		this.setModelData("F_PAEZ_Text1", F_PAEZ_Text1);
	}

	/**
	 * ��ͬ���
	 * @param F_PAEZ_Amount
	 */
	public void setF_PAEZ_Amount(double F_PAEZ_Amount) {
		this.setModelData("F_PAEZ_Amount", F_PAEZ_Amount);
	}

	/**
	 * ����/�깤ʱ��
	 * @param F_PAEZ_Date
	 */
	public void setF_PAEZ_Date(String F_PAEZ_Date) {
		this.setModelData("F_PAEZ_Date", F_PAEZ_Date);
	}

	/**
	 * ��ע
	 * @param F_PAEZ_Text2
	 */
	public void setF_PAEZ_Text2(String F_PAEZ_Text2) {
		this.setModelData("F_PAEZ_Text2", F_PAEZ_Text2);
	}

	/**
	 * �а���ʽ
	 * @param F_PAEZ_Combo1
	 */
	public void setF_PAEZ_Combo1(String F_PAEZ_Combo1) {
		this.setModelData("F_PAEZ_Combo1", F_PAEZ_Combo1);
	}

	/**
	 * ���ʽ
	 * @param F_PAEZ_Text3
	 */
	public void setF_PAEZ_Text3(String F_PAEZ_Text3) {
		this.setModelData("F_PAEZ_Text3", F_PAEZ_Text3);
	}

	/**
	 * ������ʽ
	 * @param F_PAEZ_Combo2
	 */
	public void setF_PAEZ_Combo2(String F_PAEZ_Combo2) {
		this.setModelData("F_PAEZ_Combo2", F_PAEZ_Combo2);
	}

	/**
	 * ����˰ JSONObject
	 * @param FContractFin
	 */
	public void setFContractFin(FContractFin FContractFin) {
		this.setModelData("FContractFin", FContractFin.getJSONObjectStr());
		//this.setModelFNumberData("FContractFin", FContractFin);
	}

	/**
	 * ������� JSONArray
	 * @param FContractClause
	 * @
	 */
	public void setFContractClause(FContractClause FContractClause) {
		this.setModelData("FContractClause", FContractClause.getArrayListStr());
	}
	/**
	 * ����Ŀ
	 * @param FContractEntry

	 */
	public void setFContractEntry(FContractEntry FContractEntry) {
		this.setModelData("FContractEntry", FContractEntry.getArrayListStr());
	}

	/**
	 * ����
	 * @param FPayPlanEntry
	 */
	public void setFPayPlanEntry(FPayPlanEntry FPayPlanEntry) {
		this.setModelData("FPayPlanEntry", FPayPlanEntry.getArrayListStr());
	}
}