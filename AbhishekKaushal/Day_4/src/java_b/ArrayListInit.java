package java_b;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;

public class ArrayListInit {

	public static void main(String[] args) {
		ArrayList<Integer> intlist = new ArrayList<Integer>(Collections.nCopies(10, 5));

		ArrayList<String> cities = new ArrayList<String>() {
			{
				add("Delhi");
				add("Agra");
				add("Chennai");
			}
		};

		ArrayList<String> obj1 = new ArrayList<String>(Arrays.asList("Pratap", "Peter", "Harsh"));
		ArrayList<String> books = new ArrayList<String>();
		books.add("Java Book1");
		books.add("Java Book2");
		
		System.out.println(intlist.size());

		for (int counter = 0; counter < intlist.size(); counter++) {
			System.out.println(intlist.get(counter));
		}

		for (String city : cities) {
			System.out.println(city);
		}

		int count = 0;
		while (obj1.size() > count) {
			System.out.println(obj1.get(count));
			count++;
		}

		Iterator iter = books.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		Enumeration<String> e = Collections.enumeration(books);
	      while(e.hasMoreElements())
	      System.out.println(e.nextElement());
	      
	      System.out.println("After Sorting");
	      Collections.sort(cities);
	      System.out.println(cities);
	      Collections.sort(cities,Collections.reverseOrder());
	      System.out.println(cities);
	      
	   }

	}


