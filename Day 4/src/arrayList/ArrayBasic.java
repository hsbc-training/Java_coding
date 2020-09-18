package arrayList;
import java.util.*;  
/**
 * ArrayList Basics
 * @author suryavanshi
 *
 */

public class ArrayBasic{  
	public static void main(String args[]){  
		ArrayList<String> alist=new ArrayList<String>();  		//Creating ArrayList
		alist.add("ABC");											//Adding Elements
		alist.add("BCD");
		alist.add("DEF");
		alist.add("EFG");
		alist.add("HIJ");
		alist.add("IJK");

		System.out.println("*****ArrayList Basics*****");
		System.out.println(alist);									//Printing ArrayList

		alist.add(4, "XYZ");										//Add Element at index

		System.out.println("After adding element 'XYZ' at index 4");
		System.out.println(alist);

		System.out.println("Replace element 'PQR' at index 1");
		alist.set(1, "PQR"); 										//Set / Replace Element at index

		System.out.println(alist);

		System.out.println("Remove Element at index 2");
		alist.remove(2);											//Remove Element at index

		System.out.println(alist);

		System.out.println("Remove Element 'HIJ'");
		alist.remove("HIJ");										//Removing by Name of element

		System.out.println(alist);

		for (Iterator iterator = alist.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();				//Printing by Iterator				
			System.out.print(string + " ");
		}

		for (String string : alist) {								//Printing by forEach	
			System.out.print("\n" + string + " ");
		}

		System.out.println("Size of ArrayList : " + alist.size());

		System.out.println("Before Sorting : ");
		for (String string : alist) {
			System.out.print(string + " ");
		}
		Collections.sort(alist);
		System.out.println("\nAfter Sorting : ");
		for (String string : alist) {
			System.out.print(string + " ");
		}
		
		Collections.sort(alist,Collections.reverseOrder());
		System.out.println("\nDescending Order Sorting : ");
		for (String string : alist) {
			System.out.print(string + " ");
		}
	}  
}