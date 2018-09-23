package com.xohaa.k3cloud.save;
import com.xohaa.k3cloud.FormID;
import com.xohaa.k3cloud.fentity.cust.FT_BD_CUSTBANK;
import com.xohaa.k3cloud.fentity.cust.FT_BD_CUSTCONTACT;
import com.xohaa.k3cloud.fentity.cust.FT_BD_CUSTLOCATION;
import com.xohaa.k3cloud.fentity.cust.FT_BD_CUSTOMEREXT;
import com.xohaa.k3cloud.fentity.cust.FT_BD_CUSTORDERORG;
import com.xohaa.k3cloud.webapi.Save;
/**
 * 保存客户
 * @author chenjianxiong
 *
 */
public  class SaveCustomer extends Save {
	public SaveCustomer() throws Exception{
		super(FormID.CUSTOMER);

	}

	/**
	 * 
	 * @param FCUSTID
	 */
	public void setFCUSTID(String FCUSTID) {
		this.setModelData("FCUSTID",FCUSTID);
	}

	/**
	 * 创建组织(必填项)
	 * @param FCreateOrgId
	 */
	public void setFCreateOrgId(String FCreateOrgId) {
		this.setModelFNumberData("FCreateOrgId", FCreateOrgId);
	}

	/**
	 * 客户编码
	 * @param FNumber
	 */
	public void setFNumber(String FNumber) {
		this.setModelData("FNumber",FNumber);
	}

	/**
	 * 使用组织
	 * @param FUseOrgId
	 */
	public void setFUseOrgId(String FUseOrgId) {
		this.setModelFNumberData("FUseOrgId", FUseOrgId);
	}

	/**
	 * 客户名称 (必填项)
	 * @param FName
	 */
	public void setFName(String FName) {
		this.setModelData("FName",FName);
	}

	/**
	 * 客户名称
	 * @param FShortName
	 */
	public void setFShortName(String FShortName) {
		this.setModelData("FShortName",FShortName);
	}

	/**
	 * 国家
	 * @param FCOUNTRY
	 */
	public void setFCOUNTRY(String FCOUNTRY) {
		this.setModelFNumberData("FCOUNTRY", FCOUNTRY);
	}

	/**
	 * 地区
	 * @param FPROVINCIAL
	 */
	public void setFPROVINCIAL(String FPROVINCIAL) {
		this.setModelFNumberData("FPROVINCIAL", FPROVINCIAL);
	}
	/**
	 * 通讯地址
	 * @param FADDRESS
	 */
	public void setFADDRESS(String FADDRESS) {
		this.setModelData("FADDRESS",FADDRESS);
	}
	/**
	 * 邮政编码
	 * @param FZIP
	 */
	public void setFZIP(String FZIP) {
		this.setModelData("FZIP",FZIP);
	}

	/**
	 * 公司网址
	 * @param FWEBSITE
	 */
	public void setFWEBSITE(String FWEBSITE) {
		this.setModelData("FWEBSITE",FWEBSITE);
	}
	/**
	 * 联系电话
	 * @param FTEL
	 */
	public void setFTEL(String FTEL) {
		this.setModelData("FTEL",FTEL);
	}

	/**
	 * 传真
	 * @param FFAX
	 */
	public void setFFAX(String FFAX) {
		this.setModelData("FFAX",FFAX);
	}

	/**
	 * 纳税登记号
	 * @param FTAXREGISTERCODE
	 */
	public void setFTAXREGISTERCODE(String FTAXREGISTERCODE) {
		this.setModelData("FTAXREGISTERCODE",FTAXREGISTERCODE);
	}

	/**
	 * 公司类别
	 * @param FCompanyClassify
	 */
	public void setFCompanyClassify(String FCompanyClassify) {
		this.setModelFNumberData("FCompanyClassify", FCompanyClassify);
	}

	/**
	 * 公司性质
	 * @param FCompanyNature
	 */
	public void setFCompanyNature(String FCompanyNature) {
		this.setModelFNumberData("FCompanyNature", FCompanyNature);
	}

	/**
	 * 公司规模
	 * @param FCompanyScale
	 */
	public void setFCompanyScale(String FCompanyScale) {
		this.setModelFNumberData("FCompanyScale", FCompanyScale);
	}
	/**
	 * 对应供应商
	 * @param FSUPPLIERID
	 */
	public void setFSUPPLIERID(String FSUPPLIERID) {
		this.setModelFNumberData("FSUPPLIERID", FSUPPLIERID);
	}

	/**
	 * 对应集团客户
	 * @param FGROUPCUSTID
	 */
	public void setFGROUPCUSTID(String FGROUPCUSTID) {
		this.setModelFNumberData("FGROUPCUSTID", FGROUPCUSTID);
	}

	/**
	 * 集团客户
	 * @param FIsGroup
	 */
	public void setFIsGroup(boolean FIsGroup) {
		this.setModelData("FIsGroup",FIsGroup);
	}

	/**
	 * 默认付款方
	 * @param FIsDefPayer
	 */
	public void setFIsDefPayer(boolean FIsDefPayer) {
		this.setModelData("FIsDefPayer",FIsDefPayer);
	}
	/**
	 * 客户类别
	 * @param FCustTypeId
	 */
	public void setFCustTypeId(String FCustTypeId) {
		this.setModelFNumberData("FCustTypeId", FCustTypeId);
	}
	/**
	 * 客户��1��������������������������������
	 * @param FGroup
	 */
	public void setFGroup(String FGroup) {
		this.setModelFNumberData("FGroup", FGroup);
	}
	
