package com.hsbc.model;
/** 
 * class for address entity
 * @author hp
 *
 */
public class Address {
	//house number of addressee.
   private String HouseNumber;  //camelcase
   private int pincode;
   
public String getHouseNumber() {
	return HouseNumber;
}
public void setHouseNumber(String houseNumber) {
	HouseNumber = houseNumber;
}
public int getPincode() {
	return pincode;
}
public void setPincode(int pincode) {
	this.pincode = pincode;
}
   
   
}
