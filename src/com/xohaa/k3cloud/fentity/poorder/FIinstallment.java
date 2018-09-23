package com.xohaa.k3cloud.fentity.poorder;
import com.xohaa.k3cloud.fentity.EntryData;
/**
 * 
 * @author chenjianxiong
 *
 */
public class FIinstallment extends EntryData {
	public FIinstallment(){
		super();
	}
	/**
	 * 
	 * @param FENTRYID
	 */
	public void setFENTRYID(String FENTRYID){
		jsonstr.addData("FENTRYID",FENTRYID);
	}

	/**
	 * 应付日期
	 * @param FYFDATE
	 */
	public void setFYFDATE(String FYFDATE){
		jsonstr.addData("FYFDATE",FYFDATE);
	}

	/**
	 * 应付比例(%)
	 * @param FYFRATIO
	 */
	public void setFYFRATIO(double FYFRATIO){
		jsonstr.addData("FYFRATIO",FYFRATIO);
	}

	/**
	 * 应付金额
	 * @param FYFAMOUNT
	 */
	public void setFYFAMOUNT(double FYFAMOUNT){
		jsonstr.addData("FYFAMOUNT",FYFAMOUNT);
	}

	/**
	 * 是否预付
	 * @param FISPREPAYMENT
	 */
	public void setFISPREPAYMENT(boolean FISPREPAYMENT){
		jsonstr.addData("FISPREPAYMENT",FISPREPAYMENT);
	}

	/**
	 * 预付单号
	 * @param FRelBillNo
	 */
	public void setFRelBillNo(String FRelBillNo){
		jsonstr.addData("FRelBillNo",FRelBillNo);
	}

	/**
	 * 单次预付额度
	 * @param FInsPrepaidAmount
	 */
	public void setFInsPrepaidAmount(String FInsPrepaidAmount){
		jsonstr.addData("FInsPrepaidAmount",FInsPrepaidAmount);
	}

	/**
	 * 实际预付金额
	 * @param FACTUALAMOUNT
	 */
	public void setFACTUALAMOUNT(String FACTUALAMOUNT){
		jsonstr.addData("FACTUALAMOUNT",FACTUALAMOUNT);
	}

	/**
	 * 付款关联金额
	 * @param FPayJoinAmount
	 */
	public void setFPayJoinAmount(String FPayJoinAmount){
		jsonstr.addData("FPayJoinAmount",FPayJoinAmount);
	}

	/**
	 * 备注
	 * @param FRemarks
	 */
	public void setFRemarks(String FRemarks){
		jsonstr.addData("FRemarks",FRemarks);
	}

	/**
	 * 物料编码
	 * @param FPayMaterialId
	 */
	public void setFPayMaterialId(String FPayMaterialId){
		jsonstr.addFNumberData("FPayMaterialId",FPayMaterialId);
	}

	/**
	 * 物料行号
	 * @param FMATERIALSEQ
	 */
	public void setFMATERIALSEQ(String FMATERIALSEQ){
		jsonstr.addData("FMATERIALSEQ",FMATERIALSEQ);
	}

	/**
	 * 数量
	 * @param FPayPlanQty
	 */
	public void setFPayPlanQty(double FPayPlanQty){
		jsonstr.addData("FPayPlanQty",FPayPlanQty);
	}

	/**
	 * 含税单价
	 * @param FPayPlanPrice
	 */
	public void setFPayPlanPrice(double FPayPlanPrice){
		jsonstr.addData("FPayPlanPrice",FPayPlanPrice);
	}

	/**
	 * 已申请关联数量
	 * @param FAppliedQty
	 */
	public void setFAppliedQty(double FAppliedQty){
		jsonstr.addData("FAppliedQty",FAppliedQty);
	}

	/**
	 * 实际预付关联数量
	 * @param FActualPayQty
	 */
	public void setFActualPayQty(double FActualPayQty){
		jsonstr.addData("FActualPayQty",FActualPayQty);
	}

	/**
	 * 付款申请关联金额
	 * @param FAPPLYAMOUNT
	 */
	public void setFAPPLYAMOUNT(double FAPPLYAMOUNT){
		jsonstr.addData("FAPPLYAMOUNT",FAPPLYAMOUNT);
	}

	/**
	 * 采购订单号
	 * @param FPURCHASEORDERNO
	 */
	public void setFPURCHASEORDERNO(String FPURCHASEORDERNO){
		jsonstr.addData("FPURCHASEORDERNO",FPURCHASEORDERNO);
	}

	/**
	 * 订单明细行内码
	 * @param FOrderEntryId
	 */
	public void setFOrderEntryId(String FOrderEntryId){
		jsonstr.addData("FOrderEntryId",FOrderEntryId);
	}

	/**
	 * 预付比例%
	 * @param FinsPayAdvanceRate
	 */
	public void setFinsPayAdvanceRate(double FinsPayAdvanceRate){
		jsonstr.addData("FinsPayAdvanceRate",FinsPayAdvanceRate);
	}

	/**
	 * 预付款
	 * @param FInsPayAdvanceAmount
	 */
	public void setFInsPayAdvanceAmount(double FInsPayAdvanceAmount){
		jsonstr.addData("FInsPayAdvanceAmount",FInsPayAdvanceAmount);
	}

	/**
	 * 计价单位
	 * @param FPAYPLANPRICEUNITID
	 */
	public void setFPAYPLANPRICEUNITID(String FPAYPLANPRICEUNITID){
		jsonstr.addFNumberData("FPAYPLANPRICEUNITID",FPAYPLANPRICEUNITID);
	}

	/**
	 * 计价基本单位
	 * @param FBasePriceUnit
	 */
	public void setFBasePriceUnit(String FBasePriceUnit){
		jsonstr.addFNumberData("FBasePriceUnit",FBasePriceUnit);
	}

	/**
	 * 数量(基本单位)
	 * @param FBasePayPlanQty
	 */
	public void setFBasePayPlanQty(double FBasePayPlanQty){
		jsonstr.addData("FBasePayPlanQty",FBasePayPlanQty);
	}

	/**
	 * 
	 * @param FOrderActualPaySubEntity
	 */
	public void setFOrderActualPaySubEntity(FOrderActualPaySubEntity FOrderActualPaySubEntity){
		jsonstr.addData("FOrderActualPaySubEntity", FOrderActualPaySubEntity.getArrayListStr());
	}
}
