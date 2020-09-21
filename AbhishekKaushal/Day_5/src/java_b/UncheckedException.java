package java_b;

class MyException extends Exception{
	//String str;
	public MyException(String string) {
		// TODO Auto-generated constructor stub
		super(string);
	}
	
}

public class UncheckedException {
	public static void main(String[] args) {
		try {
		System.out.println("try block");
		throw new MyException("Error message");
		}
		catch (MyException e) {
			// TODO: handle exception
			System.out.println("catch block");
			System.out.println(e);
		}
		finally {
			System.out.println("finally");
		}
	}
}
