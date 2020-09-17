package day3.com.hsbc;

import day3.com.hsbc.model.Address;
import day3.com.hsbc.model.Order;

public class Amazon {
	public static void main(String[] args) {
		Address address = new Address();
		address.setHouseNumber("D2-605");
		address.setPincode(567890);
		Order order = new Order(address,4546);
	}
}
