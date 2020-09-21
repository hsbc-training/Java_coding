package com.hsbc.HashSet;

import java.util.HashSet;

class ConvertHashSettoArray {
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
		// Addition of duplicate elements
		hset.add("Amisha");
		hset.add("Smriti");
		// Addition of null values
		hset.add(null);
		hset.add(null);

		// Displaying HashSet elements
		System.out.println("HashSet contains: " + hset);

		// Creating an Array
		String[] array = new String[hset.size()];
		hset.toArray(array);

		// Displaying Array elements
		System.out.println("Array elements: ");
		for (String temp : array) {
			System.out.println(temp);
		}
	}
}