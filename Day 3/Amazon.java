package day3;
//package com.hsbc

//import com.hsbc.model.hsbcpackage;
//import com.hsbc.model.Order;
public class Amazon {
	public static void main(String[] args) {
		hsbcpackage address = new hsbcpackage();
		address.setHouseNumber("D2-605");
		address.setPincode(202131);
		Order order=new Order(address);
		
	}
}
