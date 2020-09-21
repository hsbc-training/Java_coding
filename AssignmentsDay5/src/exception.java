import java.io.*;
public class exception {
	//example 1
	
//public static void main(String[] args) {
//	int num1,num2;
//	try 
//	{
//	num1=0;
//	num2=62/num1;
//	System.out.println(num2);
//	System.out.println("end of try block");
//	}
//	catch(ArithmeticException e)
//	{
//		System.out.println("divie by zero");
//	}
//	catch(Exception e)
//	{
//		System.out.println("exception occured");
//	}
//	System.out.println("out of try catch");
//}
	
	//example 2
//	public static void main(String[] args) {
//		try
//		{
//			int a[]=new int[10];
//			a[11]=9;
//		}
//		catch(ArrayIndexOutOfBoundsException e)
//		{
//			System.out.println("ArrayIndexOutofBounds");
//		}
//	}
	
		

		// throws
	 
//	   public static void main(String args[]) throws IOException
//	   {
//	      FileInputStream fis = null;
//	      fis = new FileInputStream("myfile.txt"); 
//	      int k; 
//
//	      while(( k = fis.read() ) != -1) 
//	      { 
//		   System.out.print((char)k); 
//	      } 
//	      fis.close(); 	
//	   }
	
	//checked exception
	
//	public static void main(String[] args) {
//		
//		FileInputStream fis=null;
//		try {
//			fis=new FileInputStream("myfile.txt");
//		}
//		catch(FileNotFoundException fnfe)
//		{
//			System.out.println("The specified file is not"+"present at given path");
//		}
//		int k;
//		try {
//			while((k=fis.read())!=-1)
//			{
//				System.out.print((char)k);
//			}
//			fis.close();
//		}
//		catch(IOException ioe)
//		{
//			System.out.println("I/0 error occured"+ioe);
//		}
//	}
	
	//unchecked exception
//	public static void main(String[] args) {
//		int num1=0,num2=0;
//		int res=num1/num2;
//		System.out.println(res);
//		int arr[]= {1,2,3,4,5};
//		System.out.println(arr[7]);
//		
//	}
//	
	
//	 public static void main(String args[]) {
//			try{
//			   int arr[] ={1,2,3,4,5};
//			   System.out.println(arr[7]);
//			}
//		        catch(ArrayIndexOutOfBoundsException e){
//			   System.out.println("The specified index does not exist " +
//				"in array. Please correct the error.");
//			}
//		   }
	
	
	
}
