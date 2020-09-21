package com.hsbc.oops;

class ABC {
	public void myMethod() {
		System.out.println("Overridden Method");
	}
}

public class XYZ extends ABC {

	public void myMethod() {
		System.out.println("Overriding Method");
	}

	public static void main(String args[]) {
		ABC obj1 = new ABC();
		obj1.myMethod();
		// This would call the myMethod() of parent class ABC

		XYZ obj2 = new XYZ();
		obj2.myMethod();
		// This would call the myMethod() of child class XYZ

		ABC obj3 = new XYZ();
		obj3.myMethod();
		// This would call the myMethod() of child class XYZ
	}
}