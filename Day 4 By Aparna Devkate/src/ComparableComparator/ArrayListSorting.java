package ComparableComparator;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSorting {
	
    public static void main(String args[]){
	   ArrayList<Student> arraylist = new ArrayList<Student>();
	   arraylist.add(new Student(3, "Dean Ambrose", 26));
	   arraylist.add(new Student(2, "Seth Rollings", 24));
	   arraylist.add(new Student(1, "Roman Reigns", 32));
	   arraylist.add(new Student(4, "Paige", 22));
	   // Using Comparable
	   System.out.println("\nAge Sort [Descending] Using Comparable");
	   Collections.sort(arraylist);
	   
	   for(Student s : arraylist)
		   System.out.println(s);
	   
	   System.out.println("\nSort using Comparator");
	   System.out.println("\nRollNo Sort");
	   Collections.sort(arraylist,Student.rollnoComp);
	   
	   for(Student s : arraylist)
		   System.out.println(s);
	   
	   
	   System.out.println("\nName Sort");
	   Collections.sort(arraylist,Student.nameComp);

	   for(Student s : arraylist)
		   System.out.println(s);
	   
	   
	   System.out.println("\nAge Sort");
	   Collections.sort(arraylist,Student.ageComp);

	   
	   // Want more ways to sort an object use comparator
	  
	   for(Student str: arraylist){
			System.out.println(str);
	   }
    }
}
