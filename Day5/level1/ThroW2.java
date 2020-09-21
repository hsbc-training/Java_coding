package level1;
//custom or user defined exceptions
public class ThroW2 {
public static void main(String[] args) {
	try {
		System.out.println("starting of try block");
	    throw new MyException("This is error");
	    }
	catch(MyException exc) {
		System.out.println("catch block");
		System.out.println(exc);
	}
}

}
class MyException extends Exception{
	String str1;

	public MyException(String str2) {
		
	str1 = str2;
	}

	@Override
	public String toString() {
		
		return ("MyException occurred"+str1);
	}
	
     
}
