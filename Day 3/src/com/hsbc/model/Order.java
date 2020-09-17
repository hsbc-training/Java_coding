package com.hsbc.model;
/**
 * 
 * @author suryavanshi
 *
 */

public class Order {
	private Address address;	
	private int price;
	
	public Order(Address address, int price) {
		this.address = address;
		this.price = price;
	}

	public Address getAddress() {
		return address;
	}

	public int getPrice() {
		return price;
	}
	
}
