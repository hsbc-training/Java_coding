package com.hsbc.oops;

class Boy1 extends Human1 {
	public static void walk() {
		System.out.println("Boy walks");
	}

	public static void main(String args[]) {
//Reference is of Human type and object is Boy type
		Human1 obj = new Boy1();
//Reference is of HUman type and object is of Human type.
		Human1 obj2 = new Human1();
		obj.walk();
		obj2.walk();
	}
}