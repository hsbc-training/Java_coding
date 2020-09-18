package comparableandcomparator;

import java.util.*;
/*
 * @Author Pratham Sharma
 * 
 * Package created to demo comparable and comparator
 * 
 * Class ArrayListSorting for implementing the concept main function
 */
public class ArrayListSorting {
	 public static void main(String args[]){
		   ArrayList<Student> arraylist = new ArrayList<Student>();
		   
		   arraylist.add(new Student("Chaitanya", 223, 26));
		   arraylist.add(new Student("Rahul", 245, 24));
		   arraylist.add(new Student("Ajeet", 209, 32));

		   Collections.sort(arraylist);

		   for(Student str: arraylist){
				System.out.println(str);
		   }
	     }
	
}