package com.hsbc.model;
/**
 * Class for address entity
 * @author Mauli
 *
 */
public class Address {
	//indicates the house number of addressee           
	private String houseNumber;
	//indicates the pin code of addressee
	private int pinCode;
	public String getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
}
