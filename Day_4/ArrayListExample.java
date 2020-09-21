
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();

		list.add("Hello");
		list.add("world");
		list.add("Programming");
	

		System.out.println(list);

		System.out.println("List after inserting more elements in Particular position : ");

		list.add(0, "C++");
		list.add(1, "Java");
		list.add(2, "Python");

		System.out.println(list);

		list.set(2, "Code");
		list.add(3, "eat");
		list.add(4, "sleep");

		System.out.println(list);

		list.remove(3);
		list.remove("code");

		System.out.println(list);

		System.out.println(list.size());
		Collections.sort(list);
		System.out.println(list);

		int position = list.indexOf("world");

		System.out.println("Index of world is " + position);

		boolean result = list.contains("Java");
		boolean result1 = list.contains("python");

		System.out.println(result);
		System.out.println(result1);

		Collections.swap(list, 2, 4);

		System.out.println("Earlier List is" + list);

		List<String> list1 = new ArrayList<>();

		list1.add("New ");
		list1.add("List ");

		list1.addAll(list);

		System.out.println("Appended List is " + list1);

		List sublist = list1.subList(3, 5);

		System.out.println(sublist);
		
		list1.add("New ");
		
		System.out.println(list1);
		
		int last = list1.lastIndexOf("New ");
		
		
		
		System.out.println("Last Occurence of New : " + last);

	}

}
