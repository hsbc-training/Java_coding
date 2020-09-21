package pack1;

public class Uncheck1 {
public static void main(String[] args) {
	try {
		int[] arr= {5,41,33,4,5};
		System.out.println(arr[6]);
	}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("The input index does not matches");
	}
}
}
