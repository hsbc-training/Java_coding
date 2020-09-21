package com.hsbc.exceptionH;

public class Example12 {
	void productCheck(int weight) throws InvalidProductException {
		if (weight < 100) {
			throw new InvalidProductException("Product Invalid");
		}
	}

	public static void main(String args[]) {
		Example12 obj = new Example12();
		try {
			obj.productCheck(60);
		} catch (InvalidProductException ex) {
			System.out.println("Caught the exception");
			System.out.println(ex.getMessage());
		}
	}
}