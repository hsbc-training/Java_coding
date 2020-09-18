package java_b;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListSorting  {

	public static void main(String args[]){
	   ArrayList<Student> arraylist = new ArrayList<Student>();
	   arraylist.add(new Student(223, "Chaitanya", 26));
	   arraylist.add(new Student(245, "Rahul", 24));
	   arraylist.add(new Student(209, "Ajeet", 32));

	   Collections.sort(arraylist, Student.StuNameComparator);

	   for(Student str: arraylist){
			System.out.println(str);
	   }
	   
	   System.out.println();
	   Collections.sort(arraylist, Student.StuRollno);

	   for(Student str: arraylist){
			System.out.println(str);
	   }
	   
	   System.out.println();
	   //Collections.sort(arraylist);
	}
}