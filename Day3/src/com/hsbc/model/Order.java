package com.hsbc.model;

public class Order {
	//making an object of address class
	private Address address; //immutable
	private int price = 500;
	public Order(Address address) {
		this.address = address;
	}
	public Address getAddress() {
		return address;
	}
	public int getPrice() {
		return price;
	}
	
}
