package com.hsbc.ArrayList;

import java.util.*;

public class ALadd {

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

		// Adding "Steve" at the fourth position
		alist.add(3, "Vishnu");

		// displaying elements
		System.out.println(alist);

	}
}