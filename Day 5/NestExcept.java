package pack1;
import java.lang.*;
public class NestExcept {
public static void main(String[] args) {
	try {
		try {
			try {
				int arr[]= {1,2,3,4};
				System.out.println(arr[9]);
			}catch(ArithmeticException e){
				System.out.println("AE");
			}catch(ArrayIndexOutOfBoundsException e4){
				System.out.print("ArrayIndexOutOfBoundsException");
			 	System.out.println(" 111111111");
			}
			try {
				int b=21/0;
				System.out.println("Try block inside 2");
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("21/0 catch worked");
			}
		}catch(ArithmeticException e) {
			System.out.println("AE1");
		}
	}catch(ArithmeticException e) {
		System.out.println("AE2");
	}catch(ArrayIndexOutOfBoundsException e4){
		System.out.print("ArrayIndexOutOfBoundsException");
	 	System.out.println(" handled in main try-block");
	}
	catch(Exception e5){
		System.out.print("Exception");
	 	System.out.println(" handled in main try-block");
	 }
}
}
