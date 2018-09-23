package com.xohaa.k3cloud.save;
import com.xohaa.k3cloud.FormID;
import com.xohaa.k3cloud.fentity.pr.RequisitionFEntity;
import com.xohaa.k3cloud.webapi.Save;
/**
 * ����ɹ����봫�������
 * @author Administrator
 *
 */
public class SaveRequisition extends Save {
	
	public SaveRequisition() throws Exception{
		super(FormID.REQUISITION);
	}

	public void setFID(String FID) {
		this.setModelData("FID", FID);
	}

	/**
	 * �������� (������)
	 * @param FBillTypeID
	 * @throws JSONException
	 */
	public void setFBillTypeID(String FBillTypeID) {
		this.setModelData("FBillTypeID", FBillTypeID);
	}
	
	/**
	 * ���ݱ��
	 * @param FBillNo
	 * @throws JSONException
	 */
	public void setFBillNo(String FBillNo) {
		this.setModelData("FBillNo", FBillNo);
	}

	/**
	 * ��������(������)
	 * @param FApplicationDate
	 * @throws JSONException
	 */
	public void setFApplicationDate(String FApplicationDate) {
		this.setModelData("FApplicationDate", FApplicationDate);
	}

	/**
	 * �ɹ���������:(������)
	 * @param FRequestType
	 * @throws JSONException
	 */
	public void setFRequestType(String FRequestType) {
		this.setModelData("FRequestType", FRequestType);
	}

	/**
	 * ������֯(������)
	 * @param FApplicationOrgId
	 * @throws JSONException
	 */
	public void setFApplicationOrgId(String fnumber) {
		this.setModelFNumberData("FApplicationOrgId", fnumber);
	}

	/**
	 * ���벿��
	 * @param FApplicationDeptId
	 * @throws JSONException
	 */
	public void setFApplicationDeptId(String fnumber) {
		this.setModelFNumberData("FApplicationDeptId", fnumber);
	}

	/**
	 * ������
	 * @param FApplicantId
	 * @throws JSONException
	 */
	public void setFApplicantId(String FApplicantId) {
		this.setModelData("FApplicantId", FApplicantId);
	}

	/**
	 * �ұ�
	 * @param FCurrencyId
	 * @throws JSONException
	 */
	public void setFCurrencyId(String fnumber) {
		this.setModelFNumberData("FCurrencyId", fnumber);
	}
	
	/**
	 * ��ע˵��
	 * @param FNote
	 * @throws JSONException
	 */
	public void setFNote(String FNote) {
		this.setModelData("FNote", FNote);
	}

	/**
	 * ��������
	 * @param FExchangeTypeId
	 * @throws JSONException
	 */
	public void setFExchangeTypeId(String fnumber) {
		this.setModelFNumberData("FExchangeTypeId", fnumber);
	}

	/**
	 * �Ƿ��ǵ���ת��
	 * @param FIsConvert
	 * @throws JSONException
	 */
	public void setFIsConvert(boolean FIsConvert) {
		this.setModelData("FIsConvert", String.valueOf(FIsConvert));
	}

	/**
	 * ��Դ����
	 * @param FSrcType
	 * @throws JSONException
	 */
	public void setFSrcType(String FSrcType) {
		this.setModelData("FSrcType", FSrcType);
	}
	
	/**
	 * ����˰
	 * @param FISPRICEEXCLUDETAX
	 * @throws JSONException
	 */
	public void setFISPRICEEXCLUDETAX(boolean FISPRICEEXCLUDETAX) {
		this.setModelData("FISPRICEEXCLUDETAX", String.valueOf(FISPRICEEXCLUDETAX));
	}

	/**
	 * �Ƿ�Ԥ����ɹ�(������)
	 * @param F_PAEZ_Combo
	 * @throws JSONException
	 */
	public void setF_PAEZ_Combo(boolean F_PAEZ_Combo) {
		this.setModelData("F_PAEZ_Combo", String.valueOf(F_PAEZ_Combo));
	}

	/**
	 * Ԥ����ԭ��˵��
	 * @param F_PAEZ_Text
	 * @throws JSONException
	 */
	public void setF_PAEZ_Text(boolean F_PAEZ_Text) {
		this.setModelData("F_PAEZ_Text",String.valueOf(F_PAEZ_Text));
	}

	/**
	 * �ɹ�Ԥ���ۺϼ�
	 * @param F_PAEZ_Amount
	 * @throws JSONException
	 */
	public void setF_PAEZ_Amount(double F_PAEZ_Amount) {
		this.setModelData("F_PAEZ_Amount", F_PAEZ_Amount);
	}

	/**
	 * ��Ŀ���
	 * @param F_PAEZ_Text1
	 * @throws JSONException
	 */
	public void setF_PAEZ_Text1(String F_PAEZ_Text1) {
		this.setModelData("F_PAEZ_Text1", F_PAEZ_Text1);
	}

	/**
	 * ��Ŀ����
	 * @param F_PAEZ_Assistant
	 * @throws JSONException
	 */
	public void setF_PAEZ_Assistant(String F_PAEZ_Assistant) {
		this.setModelFNumberData("F_PAEZ_Assistant", F_PAEZ_Assistant);
	}

	/**
	 * ��ʵ��
	 * @param FEntity
	 * @throws JSONException
	 */
	public void setFEntity(RequisitionFEntity FEntity) {
		this.setModelData("FEntity", FEntity.getArrayListStr());
	}
}
