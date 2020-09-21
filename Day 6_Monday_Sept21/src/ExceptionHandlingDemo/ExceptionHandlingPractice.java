package ExceptionHandlingDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
/*
 * @Author Pratham Sharma
 * 
 *  Package created to practice exception handling
 * 
 */

//UserDefined Exception
class MyException extends Exception{
	
	private String str1;
	
	MyException(String str2){
		str1 = str2;
	}	
	
	public String toString() {
		return("MyException Occured "+str1);
	}
}

class MyUncheckedException extends RuntimeException{

	public MyUncheckedException(String string) {

	}
	
}

class InvalidProductException extends Exception
{
    public InvalidProductException(String s)
    {
        super(s);
    }
}
public class ExceptionHandlingPractice {
	
	void productCheck(int weight) throws InvalidProductException{
		if (weight<100) {
			throw new InvalidProductException("Product Invalid");
		}
	}
	
	public static void main(String[] args) {
		int num1, num2;
	      try {
	         num1 = 0;
	         num2 = 34 / num1;
	         System.out.println(num2);
	         System.out.println("End of try block");
	      }
	      catch (ArithmeticException e) { 
	         System.out.println("You should not divide a number by zero");
	      }
	      catch (Exception e)  {// catches all exceptions
	         System.out.println("Exception occurred " + e);
	      }
	      System.out.println("\n");
	      
	      //Multiple catch block
	      try{
	          int a[]=new int[7];
	          a[4]=30/0;
	          System.out.println("First print statement in try block");
	      }
	      catch(ArithmeticException e){
	         System.out.println("Warning: ArithmeticException");
	      }
	      catch(ArrayIndexOutOfBoundsException e){
	         System.out.println("Warning: ArrayIndexOutOfBoundsException");
	      }
	      catch(Exception e){
	         System.out.println("Warning: Some Other exception");
	      }
	      
	      System.out.println("\n");
	      //Nested Try Catch
	      try{
	          try{     
	              try{
	              	int arr[]= {1,2,3,4};
	              	System.out.println(arr[10]);
	              }catch(ArithmeticException e){
	              	System.out.print("Arithmetic Exception");
	              	System.out.println(" handled in try-block3");
	              }
	          }
	          catch(ArithmeticException e){
	             System.out.print("Arithmetic Exception");
	             System.out.println(" handled in try-block2");
	          }
	      }
	      catch(ArithmeticException e3){
	      	System.out.print("Arithmetic Exception");
	       	System.out.println(" handled in main try-block");
	      }
	      catch(ArrayIndexOutOfBoundsException e4){
	      	System.out.print("ArrayIndexOutOfBoundsException");
	       	System.out.println(" handled in main try-block");
	      }
	      catch(Exception e5){
	      	System.out.print("Exception");
	       	System.out.println(" handled in main try-block");
	       }
	      
	      System.out.println("\n");
	      //Nested Try 
	      try{
	           try{
	              System.out.println("Inside block1");
	              int b =5/0;
	              System.out.println(b);
	           }
	           catch(ArithmeticException e1){
	              System.out.println("Exception: e1");
	           }
	           try{
	              System.out.println("Inside block2");
	              int b =5/0;
	              System.out.println(b);
	           }
	           catch(ArrayIndexOutOfBoundsException e2){
	              System.out.println("Exception: e2");
	           }
	          System.out.println("Just other statement");
	      }
	      catch(ArithmeticException e3){
	      	 System.out.println("Arithmetic Exception");
	           System.out.println("Inside parent try catch block");
	      }
	      catch(ArrayIndexOutOfBoundsException e4){
	      	System.out.println("ArrayIndexOutOfBoundsException");
	           System.out.println("Inside parent try catch block");
	      }
	      catch(Exception e5){
	      	System.out.println("Exception");
	           System.out.println("Inside parent try catch block");
	      }
	      System.out.println("Next statement..");
	      
	      //Checked Unchecked Example
	      System.out.println("\nChecked Unchecked Exceptions");
	      FileInputStream fis = null;
	  	  try{
	  	      fis = new FileInputStream("myfile.txt"); 
	  	  }catch(FileNotFoundException fnfe){
	                System.out.println("The specified file is not " +"present at the given path");
	  	  }
	  	  int k; 
	  	  try{
	  	      while(( k = fis.read() ) != -1) 
	  	      { 
	  		  System.out.print((char)k); 
	  	      } 
	  	      fis.close(); 
	  	  }catch(IOException ioe){
	  	      System.out.println("I/O error occurred: "+ioe);
	  	   }
	  	  
	  	  
	  	  System.out.println("\n");
	  	  try{
	 	     int arr[] ={1,2,3,4,5};
	 	     System.out.println(arr[7]);
	 	  }
	           catch(ArrayIndexOutOfBoundsException e){
	 	     System.out.println("The specified index does not exist " +"in array. Please correct the error.");
	 	  }
	  	  
	  	 //Finally block
	  	 System.out.println("\n");
	  	 try{  
	  		 int num=121/0;  
	  		 System.out.println(num);  
	  	 }  
  	     catch(ArithmeticException e){
  	        System.out.println("Number should not be divided by zero");
  	     }  
  	     finally{
  	    	 System.out.println("This is finally block");
  	     }  
  	     System.out.println("Out of try-catch-finally");  
  	     
  	     //UserDefinedException
  	     System.out.println("\n");
  	     //1
  	     System.out.println("Custom exception 1\n");
  	     try{
  			  System.out.println("Starting of try block");
  			  // I'm throwing the custom exception using throw
  			  throw new MyException("This is My error Message");
  		 }
  		 catch(MyException exp){
  			 System.out.println("Catch Block") ;
  			 System.out.println(exp) ;
  		 }
  	     //2
  	     System.out.println("\nCustom exception 2\n");
  	     try {
  	    	 System.out.println("Starting of try block");
  	    	 throw new MyException("Checked Exception error message");
  	    	 //throw new MyUncheckedException("UnChecked Exception error message");
  	     }
  	     catch(MyException e){
  	    	 System.out.println("In Catch " + e);
  	     }
  	     finally {
  	    	 System.out.println("In Finally Block");
  	     }
  	     
  	    //3
  	    System.out.println("\nCustom exception 3\n");
  	    ExceptionHandlingPractice obj = new ExceptionHandlingPractice();
  	    try {
  		    obj.productCheck(60);
  	    }
  	    catch(InvalidProductException e) {
  		    System.out.println("Caught exception");
  		    System.out.println(e.getMessage());
  	    }
  	    
  	    //Exception examples
  	    try {
  	    	int a=30;
  	    	int b=0;
  	    	int output = a/b;	
  	    }
  	    catch (ArithmeticException e) {
  	    	System.out.println("Cant divide a number by 0, error:"+e);
  	    }
  	    
  	    try{
          int a[]=new int[10];
          //Array has only 10 elements
          a[11] = 9;
        }
        catch(ArrayIndexOutOfBoundsException e){
           System.out.println ("ArrayIndexOutOfBounds");
        }
  	  
  	    try{
  		  int num=Integer.parseInt ("XYZ") ;
  		  System.out.println(num);
  	    }
  	    catch(NumberFormatException e){
  		   System.out.println("Number format exception occurred");
  	    }
  	  
	}
}
