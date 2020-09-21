package pack1;

public class Except {
public static void main(String[] args) {
	int num1,num2;
	try {
		/*
		 * num1=0; num2=61/num1;
		 * 
		 * System.out.println(num2);
		 */
		int[] arr=new int[6];
		for(int i=0;i<100;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("End of try block");
	}
	catch(ArithmeticException e) {
		System.out.println("You should not divide a number by 0");
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("Array index out of bounds");
	}
	catch(Exception e) {  //This must always be done at the last
		System.out.println("Exception occured");
	}
	System.out.println("Out of try catch block");
}
}
