package com.hsbc.model;

import com.hsbc.model.Address;
import com.hsbc.model.Order;

public class Amazon {
	public static void main() {
		Address address = new Address();
		address.setHouseNumber("18/339");
		address.setPincode(226016);
		
		Order order = new Order(address);
		
		Price price = new Price();
		price.setMrp(100.00);
		price.setDiscount(10.5);
	}
}
