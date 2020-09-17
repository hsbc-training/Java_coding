package com.hsbc;

import com.hsbc.model.Address;
import com.hsbc.model.Order;

public class Amazon {
	public static void main(String[] args) {
		
		Address address = new Address();
		address.setHouseNumber("E2-29");
		address.setPincode(411028);
		//Order order = new Order(address,1000);
		Order order = new Order(address,1000);
		System.out.println();
	}
}
