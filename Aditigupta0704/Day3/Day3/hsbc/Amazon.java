package com.hsbc;

import com.hsbc.model.Address;
import com.hsbc.model.Order;

public class Amazon {
public static void main(String[] args)
{
	Address address=new Address();
	address.setHouseNumber("C-48");
	address.setPincode(78345);
	Order order= new Order(address,213);
	System.out.println(order.getPrice());
}
}
