package exception;
/**
 * finally example
 * @author suryavanshi
 *
 */
public class Example
{
	public static void main(String args[]) {
		try{  
			int num=121/0;  
			System.out.println(num);  
		}  
		catch(ArithmeticException e){
			System.out.println("Dont divide by zero");
		}  
		finally{
			System.out.println("This is finally. Always print");
		}  
		System.out.println("Out of try-catch-finally");  
	}   
}