package com.hsbc;
import com.hsbc.model.*;

public class Amazon {
	public static void main(String[] args) {
		
		Address address = new Address();
		address.setHouseNumber("D1-605");
		address.setPinCode(567889);
		Order order = new Order(address,56000);
	}
}