	/**
	 * 结算币别(必填项)
	 * @param FTRADINGCURRID
	 */
	public void setFTRADINGCURRID(String FTRADINGCURRID) {
		this.setModelFNumberData("FTRADINGCURRID", FTRADINGCURRID);
	}
	/**
	 * 对应组织
	 * @param FCorrespondOrgId
	 */
	public void setFCorrespondOrgId(String FCorrespondOrgId) {
		this.setModelFNumberData("FCorrespondOrgId", FCorrespondOrgId);
	}
	/**
	 * 备注
	 * @param FDescription
	 */
	public void setFDescription(String FDescription) {
		this.setModelData("FDescription",FDescription);
	}
	/**
	 * 销售部门
	 * @param FSALDEPTID
	 */
	public void setFSALDEPTID(String FSALDEPTID) {
		this.setModelFNumberData("FSALDEPTID", FSALDEPTID);
	}
	/**
	 * 销售员
	 * @param FSELLER
	 */
	public void setFSELLER(String FSELLER) {
		this.setModelFNumberData("FSELLER", FSELLER);
	}
	/**
	 * 结算方式
	 * @param FSETTLETYPEID
	 */
	public void setFSETTLETYPEID(String FSETTLETYPEID) {
		this.setModelFNumberData("FSETTLETYPEID", FSETTLETYPEID);
	}
	/**
	 * 收款条件
	 * @param FRECCONDITIONID
	 */
	public void setFRECCONDITIONID(String FRECCONDITIONID) {
		this.setModelFNumberData("FRECCONDITIONID", FRECCONDITIONID);
	}
	
	/**
	 * 价目表
	 * @param FPRICELISTID
	 */
	public void setFPRICELISTID(String FPRICELISTID) {
		this.setModelFNumberData("FPRICELISTID", FPRICELISTID);
	}
	/**
	 * 折扣表
	 * @param FDISCOUNTLISTID
	 */
	public void setFDISCOUNTLISTID(String FDISCOUNTLISTID) {
		this.setModelFNumberData("FDISCOUNTLISTID", FDISCOUNTLISTID);
	}
	/**
	 * 运输提前期
	 * @param FTRANSLEADTIME
	 */
	public void setFTRANSLEADTIME(String FTRANSLEADTIME) {
		this.setModelData("FTRANSLEADTIME",FTRANSLEADTIME);
	}
	/**
	 * 税分类
	 * @param FTaxType
	 */
	public void setFTaxType(String FTaxType) {
		this.setModelFNumberData("FTaxType", FTaxType);
	}
	/**
	 * 发票类型
	 * @param FInvoiceType
	 */
	public void setFInvoiceType(String FInvoiceType) {
		this.setModelData("FInvoiceType",FInvoiceType);
	}
	/**
	 * 收款币别
	 * @param FRECEIVECURRID
	 */
	public void setFRECEIVECURRID(String FRECEIVECURRID) {
		this.setModelFNumberData("FRECEIVECURRID", FRECEIVECURRID);
	}
	/**
	 * 客户优先级
	 * @param FPriority
	 */
	public void setFPriority(String FPriority) {
		this.setModelData("FPriority",FPriority);
	}
	/**
	 * 默认税率
	 * @param FTaxRate
	 */
	public void setFTaxRate(String FTaxRate) {
		this.setModelFNumberData("FTaxRate", FTaxRate);
	}
	/**
	 * 启用信用管理
	 * @param FISCREDITCHECK
	 */
	public void setFISCREDITCHECK(boolean FISCREDITCHECK) {
		this.setModelData("FISCREDITCHECK",FISCREDITCHECK);
	}
	/**
	 * 是否交易客户
	 * @param FIsTrade
	 */
	public void setFIsTrade(boolean FIsTrade) {
		this.setModelData("FIsTrade",FIsTrade);
	}
	/**
	 * 启用商联
	 * @param FT_BD_CUSTOMEREXT
	 */
	public void setFT_BD_CUSTOMEREXT(FT_BD_CUSTOMEREXT CUSTOMEREXT) {
		this.setModelData("FT_BD_CUSTOMEREXT",CUSTOMEREXT.getJSONObjectStr());
	}
	/**
	 * 联系人
	 * @param CUSTLOCATION
	 * @throws JSONException 
	 */
	public void setFT_BD_CUSTLOCATION(FT_BD_CUSTLOCATION CUSTLOCATION){
		this.setModelData("FT_BD_CUSTLOCATION", CUSTLOCATION.getArrayListStr());
	}
	/**
	 * 银行
	 * @param CUSTBANK
	 */
	public void setFT_BD_CUSTBANK(FT_BD_CUSTBANK CUSTBANK){
		this.setModelData("FT_BD_CUSTBANK",CUSTBANK.getArrayListStr());
	}
	/**
	 * 地址信息
	 * @param CUSTCONTACT
	 */
	public void setFT_BD_CUSTCONTACT(FT_BD_CUSTCONTACT CUSTCONTACT){
		this.setModelData("FT_BD_CUSTCONTACT", CUSTCONTACT.getArrayListStr());
	}
	/**
	 * 订货组织
	 * @param CUSTORDERORG
	 */
	public void setFT_BD_CUSTORDERORG(FT_BD_CUSTORDERORG CUSTORDERORG){
		this.setModelData("FT_BD_CUSTORDERORG", CUSTORDERORG.getArrayListStr());
	}
}
