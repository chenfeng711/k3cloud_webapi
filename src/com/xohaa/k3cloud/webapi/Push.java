package com.xohaa.k3cloud.webapi;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * ����
 * @author Administrator
 *
 */
public class Push extends Common {
	public Push(String formid) throws JSONException {
		super(formid);
		this.initParamdata();
	}
	/**
1.formid��ҵ������Id����¼��
2.data��Json��ʽ���ݣ�����ο�Json��ʽ���ݣ�����¼��
     2.1.Ids���������룬�ַ������ͣ���ʽ"Id1,Id2,..."�����ŷֿ���δ��Numbers�����¼��
     2.2.Numbers�����ݱ�ż��ϣ��������ͣ���ʽ["billNo1","billNo1",...]���������ͣ���¼��
     2.3.RuleId��ת���������룬�ַ������ͣ���ʽ"RuleId"��δ����Ĭ��ת������ʱ�����¼��
     2.4.TargetBillTypeId��Ŀ�굥���������룬�ַ������ͣ���ʽ"Id1"���Ǳ�¼��
     2.5.TargetOrgId��Ŀ����֯���룬�������ͣ���ʽ"Id1"���Ǳ�¼��
     2.6.TargetFormId��Ŀ�굥��FormId���ַ������ͣ���ʽ:"FormId"������Ĭ��ת������ʱ�����¼��
     2.7.IsEnableDefaultRule���Ƿ�����Ĭ��ת�����򣬲������ͣ�Ĭ��ֵFalse����ʽ"false"���Ǳ�¼��
     2.8.CustomParams���Զ���������ֵ����ͣ���ʽ"{key1:value1,key2:value2,...}"���Ǳ�¼��
	 */
	private void initParamdata() throws JSONException{
		String str ="{\"Ids\":\"\",\"Numbers\":[],\"RuleId\":\"\",\"TargetBillTypeId\":\"\",\"TargetOrgId\":\"0\",\"TargetFormId\":\"\",\"IsEnableDefaultRule\":\"false\",\"CustomParams\":{}}";
		this.paramdata = new JSONObject(str);
	}
	
	/**
	 * ���ݱ�ż��ϣ��������ͣ���ʽ["billNo1","billNo1",...]���������ͣ���¼��
	 * @param arr
	 * @throws JSONException
	 */
	public void setNumbers(JSONArray arr) throws JSONException{
		this.paramdata.put("Numbers", arr);
	}
	
	/**
	 * 2.1.Ids���������룬�ַ������ͣ���ʽ"Id1,Id2,..."�����ŷֿ���δ��Numbers�����¼��
	 * @param arr
	 * @throws JSONException
	 */
	public void setIds(JSONArray arr) throws JSONException{
		this.paramdata.put("Ids", arr);
	}
	/**
	 * 2.2.Numbers�����ݱ�ż��ϣ��������ͣ���ʽ["billNo1","billNo1",...]���������ͣ���¼��
	 * @param number
	 * @throws JSONException
	 */
	public void setNumbers(String number) throws JSONException{
		this.paramdata.put("Numbers", new JSONArray().put(number));
	}
	/**
	 * 2.3.RuleId��ת���������룬�ַ������ͣ���ʽ"RuleId"��δ����Ĭ��ת������ʱ�����¼��
	 * @param RuleId
	 * @throws JSONException
	 */
	public void setRuleId(String RuleId) throws JSONException{
		this.paramdata.put("RuleId", RuleId);
	}
	
	/**
	 * 2.4.TargetBillTypeId��Ŀ�굥���������룬�ַ������ͣ���ʽ"Id1"���Ǳ�¼��
	 * @param TargetBillTypeId
	 * @throws JSONException
	 */
	public void setTargetBillTypeId(String TargetBillTypeId) throws JSONException{
		this.paramdata.put("TargetBillTypeId", TargetBillTypeId);
	}
	
	/**
	 * 2.5.TargetOrgId��Ŀ����֯���룬�������ͣ���ʽ"Id1"���Ǳ�¼��
	 * @param TargetOrgId
	 * @throws JSONException
	 */
	public void setTargetOrgId(String TargetOrgId) throws JSONException{
		this.paramdata.put("TargetOrgId", TargetOrgId);
	}
	
	/**
	 * 2.6.TargetFormId��Ŀ�굥��FormId���ַ������ͣ���ʽ:"FormId"������Ĭ��ת������ʱ�����¼��
	 * @param TargetFormId
	 * @throws JSONException
	 */
	public void setTargetFormId(String TargetFormId) throws JSONException{
		this.paramdata.put("TargetFormId", TargetFormId);
	}
	
	/**
	 * 2.7.IsEnableDefaultRule���Ƿ�����Ĭ��ת�����򣬲������ͣ�Ĭ��ֵFalse����ʽ"false"���Ǳ�¼��
	 * @param IsEnableDefaultRule
	 * @throws JSONException
	 */
	public void setIsEnableDefaultRule(boolean IsEnableDefaultRule) throws JSONException{
		this.paramdata.put("IsEnableDefaultRule",String.valueOf(IsEnableDefaultRule));
	}
	
	/**
	 * 2.8.CustomParams���Զ���������ֵ����ͣ���ʽ"{key1:value1,key2:value2,...}"���Ǳ�¼��
	 * @param CustomParams
	 * @throws JSONException
	 */
	public void setIsEnableDefaultRule(JSONObject CustomParams) throws JSONException{
		this.paramdata.put("CustomParams",CustomParams);
	}
	
	public JSONObject sendContent() throws JSONException {
		JSONObject paramdatamain = new JSONObject();
		paramdatamain.put("FormId",this.getFormID());
		paramdatamain.put("data",paramdata);
		return paramdatamain;
	}

	public String sendContentStr() throws JSONException {
		return null;
	}
}
