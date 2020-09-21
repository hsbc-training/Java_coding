package com.hsbc.HashSet;

import java.util.HashSet;
import java.util.TreeSet;
import java.util.Set;

class ConvertHashSettoTreeSet {
	public static void main(String[] args) {
		// Create a HashSet
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

		// Displaying HashSet elements
		System.out.println("HashSet contains: " + hset);

		// Creating a TreeSet of HashSet elements
		Set<String> tset = new TreeSet<String>(hset);

		// Displaying TreeSet elements
		System.out.println("TreeSet contains: ");
		for (String temp : tset) {
			System.out.println(temp);
		}
	}
}