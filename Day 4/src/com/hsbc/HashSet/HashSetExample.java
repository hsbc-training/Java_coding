package com.hsbc.HashSet;

import java.util.HashSet;

public class HashSetExample {
	public static void main(String args[]) {
		// HashSet declaration
		HashSet<String> hset = new HashSet<String>();

		// Adding elements to the HashSet
		hset.add("Amisha");
		hset.add("Aditi");
		hset.add("Mauli");
		hset.add("Aparna");
		hset.add("Pooja");
		hset.add("Bharat");
		hset.add("Smriti");
		hset.add("Parth");
		hset.add("Ritakshi");
		// Addition of duplicate elements
		hset.add("Amisha");
		hset.add("Smriti");
		// Addition of null values
		hset.add(null);
		hset.add(null);

		// Displaying HashSet elements
		System.out.println("Before: HashSet contains: "+ hset);

		/*
		 * public void clear(): It removes all the elements from HashSet. The set
		 * becomes empty after this method gets called.
		 */
		hset.clear();

		// Display HashSet content again
		System.out.println("After: HashSet contains: " + hset);
	}
}