
/* Change an element*/
//import java.util.*;
//public class ChangeElement {
//	
//	public static void main(String[] args) {
//		ArrayList<String> names=new ArrayList<String>();
//		names.add("Jim");
//		names.add("Jack");
//		names.add("Ajeet");
//		names.add("Chaitanya");
//		System.out.println(names);
//		
//		names.set(0,"Lucy");
//		System.out.println(names);
//		
//	}
//	
//}

/*Remove an element*/

//import java.util.*;
//
//public class ChangeElement{
//	public static void main(String[] args) {
//		ArrayList<String> alist=new ArrayList<String>();
//		alist.add("Steve");
//		alist.add("Tim");
//		alist.add("Lucy");
//		alist.add("Pat");
//		alist.add("Angela");
//		alist.add("Tom");
//		
//		System.out.println(alist);
//		
//		alist.remove(2);
//		
//		System.out.println(alist);
//		
//	}
//}


/*Iterating List*/
//import java.util.*;
//
//public class ChangeElement{
//	
//	public static void main(String[] args) {
//		ArrayList<String> alist=new ArrayList<String>();
//		alist.add("Gregor Clegane");
//		alist.add("Khal Drogo");
//		alist.add("Cersi Lannister");
//		alist.add("Sandor Clegane");
//		alist.add("Tryion Lannister");
//		
//		for(String str:alist)
//			System.out.println(str);
//		
//		
//	}
//}
/*Sort*/

import java.util.*;
public class ChangeElement
{
	public static void main(String[] args) {
//		ArrayList<String> fruits=new ArrayList<String>();
//		fruits.add("Orange");
//		fruits.add("Apple");
//		fruits.add("Banana");
//		fruits.add("Pineapple");
//		Collections.sort(fruits);
//		
//		for(String str:fruits)
//		{
//			System.out.println(str);
//		
//		}
		
		/*initialize*/
		//1
//		ArrayList<String> list=new ArrayList<String>(
//		Arrays.asList("abc","bcd","pqr"));
//		System.out.println("Elements are "+list);
		
		//2
//		   ArrayList<String> cities = new ArrayList<String>(){{
//			   add("Delhi");
//			   add("Agra");
//			   add("Chennai");
//			   }};
//		  System.out.println("Content of Array list cities:"+cities);
//		
		
		//3
//		 ArrayList<String> books = new ArrayList<String>();
//		   books.add("Java Book1");
//		   books.add("Java Book2");
//		   books.add("Java Book3");
//		  System.out.println("Books stored in array list are: "+books);
		
//		 ArrayList<Integer> intlist = new ArrayList<Integer>(Collections.nCopies(10, 5));
//		  System.out.println("ArrayList items: "+intlist);

		
		//Looping
		//1
		
//		 ArrayList<Integer> arrlist = new ArrayList<Integer>();
//		
//		  arrlist.add(14);
//	      arrlist.add(7);
//	      arrlist.add(39);
//	      arrlist.add(40);
//
//	      /* For Loop for iterating ArrayList */
//	      System.out.println("For Loop");
//	      for (int counter = 0; counter < arrlist.size(); counter++) { 		      
//	          System.out.println(arrlist.get(counter)); 		
//	      }   		
//
//	      /* Advanced For Loop*/ 		
//	      System.out.println("Advanced For Loop"); 		
//	      for (Integer num : arrlist) { 		      
//	           System.out.println(num); 		
//	      }
//
//	      /* While Loop for iterating ArrayList*/ 		
//	      System.out.println("While Loop"); 		
//	      int count = 0; 		
//	      while (arrlist.size() > count) {
//		 System.out.println(arrlist.get(count));
//	         count++;
//	      }
//
//	      /*Looping Array List using Iterator*/
//	      System.out.println("Iterator");
//	      Iterator iter = arrlist.iterator();
//	      while (iter.hasNext()) {
//	         System.out.println(iter.next());
//	      }
//	   }
		
		//sorting
		
//		 ArrayList<Integer> arraylist = new ArrayList<Integer>();
//		   arraylist.add(11);
//		   arraylist.add(2);
//		   arraylist.add(7);
//		   arraylist.add(3);
//		   /* ArrayList before the sorting*/
//		   System.out.println("Before Sorting:");
//		   for(int counter: arraylist){
//				System.out.println(counter);
//			}
//
//		   /* Sorting of arraylist using Collections.sort*/
//		   Collections.sort(arraylist);
//
//		   /* ArrayList after sorting*/
//		   System.out.println("After Sorting:");
//		   for(int counter: arraylist){
//				System.out.println(counter);
//			}

		
		//sorting descending
		
		 ArrayList<String> arraylist = new ArrayList<String>();
		   arraylist.add("ZA");
		   arraylist.add("ZZ");
		   arraylist.add("CC");
		   arraylist.add("FF");

		   /*Unsorted List: ArrayList content before sorting*/
		   System.out.println("Before Sorting:");
		   for(String str: arraylist){
				System.out.println(str);
			}

		   /* Sorting in decreasing order*/
		   Collections.sort(arraylist, Collections.reverseOrder());

		   /* Sorted List in reverse order*/
		   System.out.println("ArrayList in descending order:");
		   for(String str: arraylist){
				System.out.println(str);
			}
	
}
}
