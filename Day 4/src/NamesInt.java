import java.util.ArrayList;
import java.util.List;


public class NamesInt {
	
public static void main(String[] args) {
	ArrayList<String> names = new ArrayList<String>();
	System.out.println("String additions");
	names.add("Steve");
	names.add("James");
	names.add("Jason");
	names.add("Maria");
	names.add("John");
	System.out.println(names);
	
	ArrayList<Integer> numbers = new ArrayList<Integer>();
	System.out.println("Integer additions");
	numbers.add(2);
	numbers.add(21);
	numbers.add(32);
	numbers.add(12);
	numbers.add(45);
	System.out.println(numbers);
	
	ArrayList<String> names2 = new ArrayList<String>();
	System.out.println("String additions");
	names2.add("Rahul");
	names2.add("Mira");
	names2.add("Jiya");
	names2.add("Salim");
	names2.add("Johnny");
	System.out.println(names2);
	
	//Add all list names
	names.addAll(names2);
	System.out.println("Updated ArrayList Elements: "+names);
	
	List<Integer> x = new ArrayList<Integer>();
	x.add(1);
	x.add(7);
	x.add(3);
	x.add(22);
	x.add(10);
	
	numbers.addAll(x);
	System.out.println("Updated ArrayList Elements: "+numbers);
	
	numbers.addAll(2,x);
	System.out.print("X added at 3rd position of numbers list" +numbers );
	
	//Remove elements
	numbers.remove(0);
	numbers.remove(1);
	numbers.remove(2);
	numbers.remove(3);
	System.out.println("Updated ArrayList Elements after Deletion: "+numbers);

	names.remove("John");
	System.out.println("Updated ArrayList Elements after Deletion: "+names);







}

}
