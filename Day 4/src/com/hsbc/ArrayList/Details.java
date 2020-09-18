package com.hsbc.ArrayList;

import java.util.*;

public class Details {

	public static void main(String args[]) {
		ArrayList<Studnt> arraylist = new ArrayList<Studnt>();
		   arraylist.add(new Studnt(22, "Durva", 21));
		   arraylist.add(new Studnt(52, "Saransh", 23));
		   arraylist.add(new Studnt(31, "Maithely", 20));
		   arraylist.add(new Studnt(11, "Amisha", 24));
		   arraylist.add(new Studnt(55, "Shubhi", 22));

		/* Sorting based on Studnt Name */
		System.out.println("Studnt Name Sorting:");
		Collections.sort(arraylist, Studnt.StuNameComparator);

		for (Studnt str : arraylist) {
			System.out.println(str);
		}

		/* Sorting on Rollno property */
		System.out.println("RollNum Sorting:");
		Collections.sort(arraylist, Studnt.StuRollno);
		for (Studnt str : arraylist) {
			System.out.println(str);
		}
	}
}