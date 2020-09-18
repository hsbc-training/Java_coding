package arrayList;

import java.util.ArrayList;
import java.util.Iterator;
/**
 * Different types of ArrayList Printing
 * @author suryavanshi
 *
 */

public class ArrayPrinting {
	public static void main(String[] args) {
		ArrayList<Integer> arrlist = new ArrayList<Integer>();
		arrlist.add(10);
		arrlist.add(20);
		arrlist.add(30);
		arrlist.add(40);

		System.out.println("For Loop");
		for (int i = 0; i < arrlist.size(); i++) { 		      
			System.out.print(arrlist.get(i) + " "); 		
		}   		

		System.out.println("\nForEach Loop"); 		
		for (Integer num : arrlist) { 		      
			System.out.print(num + " "); 		
		}

		System.out.println("\nWhile Loop"); 		
		int count = 0; 		
		while (arrlist.size() > count) {
			System.out.print(arrlist.get(count) + " ");
			count++;
		}

		System.out.println("\nIterator");
		Iterator iter = arrlist.iterator();
		while (iter.hasNext()) {
			System.out.print(iter.next() + " ");
		}
	}
}

