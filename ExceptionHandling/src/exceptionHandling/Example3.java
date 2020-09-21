package exceptionHandling;

public class Example3 {
public static void main(String[] args) {
	try{
		System.out.println("Starting of try block");
		throw new MyException("This is My error Message");
	}
	catch(MyException exp){
		System.out.println("Catch Block") ;
		System.out.println(exp) ;
	}
	finally
	{
		System.out.println("Finally");
	}
}
}
