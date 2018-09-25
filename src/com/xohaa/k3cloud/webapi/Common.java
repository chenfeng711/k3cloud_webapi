package com.xohaa.k3cloud.webapi;
import java.io.File;
import org.apache.commons.io.FileUtils;
import org.json.JSONObject;

import com.xohaa.Action;
import com.xohaa.k3cloud.K3Funcable;
/**
 * 接口基类
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
	 * 读取JSON文件，返回JSONObject;
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
