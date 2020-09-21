package try_catch;

 class MyExcept extends Exception {
	String str1;
	public MyExcept(String str2) {
		str1=str2;
	}
	public String toString()
	{ return ("My Exception Occurred"+str1);
		
	}

}
public class MyException{
	public static void main(String[] args) {
		try {
			System.out.println("Starting of try block");
			throw new MyExcept("This is my error message");
		}
		catch(MyExcept exp) {
			System.out.println("Catch block");
			System.out.println(exp);
		}
	}
} 

