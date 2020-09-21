package pack1;

import java.io.FileInputStream;
import java.io.IOException;

public class Method1 {
	public static void main(String args[]) throws IOException
	   {
	      FileInputStream fis = null;
	      fis = new FileInputStream("myfile.txt"); 
	      int k; 

	      while(( k = fis.read() ) != -1) 
	      { 
		   System.out.print((char)k); 
	      } 
	      fis.close(); 	
	   }
}
