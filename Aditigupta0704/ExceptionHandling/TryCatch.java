package ExceptionHandling;

import java.io.*;
public class TryCatch {

	public static void main(String args[])
	   {
		FileInputStream f = null;
		try{
		    f = new FileInputStream("B:/myfile.txt"); 
		}catch(FileNotFoundException fnfe){
	            System.out.println(" file is not " +
				"present at the given path");
		 }
		int k; 
		try{
		    while(( k = f.read() ) != -1) 
		    { 
			System.out.print((char)k); 
		    } 
		    f.close(); 
		}catch(IOException ioe){
		    System.out.println("I/O error "+ioe);
		 }
	   }
	
}