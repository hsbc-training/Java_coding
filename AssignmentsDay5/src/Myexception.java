
 class myException extends exception{

	String str1;
	MyException(String str2)
	{
		str1=str2;
	}
	@Override
	public String toString(){ 
		return ("MyException Occurred: "+str1) ;
	}
}

public class Example1{
	public static void main(String[] args) {
		try {
			System.out.println();
		}
	}
}
