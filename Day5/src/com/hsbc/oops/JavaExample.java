package com.hsbc.oops;

public class JavaExample {
	public static void main(String args[]) {

		JavaExample obj = new JavaExample();
		obj = null;

		JavaExample a = new JavaExample();
		JavaExample b = new JavaExample();
		b = a;
		System.gc();
	}

	protected void finalize() throws Throwable {
		System.out.println("Garbage collection is performed by JVM");
	}
}