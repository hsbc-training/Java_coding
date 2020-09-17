package com.hsbc.model;

public class Order {

	private Address address; //
	private int price;
	
	
	
	public double getPrice() {
		return price;
	}
	
	
	public Order(Address address,int price)
	{
		this.address=address;
		this.price=price;
	}
	public Address getAddress() {
		return address;
	}
}
