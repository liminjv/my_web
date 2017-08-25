package com.limin.vehicle;

public class VehicleVo {

	private String licenceNo;
	private int licenceColor;//颜色编号 如：1
	private String licenceColorDesc;//颜色描述 如：蓝色
	private String vehicleType;
	private String ownerName;
	public String getLicenceNo() {
		return licenceNo;
	}
	public void setLicenceNo(String licenceNo) {
		this.licenceNo = licenceNo;
	}
	public int getLicenceColor() {
		return licenceColor;
	}
	public void setLicenceColor(int licenceColor) {
		this.licenceColor = licenceColor;
	}
	
	public String getLicenceColorDesc() {
		return licenceColorDesc;
	}
	public void setLicenceColorDesc(String licenceColorDesc) {
		this.licenceColorDesc = licenceColorDesc;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	@Override
	public String toString() {
		return "VehicleVo [licenceNo=" + licenceNo + ", licenceColor="
				+ licenceColor + ", licenceColorDesc=" + licenceColorDesc
				+ ", vehicleType=" + vehicleType + ", ownerName=" + ownerName
				+ "]";
	}
}
