package com.hsbc;

import com.hsbc.model.Address;
import com.hsbc.model.Order;

public class Amazon {
	  public static void main(String[] args) {
		Address address = new Address();
		address.setHouseNumber("MSD1012");
		address.setPinCode(382007);
		Order order = new Order(address);
	}
}