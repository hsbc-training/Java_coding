package com.hsbc.model;

/**
 * class for address entity
 * 
 * @author User
 *
 */
public class Address {
	
	// house number of adressee
	private String houseNumber; // camelcase
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