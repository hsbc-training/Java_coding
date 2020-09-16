package corejava;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileOperations {
	
	static void byteStreamExample() throws IOException {
		
		FileInputStream in =null;
		FileOutputStream out = null;
		
		
		try {
			in = new FileInputStream("readme.txt");
			out = new FileOutputStream("writetome.txt");
			int rollno;
	         while ((rollno = in.read()) != -1) {
	        	 
	            out.write(rollno);
		} }catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			 if (in != null) {
		            in.close();
		         }
		         if (out != null) {
		            out.close();
		         }
		}
		
	}
	
	static void charStreamExample() throws FileNotFoundException,IOException {
		
		  FileReader in = null;
	      FileWriter out = null;
	      try {
	         in = new FileReader("readme.txt");
	         out = new FileWriter("output.txt");
	         
	         int c;
	         String buff = new String();
	         while ((c = in.read()) != -1) {
	        	 //System.out.println((char)c);
	        	 buff+=(char)c;

	         }

	         StringBuilder sb = new StringBuilder(buff);
	         System.out.println("Printing Content in Reverse");
	         System.out.println(sb.reverse());
	         for(int i : sb.toString().getBytes())
	        
	         out.write(i);
	         
	      }finally {
	         if (in != null) {
	            in.close();
	         }
	         if (out != null) {
	            out.close();
	         }
	      }
		
	}
	
	public static void main(String[] args) throws IOException {
		//byteStreamExample();
		charStreamExample();
	}
}
