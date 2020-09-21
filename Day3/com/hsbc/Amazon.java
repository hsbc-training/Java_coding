package com.hsbc;

import com.hsbc.model.Address;
import com.hsbc.model.Order;

public class Amazon {
public static void main(String[] args) {
	Address address= new Address();
	address.setHouseNumber("D2-605");
	address.setPincode(456987);
	Order order =new Order(address,786.7F);
	System.out.println("Price of the order is:"+order.getPrice());
	System.out.println("Address of the order is:"+order.getAddress().getHouseNumber()+" "+order.getAddress().getPincode());
	
}}
