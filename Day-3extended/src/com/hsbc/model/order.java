package com.hsbc.model;

public class order {
	private Address address; //immutable
	private float price;
	public order(Address address,float price){
		this.address = address;
		this.price = price;
	} 
	public Address getAddress() {
		return address;
	}
	public float getPrice() {
		return price;
	}
}
