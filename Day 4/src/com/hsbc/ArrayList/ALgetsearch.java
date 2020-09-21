package com.hsbc.ArrayList;

import java.util.*;

public class ALgetsearch {
	public static void main(String args[]) {

		ArrayList<String> alist = new ArrayList<String>();
		alist.add("Amisha");
		alist.add("Aditi");
		alist.add("Mauli");
		alist.add("Amisha");
		alist.add("Aparna");
		alist.add("Pooja");
		alist.add("Bharat");
		alist.add("Amisha");
		alist.add("Smriti");
		alist.add("Parth");
		alist.add("Amisha");
		alist.add("Ritakshi");

		System.out.println("First occurrence of Amisha is =>  "+alist.indexOf("Amisha"));
		System.out.println("Last occurrence of Amisha is =>  "+alist.lastIndexOf("Amisha"));
		
		System.out.println("Original ArrayList Content => "+alist);

	     //Sublist from ArrayList
	     ArrayList<String> alist2 = new ArrayList<String>(alist.subList(1, 4));
	     System.out.println("SubList fetched from ArrayList => "+alist2);
	}
}
