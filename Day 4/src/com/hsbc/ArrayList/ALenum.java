package com.hsbc.ArrayList;

import java.util.*;

public class ALenum {

	public static void main(String[] args) {
		// create an ArrayList object
		ArrayList<String> alist = new ArrayList<String>();

		// Add elements to ArrayList
		alist.add("Amisha");
		alist.add("Aditi");
		alist.add("Mauli");
		alist.add("Aparna");
		alist.add("Pooja");
		alist.add("Bharat");
		alist.add("Smriti");
		alist.add("Parth");
		alist.add("Ritakshi");

		// Get the Enumeration object
		Enumeration<String> e = Collections.enumeration(alist);

		// Enumerate through the ArrayList elements
		while (e.hasMoreElements())
			System.out.println(e.nextElement());
	}
}