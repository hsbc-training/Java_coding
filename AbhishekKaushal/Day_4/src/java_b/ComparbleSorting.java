package java_b;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparbleSorting {
	public static void main(String[] args) {
		ArrayList<Student1> arraylist = new ArrayList<Student1>();
		arraylist.add(new Student1(223, "Chaitanya", 26));
		arraylist.add(new Student1(245, "Rahul", 24));
		arraylist.add(new Student1(209, "Ajeet", 32));
		
		Collections.sort(arraylist);
		System.out.println(arraylist);
	}
}
