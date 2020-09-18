package com.hsbc.ArrayList;

import java.util.*;

public class ALremove {

	public static void main(String args[]) {
		ArrayList<String> alist = new ArrayList<String>();
		alist.add("Amisha");
		alist.add("Aditi");
		alist.add("Mauli");
		alist.add("Aparna");
		alist.add("Pooja");
		alist.add("Bharat");
		alist.add("Smriti");
		alist.add("Parth");
		alist.add("Ritakshi");

		// displaying elements
		System.out.println(alist);

		// Removing
		alist.remove("Aparna");
		alist.remove("Pooja");

		// displaying elements
		System.out.println(alist);

		// Removing 3rd element
		alist.remove(6);

		// displaying elements
		System.out.println(alist);
	}
}