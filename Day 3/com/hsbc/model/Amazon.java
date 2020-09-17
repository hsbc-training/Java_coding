package com.hsbc.model;

import com.hsbc.model.Address;
import com.hsbc.model.Order;

public class Amazon {
public static void main(String args[]) {
	Address address = new Address();
	address.setHouseNumber("02-342");
	address.setPincode(411006);
	Order order = new Order(address)
}
}
