package ExceptionHandling;

public class FinallyDemo {
public static void main(String[] args)
{
	try
	{
		System.out.println("In try Block");
        int j=45/0;
	}
	catch(ArithmeticException e)
	{
		System.out.println("Cant divide by zero");
	}
	finally
	{
		System.out.println("Always gets printed");
	}
}
}
