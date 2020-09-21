package exceptionHandling;

import java.io.*;


public class Example2 {
	
	public static void main(String[] args) {
		FileInputStream io = null;
		try
		{
			io = new FileInputStream("myfile.txt");
		}
		
		catch(FileNotFoundException fnfe){
            System.out.println("The specified file is not " +
			"present at the given path");
	 }
	int k; 
	try{
	    while(( k = io.read() ) != -1) 
	    { 
		System.out.print((char)k); 
	    } 
	    io.close(); 
	}catch(IOException ioe){
	    System.out.println("I/O error occurred: "+ioe);
	 }
	}

}
