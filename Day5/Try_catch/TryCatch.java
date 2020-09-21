package try_catch;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryCatch{
	public static void main(String[] args) {
		FileInputStream fis=null;
		try {
			fis=new FileInputStream("input.txt");
			
		}
		catch(FileNotFoundException fnfe){
			System.out.println("Specified file is not present at the given path");
			
		}
		int k;
		try {
			while((k=fis.read())!= -1) {
				System.out.print((char)k);
			}
			fis.close();
		}
			catch(IOException ioe)
			{
				System.out.println("I/O error occurred:" +ioe);
			}
		}
	}
