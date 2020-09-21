package com.hsbc.exceptionH;
import java.io.*;
class Examplemeathod1 {  
   public static void main(String args[]) throws IOException
   {
      FileInputStream fis = null;
      fis = new FileInputStream("B:/myfile.txt"); 
      int k; 

      while(( k = fis.read() ) != -1) 
      { 
	   System.out.print((char)k); 
      } 
      fis.close(); 	
   }
}