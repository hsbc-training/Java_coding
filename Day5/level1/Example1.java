package level1;

public class Example1 {
public static void main(String[] args) {
	int num1,num2;
	try {
		num1=0;
		num2=62/num1;
		System.out.println(num2);
		System.out.println("HEy i am at the end of try");
	}
	catch(ArithmeticException e) {
		System.out.println("divide by zero exception");
	}
	//genric catch block,placed at end
	catch(Exception e) {
		System.out.println("Exception occurred");
	}
	System.out.println("out of try catch");
}
}
