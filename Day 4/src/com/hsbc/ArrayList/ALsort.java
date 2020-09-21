package com.hsbc.ArrayList;

import java.util.*;

public class ALsort {

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

		Collections.sort(alist);
		System.out.println("Ascending order =>");
		
		for (String str : alist) {
			System.out.println(str);
		}
		
		Collections.sort(alist, Collections.reverseOrder());
		System.out.println("Descending order =>");
		
		for (String str : alist) {
			System.out.println(str);
		}
	}
}
