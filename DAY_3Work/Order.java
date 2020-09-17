package com.hsbc.model;

public class Order {
	private Address address; //immutable 
	private float price;//immutable
	
	public Address getAddress() {
		return address;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

}
