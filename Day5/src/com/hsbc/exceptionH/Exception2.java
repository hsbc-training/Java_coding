package com.hsbc.exceptionH;

class Exception2 {
	public static void main(String args[]) {
		try {
			String str = null;
			System.out.println(str.length());
		} catch (NullPointerException e) {
			System.out.println("NullPointerException..");
		}
	}
}