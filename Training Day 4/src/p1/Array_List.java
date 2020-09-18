package p1;

import java.util.ArrayList;
import java.util.Collections;

public class Array_List {

	public static void main(String[] args) {
		ArrayList<Student> slist = new ArrayList<Student>();
		/*
		 * slist.add("Pushkar"); slist.add("Narendra"); System.out.println(slist);
		 * slist.add(1, "Amit"); //pushing the element at particular index slist.add(2,
		 * "Rahul"); System.out.println("list after index addition :" + slist);
		 * slist.set(0, "rajnath"); //changing an element at particular index
		 * System.out.println(slist); slist.remove(2); System.out.println(slist);
		 * printList(slist);
		 * 
		 * Collections.sort(slist); // sorting the list System.out.println(slist);
		 */

		/*
		 * for(int i =0; i<10; i++) { slist.add("a"+ i); }
		 * 
		 * //sorting elements in the descending order Collections.sort(slist,
		 * Collections.reverseOrder()); printList(slist);
		 */
		
		slist.add(new Student("Pushkar", 21, 22));
		slist.add(new Student("Yash", 22, 21));
		
		for(Student stud: slist)
		{
			System.out.println(stud);
		}
		
		
		
		

	}

	/*
	 * private static void printList(ArrayList<String> slist) { for (String str :
	 * slist) { System.out.println(str); }
	 * 
	 * }
	 */

}
