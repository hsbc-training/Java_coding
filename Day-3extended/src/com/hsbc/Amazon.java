package com.hsbc;

import com.hsbc.model.Address;
import com.hsbc.model.order;

public class Amazon {
	public static void main(String[] args) {
	Address address = new Address();
	address.setHouseNumber("B-302");
	address.setPinCode(411028);
	
	order o = new order(address,11F);
	}
}
