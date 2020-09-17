package com.hsbc.model;
/**
 * class for Address entity
 * @author suryavanshi
 *
 */
public class Address {
	//House Number of Addressee
	private String houseNumber;
	private int pincode;
	
	public String getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	
}
