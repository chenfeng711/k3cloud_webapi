package com.xohaa.k3cloud.save;

import com.xohaa.k3cloud.FormID;
import com.xohaa.k3cloud.webapi.Save;
/**
 * –¥»Î≤÷ø‚
 * @author chenjianxiong
 *
 */
public class SaveStock extends Save {
	public SaveStock() {
		super(FormID.STOCK);
	}

	/**
	 * 
	 * @param FStockId
	 */
	public void setFStockId(String FStockId){
		this.setModelData("FStockId", FStockId);
	}

	/**
	 * 
	 * @param FCreateOrgId
	 */
	public void setFCreateOrgId(String FCreateOrgId){
		this.setModelFNumberData("FCreateOrgId", FCreateOrgId);
	}

	/**
	 * 
	 * @param FNumber
	 */
	public void setFNumber(String FNumber){
		this.setModelData("FNumber", FNumber);
	}

	/**
	 * 
	 * @param FUseOrgId
	 */
	public void setFUseOrgId(String FUseOrgId){
		this.setModelFNumberData("FUseOrgId", FUseOrgId);
	}

	/**
	 * 
	 * @param FName
	 */
	public void setFName(String FName){
		this.setModelData("FName", FName);
	}

	/**
	 * 
	 * @param FStockProperty
	 */
	public void setFStockProperty(String FStockProperty){
		this.setModelData("FStockProperty", FStockProperty);
	}

	/**
	 * 
	 * @param FThirdStockType
	 */
	public void setFThirdStockType(String FThirdStockType){
		this.setModelData("FThirdStockType", FThirdStockType);
	}

	/**
	 * 
	 * @param FSupplierId
	 */
	public void setFSupplierId(String FSupplierId){
		this.setModelFNumberData("FSupplierId", FSupplierId);
	}

	/**
	 * 
	 * @param FCustomerId
	 */
	public void setFCustomerId(String FCustomerId){
		this.setModelFNumberData("FCustomerId", FCustomerId);
	}

	/**
	 * 
	 * @param FAddress
	 */
	public void setFAddress(String FAddress){
		this.setModelData("FAddress", FAddress);
	}

	/**
	 * 
	 * @param FTHIRDSTOCKNO
	 */
	public void setFTHIRDSTOCKNO(String FTHIRDSTOCKNO){
		this.setModelData("FTHIRDSTOCKNO", FTHIRDSTOCKNO);
	}

	/**
	 * 
	 * @param FTel
	 */
	public void setFTel(String FTel){
		this.setModelData("FTel", FTel);
	}

	/**
	 * 
	 * @param FDescription
	 */
	public void setFDescription(String FDescription){
		this.setModelData("FDescription", FDescription);
	}

	/**
	 * 
	 * @param FGroup
	 */
	public void setFGroup(String FGroup){
		this.setModelFNumberData("FGroup", FGroup);
	}

	/**
	 * 
	 * @param FStockStatusType
	 */
	public void setFStockStatusType(String FStockStatusType){
		this.setModelData("FStockStatusType", FStockStatusType);
	}

	/**
	 * 
	 * @param FDefStockStatusId
	 */
	public void setFDefStockStatusId(String FDefStockStatusId){
		this.setModelFNumberData("FDefStockStatusId", FDefStockStatusId);
	}

	/**
	 * 
	 * @param FDefReceiveStatusId
	 */
	public void setFDefReceiveStatusId(String FDefReceiveStatusId){
		this.setModelFNumberData("FDefReceiveStatusId", FDefReceiveStatusId);
	}

	/**
	 * 
	 * @param FAllowMinusQty
	 */
	public void setFAllowMinusQty(boolean FAllowMinusQty){
		this.setModelData("FAllowMinusQty", FAllowMinusQty);
	}

	/**
	 * 
	 * @param FAllowLock
	 */
	public void setFAllowLock(boolean FAllowLock){
		this.setModelData("FAllowLock", FAllowLock);
	}

	/**
	 * 
	 * @param FIsOpenLocation
	 */
	public void setFIsOpenLocation(boolean FIsOpenLocation){
		this.setModelData("FIsOpenLocation", FIsOpenLocation);
	}

	/**
	 * 
	 * @param FAllowMRPPlan
	 */
	public void setFAllowMRPPlan(boolean FAllowMRPPlan){
		this.setModelData("FAllowMRPPlan", FAllowMRPPlan);
	}

	/**
	 * 
	 * @param FAvailableAlert
	 */
	public void setFAvailableAlert(boolean FAvailableAlert){
		this.setModelData("FAvailableAlert", FAvailableAlert);
	}

	/**
	 * 
	 * @param FAvailablePicking
	 */
	public void setFAvailablePicking(boolean FAvailablePicking){
		this.setModelData("FAvailablePicking", FAvailablePicking);
	}

	/**
	 * 
	 * @param FSortingPriority
	 */
	public void setFSortingPriority(int FSortingPriority){
		this.setModelData("FSortingPriority", FSortingPriority);
	}
}
