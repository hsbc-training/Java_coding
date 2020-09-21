 package com.hsbc.model;

public class Order {
	private Address address;//immutable
	private Price price;

	public Order(Price price) {
		
		this.price = price;
	}

	public Price getPrice() {
		return price;
	}

	public Order(Address address) {
		
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}
	
	
}
