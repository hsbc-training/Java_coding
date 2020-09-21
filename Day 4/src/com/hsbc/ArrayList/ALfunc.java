package com.hsbc.ArrayList;

import java.util.*;

public class ALfunc {
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
		
		String s = alist.get(0);
		System.out.println(") index has value => "+s);
		
		boolean b1 = alist.contains("Aditi");
		boolean b2 = alist.contains("Duxva");
		if(b1==true)
			System.out.println("The list contains Aditi");
		else
			System.out.println("The list does not contain Aditi");
		if(b2==true)
			System.out.println("The list contains Duxva");
		else
			System.out.println("The list does not contain Duxva");
		
			
		for (String str : alist) {
			System.out.println(str);
		}
	}
}
