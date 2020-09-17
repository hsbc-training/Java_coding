package com.hsbc.model;
/**
 * class for address entity
 * @author ladka
 *
 */
public class Address {
	//house number of addressee
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
