package pack1;

public class ExampleTnc {
public static void mymethod() throws ArithmeticException, NullPointerException
{
	int a=0/0;
	System.out.println(a);
	
}
public static void main(String[] args) {
	try {
		mymethod();
	}catch(ArithmeticException e) {
		System.out.println("Arithematic");
	}
	catch(NullPointerException e) {
		System.out.println("Null pointer");
	}
}
}
