import java.util.*;
public class HashSetExample {
public static void main(String[] args) {
	HashSet<String> first =new HashSet<String>();
	first.add("Zebra");
	first.add("Monkey");
	first.add("Orangutan");
	first.add("Elephant");
	first.add("Panther");
	//addition of duplicates
	first.add("Zebra");
	//addition of null elements 
	first.add("Null");
	first.add("Null");
	System.out.println(first);
	int a=first.size();
	System.out.println(a);
	Iterator<String>it=first.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	
	//To clone a Hashset to a new one 
	//We dont need to create an object for these
	HashSet h2=new HashSet();
	h2=(HashSet)first.clone();
	System.out.println(h2);
	
	
	//converting it to an array
	/*
	 * String[] array=new String[first.size()]; first.toArray(array); for(String
	 * Acheck:array) { System.out.println(Acheck); }
	 */
	
	
	//converting Hashset to a treeset
	/* Set<String>tset=new TreeSet<String>(first); */
	//to check the elements of the tree set
	//tree set element are already sorted
	/*
	 * for(String tse:tset) { System.out.println(tse); }
	 */	
	
	
	//Converting HashSet to a List/ArrayList
	List<String>Lcheck=new ArrayList<String>(first);
	System.out.println(Lcheck);
}
}
