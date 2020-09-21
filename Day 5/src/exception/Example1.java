package exception;
/**
 * Exception Handling
 * @author suryavanshi
 *
 */
public class Example1 {
	public static void main(String args[]) {
		try {
			System.out.println(22/0);
			System.out.println("Hey I'm at the end of try block");
		}
		catch (ArithmeticException e) { 
			System.out.println("You should not divide a number by zero");
		}
		catch (Exception e) {
			System.out.println("Exception occurred");
		}
		System.out.println("I'm out of try-catch block in Java.");
	}
}