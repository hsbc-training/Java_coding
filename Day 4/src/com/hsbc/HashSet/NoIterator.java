package com.hsbc.HashSet;

import java.util.HashSet;
import java.util.Set;

class NoIterator {
	public static void main(String[] args) {
		// Create a HashSet
		Set<String> hset = new HashSet<String>();

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

		for (String temp : hset) {
			System.out.println(temp);
		}
	}
}