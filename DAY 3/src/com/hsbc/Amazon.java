package com.hsbc;

import com.hsbc.model.Address;
import com.hsbc.model.Order;

public class Amazon {
	static int m1 (int i1, int i2) {
	    int i3=0;
	    if (i1 > 0) {i3 = i1 + i2;}
	    return i3;
	  }
	char c=7;
	long l=c;
	static boolean x;
	public static void main(String[] args) {
		char c=7;
		Address address = new Address();
		address.setHouseNumber("511");
		address.setPincode(110075);
		Order order = new Order(address, 3456.565f);
		
		
		System.out.println(c);
		
		
	}
	
		
	}

