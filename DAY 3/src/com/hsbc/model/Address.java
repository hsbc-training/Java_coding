package com.hsbc.model;

/**
 * 
 * @author Pratham Sharma
 *
 *Class for address entity
 */
public class Address {
	
	private String houseNumber;
	private int pincode;

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}
}
