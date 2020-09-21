package com.hsbc.ArrayList;

import java.util.*;
public class ArrayListSorting  {

	public static void main(String args[]){
	   ArrayList<Student> arraylist = new ArrayList<Student>();
	   arraylist.add(new Student(22, "Durva", 21));
	   arraylist.add(new Student(52, "Saransh", 23));
	   arraylist.add(new Student(31, "Maithely", 20));
	   arraylist.add(new Student(11, "Amisha", 24));
	   arraylist.add(new Student(55, "Shubhi", 22));

	   Collections.sort(arraylist);

	   for(Student str: arraylist){
			System.out.println(str);
	   }
	}
}