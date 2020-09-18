
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();

		list.add("Vishnu");
		list.add("Gopal");
		list.add("Thobbi");
	

		System.out.println(list);

		System.out.println("List after inserting more elements in oarticular position : ");

		list.add(0, "HSBC");
		list.add(1, "Bank");
		list.add(2, "employee");

		System.out.println(list);

		list.set(2, "Developer");
		list.add(3, "Dummy");
		list.add(4, "Dummy1");

		System.out.println(list);

		list.remove(3);
		list.remove("Dummy1");

		System.out.println(list);

		System.out.println(list.size());
		Collections.sort(list);
		System.out.println(list);

		int position = list.indexOf("Vishnu");

		System.out.println("Index of vishnu is " + position);

		boolean result = list.contains("Developer");
		boolean result1 = list.contains("developer");

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
