package level1;

import java.io.FileInputStream;
import java.io.IOException;
//using throws


public class Checked {
	 public static void main(String args[]) throws IOException //we only threw IOException and not File not founf because It is the child of IOException class
	   {
		FileInputStream fis = null;
		/*This constructor FileInputStream(File filename)
		 * throws FileNotFoundException which is a checked
		 * exception
	         */
	        fis = new FileInputStream("myfile.txt"); 
		int k; 

		/* Method read() of FileInputStream class also throws 
		 * a checked exception: IOException
	         */
		while(( k = fis.read() ) != -1) 
		{ 
			System.out.print((char)k); 
		} 

		/*The method close() closes the file input stream
		 * It throws IOException*/
		fis.close(); 	
	   }
}
