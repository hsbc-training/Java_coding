package com.hsbc.oops;

class Human2 {
	// Overridden Method
	public void walk() {
		System.out.println("Human walks");
	}
}

class Demoz extends Human2 {
	// Overriding Method
	public void walk() {
		System.out.println("Boy walks");
	}

	public static void main(String args[]) {
//Reference is of Human type and object isBoy type
		Human2 obj = new Demoz();
//Reference is of HUman type and object is of Human type.
		Human2 obj2 = new Human2();
		obj.walk();
		obj2.walk();
	}
}