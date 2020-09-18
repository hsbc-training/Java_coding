package demo.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class HashSetDemo {
	
	private HashSet<String> movies = new HashSet<>();
	
	
	public void addMovies(ArrayList<String> names) {
		
		Iterator i = names.iterator();
		while(i.hasNext())
		{
			movies.add((String)i.next());
		}
		
		System.out.println("Movies Added");
	//	System.out.println(movies);
	}
	
	
	public void display() {
		System.out.println(movies);
	}
	
	public void clear() {
		System.out.println("Set Cleared");
		movies.clear();
	}
	
	public HashSet<String> createCopy(){
		System.out.println("\nCreating the Clone......");
		System.out.println("Clone created");
		
		return (HashSet<String>) movies.clone();
		}
	public String[] hashToArray(String []movie_array) {
		System.out.println("\n	Converted given hset to array that is :");
		movie_array = new String[movies.size()];
		movies.toArray(movie_array);
		return movie_array;
		
	}
	
	public void sort() {
	System.out.println("\nSorting by converting into TreeSet");	
	
	Set<String> sortedmovies = new TreeSet<>(movies);
	System.out.println(sortedmovies);
	}
	
	public void getSize() {
		System.out.println("\nSize of HashSet is"+movies.size());
	}
	
	public void check(String name) {
		System.out.println("\nSearching for "+name+" in hashset..........");
		
		if(movies.isEmpty()) {
			System.out.println("Hashset is empty");
		}else {
			System.out.println("Hashset is not empty");
			if(movies.contains(name)) {
			System.out.println("It is Present");
		}else
			System.out.println("Not Present");
			
		}
	}
	
}
