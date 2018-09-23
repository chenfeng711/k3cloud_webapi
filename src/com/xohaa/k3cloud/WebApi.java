package com.xohaa.k3cloud;

public final class WebApi {
	//登陆验证接口
	public static final String ValidateUser_URL = "/K3Cloud/Kingdee.BOS.WebApi.ServicesStub.AuthService.ValidateUser.common.kdsvc";
	
	//查看表单数据接口
	public static final String View_URL = "/K3Cloud/Kingdee.BOS.WebApi.ServicesStub.DynamicFormService.View.common.kdsvc";
	
	//保存表单数据接口
	public static final String Save_URL = "/K3Cloud/Kingdee.BOS.WebApi.ServicesStub.DynamicFormService.Save.common.kdsvc";
	
	//批量保存表单数据接口
	public static final String BatchSave_URL = "/K3Cloud/Kingdee.BOS.WebApi.ServicesStub.DynamicFormService.BatchSave.common.kdsvc";
	
	//提交表单数据接口
	public static final String Submit_URL = "/K3Cloud/Kingdee.BOS.WebApi.ServicesStub.DynamicFormService.Submit.common.kdsvc";
	
	//审核表单数据接口
	public static final String Audit_URL = "/K3Cloud/Kingdee.BOS.WebApi.ServicesStub.DynamicFormService.Audit.common.kdsvc"; 

	//反审核表单数据接口
	public static final String UnAudit_URL = "/K3Cloud/Kingdee.BOS.WebApi.ServicesStub.DynamicFormService.UnAudit.common.kdsvc";
	
	//删除表单数据接口
	public static final String Delete_URL = "/K3Cloud/Kingdee.BOS.WebApi.ServicesStub.DynamicFormService.Delete.common.kdsvc";
	
	//表单数据查询接口
	public static final String ExecuteBillQuery_URL = "/K3Cloud/Kingdee.BOS.WebApi.ServicesStub.DynamicFormService.ExecuteBillQuery.common.kdsvc";

	
	public static final String ValidateUser_TITLE = "登陆验证";
	public static final String View_TITLE = "查看表单";
	public static final String Save_TITLE = "保存表单";
	public static final String BatchSave_TITLE = "批量保存";
	public static final String Submit_TITLE = "提交表单";
	public static final String Audit_TITLE = "审核表单"; 
	public static final String UnAudit_TITLE = "反审表单";
	public static final String Delete_TITLE = "删除数据";
	public static final String ExecuteBillQuery_TITLE = "数据查询";
}
