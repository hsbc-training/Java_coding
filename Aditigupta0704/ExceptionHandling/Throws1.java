package ExceptionHandling;
import java.io.*;
public class Throws1 {

	public static void main(String[]args) throws IOException,FileNotFoundException
	{
		int k;
		FileInputStream f=null;
		f=new FileInputStream("input.txt");
		while((k=f.read())!=-1)
		{
			System.out.print((char)k);
		}
		f.close();
    }
}
