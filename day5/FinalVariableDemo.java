package day5;

public class FinalVariableDemo {
	final int MAX_VALUE = 99;
	
	
	//Compilation Error
	void myMethod() {
		//MAX_VALUE = 101;
	}
	
	public static void main(String[] args) {
		FinalVariableDemo obj = new FinalVariableDemo();
		obj.myMethod();
	}
}
