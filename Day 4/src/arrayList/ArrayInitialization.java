package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Different types of ArrayList Initialization
 * @author suryavanshi
 *
 */
public class ArrayInitialization {
	public static void main(String[] args) {

		ArrayList<String> obj = new ArrayList<String>(							//#1 Arrays.asList
				Arrays.asList("Rohan", "Rohit", "Rahul"));
		System.out.println("Elements are:" + obj);

		ArrayList<String> cities = new ArrayList<>(){{							//#2 Anonymous Inner Class
			add("Delhi");
			add("Agra");
			add("Chennai");
		}};
		System.out.println("Content of Array list cities:" + cities);

		ArrayList<String> books = new ArrayList<String>();						//#3 ArrayList add()
		books.add("Java Book1");
		books.add("Java Book2");
		books.add("Java Book3");
		System.out.println("Books stored in ArrayList are: " + books);

		ArrayList<Integer> intlist = new ArrayList<Integer>(Collections.nCopies(10, 5));	//#4 Collections nCopies
		System.out.println("ArrayList items: " + intlist);
	}
}
