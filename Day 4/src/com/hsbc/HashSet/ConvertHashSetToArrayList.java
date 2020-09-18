package com.hsbc.HashSet;

import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;

class ConvertHashSetToArrayList {
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

		// Creating a List of HashSet elements
		List<String> list = new ArrayList<String>(hset);

		// Displaying ArrayList elements
		System.out.println("ArrayList contains: " + list);
	}
}