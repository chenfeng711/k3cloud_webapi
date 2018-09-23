package com.xohaa.k3cloud.save;
import com.xohaa.k3cloud.FormID;
import com.xohaa.k3cloud.fentity.pr.RequisitionFEntity;
import com.xohaa.k3cloud.webapi.Save;
/**
 * 处理采购申请传入参数。
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
	 * 单据类型 (必填项)
	 * @param FBillTypeID
	 * @throws JSONException
	 */
	public void setFBillTypeID(String FBillTypeID) {
		this.setModelData("FBillTypeID", FBillTypeID);
	}
	
	/**
	 * 单据编号
	 * @param FBillNo
	 * @throws JSONException
	 */
	public void setFBillNo(String FBillNo) {
		this.setModelData("FBillNo", FBillNo);
	}

	/**
	 * 申请日期(必填项)
	 * @param FApplicationDate
	 * @throws JSONException
	 */
	public void setFApplicationDate(String FApplicationDate) {
		this.setModelData("FApplicationDate", FApplicationDate);
	}

	/**
	 * 采购申请类型:(必填项)
	 * @param FRequestType
	 * @throws JSONException
	 */
	public void setFRequestType(String FRequestType) {
		this.setModelData("FRequestType", FRequestType);
	}

	/**
	 * 申请组织(必填项)
	 * @param FApplicationOrgId
	 * @throws JSONException
	 */
	public void setFApplicationOrgId(String fnumber) {
		this.setModelFNumberData("FApplicationOrgId", fnumber);
	}

	/**
	 * 申请部门
	 * @param FApplicationDeptId
	 * @throws JSONException
	 */
	public void setFApplicationDeptId(String fnumber) {
		this.setModelFNumberData("FApplicationDeptId", fnumber);
	}

	/**
	 * 申请人
	 * @param FApplicantId
	 * @throws JSONException
	 */
	public void setFApplicantId(String FApplicantId) {
		this.setModelData("FApplicantId", FApplicantId);
	}

	/**
	 * 币别
	 * @param FCurrencyId
	 * @throws JSONException
	 */
	public void setFCurrencyId(String fnumber) {
		this.setModelFNumberData("FCurrencyId", fnumber);
	}
	
	/**
	 * 备注说明
	 * @param FNote
	 * @throws JSONException
	 */
	public void setFNote(String FNote) {
		this.setModelData("FNote", FNote);
	}

	/**
	 * 汇率类型
	 * @param FExchangeTypeId
	 * @throws JSONException
	 */
	public void setFExchangeTypeId(String fnumber) {
		this.setModelFNumberData("FExchangeTypeId", fnumber);
	}

	/**
	 * 是否是单据转换
	 * @param FIsConvert
	 * @throws JSONException
	 */
	public void setFIsConvert(boolean FIsConvert) {
		this.setModelData("FIsConvert", String.valueOf(FIsConvert));
	}

	/**
	 * 来源类型
	 * @param FSrcType
	 * @throws JSONException
	 */
	public void setFSrcType(String FSrcType) {
		this.setModelData("FSrcType", FSrcType);
	}
	
	/**
	 * 价外税
	 * @param FISPRICEEXCLUDETAX
	 * @throws JSONException
	 */
	public void setFISPRICEEXCLUDETAX(boolean FISPRICEEXCLUDETAX) {
		this.setModelData("FISPRICEEXCLUDETAX", String.valueOf(FISPRICEEXCLUDETAX));
	}

	/**
	 * 是否预算外采购(必填项)
	 * @param F_PAEZ_Combo
	 * @throws JSONException
	 */
	public void setF_PAEZ_Combo(boolean F_PAEZ_Combo) {
		this.setModelData("F_PAEZ_Combo", String.valueOf(F_PAEZ_Combo));
	}

	/**
	 * 预算外原因说明
	 * @param F_PAEZ_Text
	 * @throws JSONException
	 */
	public void setF_PAEZ_Text(boolean F_PAEZ_Text) {
		this.setModelData("F_PAEZ_Text",String.valueOf(F_PAEZ_Text));
	}

	/**
	 * 采购预估价合计
	 * @param F_PAEZ_Amount
	 * @throws JSONException
	 */
	public void setF_PAEZ_Amount(double F_PAEZ_Amount) {
		this.setModelData("F_PAEZ_Amount", F_PAEZ_Amount);
	}

	/**
	 * 项目编号
	 * @param F_PAEZ_Text1
	 * @throws JSONException
	 */
	public void setF_PAEZ_Text1(String F_PAEZ_Text1) {
		this.setModelData("F_PAEZ_Text1", F_PAEZ_Text1);
	}

	/**
	 * 项目名称
	 * @param F_PAEZ_Assistant
	 * @throws JSONException
	 */
	public void setF_PAEZ_Assistant(String F_PAEZ_Assistant) {
		this.setModelFNumberData("F_PAEZ_Assistant", F_PAEZ_Assistant);
	}

	/**
	 * 表单实体
	 * @param FEntity
	 * @throws JSONException
	 */
	public void setFEntity(RequisitionFEntity FEntity) {
		this.setModelData("FEntity", FEntity.getArrayListStr());
	}
}
