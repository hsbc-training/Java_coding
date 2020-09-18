package demo.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Main {
	public static void main(String[] args) {

		
		  
		  System.out.println("\n\n========================\nHASH SET OPERATIONS\n========================\n"); ArrayList<String> movies = new
		  ArrayList<>(); movies.add("Harry Potter"); movies.add("Avengers");
		  movies.add("Iron Man"); movies.add("Avengers");
		  
		  HashSetDemo hashset = new HashSetDemo(); hashset.addMovies(movies);
		  hashset.display(); hashset.clear(); hashset.display();
		  hashset.addMovies(movies); hashset.display();
		  
		  
		  String movies_array[] = null; movies_array =
		  hashset.hashToArray(movies_array);
		  
		  for(String name : movies_array) System.out.println(name);
		  
		  
		  hashset.check("Avengers"); hashset.check("Expendables");
		  
		  hashset.getSize();
		  
		  HashSet<String> demo = hashset.createCopy();
		  System.out.println("Printing the created clone :"+demo);
		  
		  Iterator it = demo.iterator(); while(it.hasNext()) {
		  System.out.println(it.next()); }
		  
		  hashset.sort();
		  
		  
		  // ArrayListDemo
		  
		  System.out.println("\n\n==========================\nARRAY LIST OPEATION\n======================== ");
		  
		  ListDemo arrayList = new ListDemo();
		  
		  arrayList.addRollnums(6); arrayList.displayList(); arrayList.updateValue(1,
		  999); arrayList.displayList();
		 
		  System.out.println("Removing Item 3"); arrayList.removeItem(3);
		  arrayList.displayList();
		  
		  System.out.println("Size of List is : " + arrayList.getSize());
		  System.out.println("Sorted List :"); arrayList.sortList();
		  arrayList.displayList();
		  
		  System.out.println("Display using Iterator and ListIterator");
		  arrayList.displayUsingListIterator(); arrayList.conversionToArray(); //
		  
		  
		  System.out.println("Contains"); arrayList.check(50); arrayList.check(1);
		 
		System.out.println("\n========================\nHASH MAP EXAMPLE\n========================\n");

		ArrayList<Score> students = new ArrayList<>();
		students.add(new Score("Dean", 100));
		students.add(new Score("Aparna", 80));
		students.add(new Score("Aadarsh", 90));
		students.add(new Score("The Hound", 100));

		HashMapDemo studts = new HashMapDemo();

		studts.add(students);
		studts.display();

	}

}
