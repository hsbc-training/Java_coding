package ExceptionHandling;
import java.util.*;
import java.io.*;
class AgeException extends Exception
{
	String str1;
	AgeException(String msg)
	{
		str1=msg;
	}
	public String toString()
	{
		return("The message is"+str1);
	}
}
public class UserDefinedException {

	public void check(int age) throws AgeException
	{
		if(age<18)
		{
			throw new AgeException("You are not eligible");
		}
		else
		{
			System.out.println("Success");
		}
	}
	public static void main(String[] args)
	{
		int age = 0;
	 UserDefinedException udf=	new UserDefinedException();
	 System.out.println("enter age");
	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 try
	 {
	 age=Integer.parseInt(br.readLine());
	 }
	 catch(IOException e)
	 {
		 System.out.println(e);
	 }
	 try
	 {
	 udf.check(age);
	 }
	 catch(AgeException e)
	 {
		 System.out.println(e);
	 }
	}
}
