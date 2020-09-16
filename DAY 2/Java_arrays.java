package arrays;

public class Java_arrays {
	
	public static void printArray(int[] array) {
		   for (int m = 0; m < array.length; m++) 
		   {
		      System.out.print(array[m] + " ");
		   }
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Array elements are:");
		printArray(new int[] {8,20,7,3});
		System.out.println("\n");
		int[] List = {1, 9, 4, 3};

	      // Print all the array elements
		System.out.println("List elements are:");
	      for (int i = 0; i < List.length; i++) 
	      {
	         System.out.print(List[i] + " ");
	      }
	     System.out.println("\n");
	      // Summing all elements
	      int total = 0;
	      for (int j = 0; j < List.length; j++) 
	      {
	         total += List[j];
	      }
	      System.out.println("Total is " + total);
	      
	      // Finding the largest element
	      int max = List[0];
	      for (int k = 1; k < List.length; k++) 
	      {
	         if (List[k] > max) 
	        	 max = List[k];
	      }
	      System.out.println("Max is " + max); 
	}

}
