package com.hsbc.model;
/**
 * class for addresss entity
 * @author admin
 *
 */
public class Address {
	//house number of addressee.
	private String houseNumber;//camelcase
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
