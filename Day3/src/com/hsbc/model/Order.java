package com.hsbc.model;

public class Order {
	private Address address;//
	private Price price;

	public Order(Price price) {
		this.price = price;
	}

	public Order(Address address) {
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	public  Price getPrice() {
		return price;
	}

}
