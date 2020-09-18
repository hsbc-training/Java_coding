package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArraySort {
	public static void main(String[] args) {

		ArrayList<Student> arrayList = new ArrayList<>();
		arrayList.add(new Student("Rohan", 123, 24));
		arrayList.add(new Student("Rohit", 234, 32));
		arrayList.add(new Student("Rahul", 345, 20));

		Collections.sort(arrayList);

		for(Student str: arrayList){
			System.out.println(str);
		}
	}
}

