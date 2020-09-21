package day5;
import java.io.*;

class ThrowExample{
	void myMethod(int num) throws IOException,ClassNotFoundException{
		if (num==1)
			throw new IOException("IOException Occured");
		else 
			throw new ClassNotFoundException("ClassNotFoundException");
	}
}
public class ExceptionExample6 {
	public static void main(String[] args) {
		try {
			ThrowExample obj = new ThrowExample();
			obj.myMethod(1);
		} catch(Exception e) {
			System.out.println(e);
		}
	}
}
