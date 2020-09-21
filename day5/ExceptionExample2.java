package day5;

public class ExceptionExample2 {
	public static void main(String[] args) {
		try {
			try {
				try {
					int arr[] = {1,2,3,4};
					System.out.println(arr[10]);
				} catch(ArithmeticException e) {
					System.out.println("Arithmetic Exception");
					System.out.println("handled in tryblock3");
				}
			} catch(ArithmeticException e){
				System.out.println("Arithmetic Exception");
				System.out.println("handled in tryblock2");
			}
		} catch (ArithmeticException e) {
			System.out.println("arithmetic");
			System.out.println("in tryblock");
		} catch(ArrayIndexOutOfBoundsException e4){
	    	System.out.print("ArrayIndexOutOfBoundsException");
	     	System.out.println(" handled in main try-block");
	    }
	    catch(Exception e5){
	    	System.out.print("Exception");
	     	System.out.println(" handled in main try-block");
	     }
	}
}
