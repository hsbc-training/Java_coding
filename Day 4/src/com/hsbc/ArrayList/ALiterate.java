package com.hsbc.ArrayList;

import java.util.*;

public class ALiterate {

	public static void main(String args[]) {
		int i = 1;
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

		for (String str : alist) {
			System.out.println(i+" => "+str);
			i++;
		}
	}
}