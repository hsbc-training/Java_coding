package com.hsbc.model;

public class Order {
	private Address address;
	private int price;
	
	public Order(Address address, int price) {
		super();
		this.address = address;
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public Address getAddress() {
		return address;
	} 

}
