package com.hsbc.model;

/**
 * To hold the address details
 * 
 * @author ambrose
 *
 */
public class Address {
	//Store House Number of Address
	private String city;
	//Store pincode for the city
	private int pinCode;
	//Store house Number 
	private String houseNumber;
	
	// Setters and Getters for private Variables
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	public String getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}
	
	
}
