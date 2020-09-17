package com.hsbc;

import com.hsbc.model.Address;
import com.hsbc.model.Order;

public class Amazon {
public static void main(String[] args) {
	Address address=new Address();
	address.setHouseNumber("d35");
	address.setPincode(567890);
	Order order=new Order(address,345.77F);
}
}
