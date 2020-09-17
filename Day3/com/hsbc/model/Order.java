package com.hsbc.model;

public class Order {
	private Address address;
	private float price;
	public Order(Address address,float price)
	{this.address=address;
	 this.price=price;
	}
	public Address getAddress() {
		return address;
	}
	public float getPrice() {
		return price;
	}
}
