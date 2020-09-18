package com.hsbc.ArrayList;

import java.util.*;

public class ALchange {

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

		// changing 1st element
		alist.set(0, "Amisha Bhardwaj");

		// displaying elements
		System.out.println(alist);
	}
}