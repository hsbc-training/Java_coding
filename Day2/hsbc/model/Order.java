package com.hsbc.model;
/**
doing java documentation
 explain what program is about
}
*/
public class Order {
	private Address address;//immutable,therefore no setter
    private float Price;
	public Order(Address address, float Price) {
		super();
		this.address = address;
		this.Price=Price;
	}

	public Address getAddress() {
		return address;
	}

	
}