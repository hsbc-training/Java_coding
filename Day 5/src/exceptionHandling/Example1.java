package exceptionHandling;

public class Example1 {
	
	public static void main(String[] args) {
		int num1, num2;
		try {
			num1 =0;
			num2 = 62/num1;
			System.out.println(num2);
			System.out.println("End of try block");
		}
		
		catch(ArithmeticException e){
			
			System.out.println("ArithmeticException occured");
			
		}
		
		catch(ArrayIndexOutOfBoundsException e){
	        System.out.println("Warning: ArrayIndexOutOfBoundsException");
	     }
		
		catch(Exception e){
			
			System.out.println("Exception occured");
			
		}
		
		finally
		{
			System.out.println("This is finally block");
		}
		
		System.out.println("End of try-catch block");
	}

}
