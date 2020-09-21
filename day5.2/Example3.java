package day5_ExceptionHandling;

public class Example3 {
	public static void main(String args[]) {
	try {
		int arr[]= {1,2,3,4,5};
		System.out.println(arr[7]);
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("Array Index Out of Bound");
	}
	
}
}

