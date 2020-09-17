package com.java;

import com.hsbc.model.Address;
import com.hsbc.model.Order;

public class Amazon {
   public static void main(String[] args)
   {
	   Address address=new Address();
	   address.setHouseNumber("D2-567");
	   address.setPincode(416319);
	   Order order=new Order(address,358.90F);
   }
}
