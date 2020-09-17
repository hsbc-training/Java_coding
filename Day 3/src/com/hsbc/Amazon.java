package com.hsbc;

import com.hsbc.model.Address;
import com.hsbc.model.Order;
import com.hsbc.model.Price;

public class Amazon {
public static void main(String[] args) {
	
	Address address = new Address();
	address.setHouseNumber("D2-605");
	address.setPincode(5556);
	Order order = new Order(address);
	Price price = new Price();
	
	
}
}
