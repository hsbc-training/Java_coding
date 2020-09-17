package com.hsbc;

import com.hsbc.model.Address;
import com.hsbc.model.Order;

public class Amazon {
 public static void main(String[] args) {
	Address address = new Address();
	address.setHouseNumber("B1-1108");
	address.setPincode(411028);
	Order order = new Order(address, 200);
	System.out.println(order.getPrice());
	System.out.println(order.getAddress());

	

}
}
