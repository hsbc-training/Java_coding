package second;

public class JavaArray {
	
	public static int[] reverse(int[] list) {
		int[] result = new int[list.length];
		
		for(int i = 0, j = result.length - 1; i < list.length; i++, j--) {
			result[j] = list[i];
		}
		return result;
	}

	public static void main(String[] args) {
		double[] myList = {1.9, 2.9, 3.4, 3.5};
		
		for (double element: myList) {
	         System.out.println(element);
	    }

		for (int i = 0; i < myList.length; i++) {
			System.out.println(myList[i] + " ");
	    }
		
		double total = 0;
	    	for (int i = 0; i < myList.length; i++) {
	    		total += myList[i];
	    	}
	    System.out.println("Total is " + total);
	    
	    double max = myList[0];
	    	for (int i = 1; i < myList.length; i++) {
	    		if (myList[i] > max) max = myList[i];
	    	}
	    System.out.println("Max is " + max);
	    
	    int[] toReverse = {1,2,3,4,5};
	    int[] result = reverse(toReverse);
	    System.out.println(result);
	    // System.out.println(reverse(toReverse).toString());
	    
	}

}
