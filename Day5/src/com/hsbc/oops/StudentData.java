package com.hsbc.oops;

class StudentData {
	final int ROLL_NO;

	StudentData(int rnum) {
		ROLL_NO = rnum;
	}

	void myMethod() {
		System.out.println("Roll no is:" + ROLL_NO);
	}

	public static void main(String args[]) {
		StudentData obj = new StudentData(1234);
		obj.myMethod();
	}
}