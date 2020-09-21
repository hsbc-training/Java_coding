package ExceptionHandling;

class InvalidProductException extends Exception
{
	String str;
//	public InvalidProductException(String str)
//	{
//		super(str);
//	}
	public InvalidProductException(String str)
	{
		this.str=str;
	}
	public String toString()
	{
		return ("The exception has occured!!! "+str);
	}
}
public class UserDefinedException2 {
public void check(int w) throws InvalidProductException
{
	if(w>100)
	{
		throw new InvalidProductException("Not a valid Prodcut");
	}
	else
	{
		System.out.println("Valid Product");
	}
}
public static void main(String[] args)
{
	UserDefinedException2  u=new UserDefinedException2 ();
	try
	{
	u.check(180);
    }
	catch(InvalidProductException e)
	{
		System.out.println(e);
	}
	
}
}