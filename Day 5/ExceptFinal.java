package pack1;

public class ExceptFinal {
	public static void main(String[] args) {
		try {
			System.out.println("in try block");
			System.exit(0);
			//int num=0/0;
		}
		catch(ArithmeticException e) {
			System.out.println("This is arithematic exception ");
		}
		finally {
			System.out.println("just to run something after the try and catch");
		}
	}

}
