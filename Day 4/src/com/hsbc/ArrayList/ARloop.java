package com.hsbc.ArrayList;

import java.util.*;

public class ARloop {
	public static void main(String[] args) {

		ArrayList<String> arrlist = new ArrayList<String>();

		arrlist.add("Amisha");
		arrlist.add("Aditi");
		arrlist.add("Mauli");
		arrlist.add("Aparna");
		arrlist.add("Pooja");
		arrlist.add("Bharat");
		arrlist.add("Smriti");
		arrlist.add("Parth");
		arrlist.add("Ritakshi");

		/* For Loop for iterating ArrayList */
		System.out.println("For Loop =>");
		for (int counter = 0; counter < arrlist.size(); counter++) {
			System.out.println(arrlist.get(counter));
		}

		/* Advanced For Loop */
		System.out.println("Advanced For Loop =>");
		for (String str : arrlist) {
			System.out.println(str);
		}

		/* While Loop for iterating ArrayList */
		System.out.println("While Loop=>");
		int count = 0;
		while (arrlist.size() > count) {
			System.out.println(arrlist.get(count));
			count++;
		}

		/* Looping Array List using Iterator */
		System.out.println("Iterator =>");
		Iterator<String> str = arrlist.iterator();
		while (str.hasNext()) {
			System.out.println(str.next());
		}
	}
}