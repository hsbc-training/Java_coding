package Exception_methods;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Example {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = null;
		try 
		{
			fis = new FileInputStream("File.txt");
		} 
		catch (FileNotFoundException fnfe) 
		{
			System.out.println("The specified file is not " + "present at the given path");
		}
		int k;
		try 
		{
			while ((k = fis.read()) != -1) 
			{
				System.out.print((char) k);
			}
		fis.close();
		}
		catch(IOException e)
		{
			System.out.println("I/O error occurred: "+e);
		}
		}
	}

