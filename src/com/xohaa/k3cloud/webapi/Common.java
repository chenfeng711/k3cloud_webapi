package com.xohaa.k3cloud.webapi;
import java.io.File;
import org.apache.commons.io.FileUtils;
import org.json.JSONObject;

import com.xohaa.Action;
import com.xohaa.k3cloud.K3Funcable;
/**
 * �ӿڻ���
 * @author chenjianxiong
 *
 */
public abstract class Common implements K3Funcable{
	private String formid = null;
	protected JSONObject paramdata = null;
	public Common(String formid) {
		this.formid = formid;
	}
	
	public String getFormID(){
		return this.formid;
	}

	
	/**
	 * ��ȡJSON�ļ�������JSONObject;
	 * @return
	 * @throws Exception
	 */
	protected JSONObject readJSONFiletoJSONObject() throws Exception{
		String path = Action.getCurMkdir("kingdee", true);
		String input = FileUtils.readFileToString(new File(path + this.formid + ".json"), "UTF-8");
		JSONObject json = new JSONObject(input);
		return json;
	}
}
