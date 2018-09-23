package com.xohaa.k3cloud.save;
import com.xohaa.k3cloud.FormID;
import com.xohaa.k3cloud.webapi.Save;
/**
 * 保存辅助资料（项目）
 * @author chenjianxiong
 *
 */
public class SaveAssistant extends Save {
	public SaveAssistant() throws Exception{
		super(FormID.AssistantData);
	}
	
	/**
	 * 编号
	 * @param FNumber
	 */
	public void setFNumber(String FNumber) {
		this.setModelData("FNumber",FNumber);
	}

	/**
	 * 上级资料内码FID
	 * @param FParentId
	 */
	public void setFParentId(String FParentId) {
		this.setModelData("FParentId",FParentId);
	}

	/**
	 * 类别编码 
	 * @param FId
	 */
	public void setFId(String FId) {
		this.setModelFNumberData("FId", FId);
	}

	/**
	 * 名称
	 * @param FDataValue
	 */
	public void setFDataValue(String FDataValue) {
		this.setModelData("FDataValue",FDataValue);
	}

	/**
	 * 描述
	 * @param FDescription
	 */
	public void setFDescription(String FDescription) {
		this.setModelData("FDescription",FDescription);
	}
}
