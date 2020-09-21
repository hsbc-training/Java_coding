package com.hsbc.model;
/**
 * class for address entity
 * @author FAREEYA
 *
 */
public class Address {
	//house number of the addressee.
	private  String houseNumber;
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
