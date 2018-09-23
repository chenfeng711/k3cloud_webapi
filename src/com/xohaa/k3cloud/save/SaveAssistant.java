package com.xohaa.k3cloud.save;
import com.xohaa.k3cloud.FormID;
import com.xohaa.k3cloud.webapi.Save;
/**
 * ���渨�����ϣ���Ŀ��
 * @author chenjianxiong
 *
 */
public class SaveAssistant extends Save {
	public SaveAssistant() throws Exception{
		super(FormID.AssistantData);
	}
	
	/**
	 * ���
	 * @param FNumber
	 */
	public void setFNumber(String FNumber) {
		this.setModelData("FNumber",FNumber);
	}

	/**
	 * �ϼ���������FID
	 * @param FParentId
	 */
	public void setFParentId(String FParentId) {
		this.setModelData("FParentId",FParentId);
	}

	/**
	 * ������ 
	 * @param FId
	 */
	public void setFId(String FId) {
		this.setModelFNumberData("FId", FId);
	}

	/**
	 * ����
	 * @param FDataValue
	 */
	public void setFDataValue(String FDataValue) {
		this.setModelData("FDataValue",FDataValue);
	}

	/**
	 * ����
	 * @param FDescription
	 */
	public void setFDescription(String FDescription) {
		this.setModelData("FDescription",FDescription);
	}
}
