package com.hsbc.oops;
class Demo2 implements Multiply {
	public int multiplyTwo(int num1, int num2) {
		return num1 * num2;
	}

	public int multiplyThree(int num1, int num2, int num3) {
		return num1 * num2 * num3;
	}

	public static void main(String args[]) {
		Multiply obj = new Demo2();
		System.out.println(obj.multiplyTwo(3, 7));
		System.out.println(obj.multiplyThree(1, 9, 0));
	}
}