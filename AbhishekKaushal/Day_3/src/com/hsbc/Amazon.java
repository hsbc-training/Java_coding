package com.hsbc;

import com.hsbc.model.Address;
import com.hsbc.model.Order;
public class Amazon {
	public static void main(String[] args) {
		Address address=new Address();
		address.setHouseNumber("151");
		address.setPincode(147003);
		Order order=new Order(address, 1000.0f);
	}
}
