package day5_ExceptionHandling;
import java.io.*;
public class Example4 {
	
	public static void main(String[] args) {
		
		FileInputStream fis= null;
		
		try {
			fis= new FileInputStream("B:/myfile.txt");
		}
		catch(FileNotFoundException fnfe){
			System.out.println("The specified file is not found");
		}
		
		int k;
		
		try
		{
			while((k= fis.read())!=-1) {
				System.out.println((char)k);
			}
			fis.close();
		}
		
		catch(IOException ioe)
		{
			System.out.println("i/o exception occurred");
		}
	}

}



