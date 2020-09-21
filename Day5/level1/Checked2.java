package level1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//using try catch
public class Checked2 {
	public static void main(String args[])
	   {
		FileInputStream fis=null;
		try {
			fis=new FileInputStream("myfile.txt");
		}
		catch(FileNotFoundException e) {
			System.out.println("file is not present");
		}
		int k;
		try {
			while((k=fis.read())!=-1) {
				System.out.println((char)k);
			}
		}
		catch(IOException e1) {
			System.out.println("I/O error occurred:"+e1);
		}
		
}}
