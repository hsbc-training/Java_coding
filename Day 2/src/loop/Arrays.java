package loop;

public class Arrays {

	public static void main(String[] args) {

		double[] arr = {9.2,4.6,3.4,3.6,8.4};
		

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}

		double total = 0;
		for (int i = 0; i < arr.length; i++) {
			total += arr[i];
		}
		System.out.println("Total is " + total);

		double max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) max = arr[i];
		}
		System.out.println("Max is " + max);  
	}

}
