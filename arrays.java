package interfaces;

public class arrays {
	public static void main(String[] args) {
		int[] myArray = {1,2,3,4,5,6};
		for (int i : myArray) {
			System.out.println(myArray[i] + " ");
		}
		//summing all array elements
		double total = 0;
		for(int i : myArray) {
			total += myArray[i];
		}
		System.out.println("Total is :"+ total);
		
		//Largest of all
		double maxElement = myArray[0];
		for(int i : myArray) {
			if(myArray[i] > maxElement) maxElement = myArray[i];
		}
		System.out.println("Maximum of all is:"+ maxElement);
	}
}
