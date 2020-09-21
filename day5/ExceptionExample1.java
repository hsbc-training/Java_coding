package day5;

public class ExceptionExample1 {
public static void main(String[] args) {
	int num1,num2;
	try {
		num1 = 0;
		num2 = 62/num1;
		System.out.println(num2);
		System.out.println("END OF TRY BLOCK");
	} catch(ArithmeticException e) {
		System.out.println("You should not divide by zero");
	} catch(Exception e) {
		System.out.println("Exception occured");
	}
	
	System.out.println("Out of try-catch");
}
}
