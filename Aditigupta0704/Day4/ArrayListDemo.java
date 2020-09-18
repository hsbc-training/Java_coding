package Day4;

import java.util.*;

public class ArrayListDemo {

	public static void main(String args[]) {

		ArrayList<String> obj = new ArrayList<String>();

		obj.add("Ajeet");
		obj.add("Chetan");
		obj.add("Steve");
		obj.add("Anuj");

		System.out.println("original");
		for (String str : obj)
			System.out.println(str);

		obj.add(0, "Ram");
		obj.add(1, "Justin");
		System.out.println("\n");
		System.out.println("After ADD");
		for (String str : obj)
			System.out.println(str);

		obj.remove("Chetan");
		System.out.println("\n");
		System.out.println("After REMOVE");
		for (String str : obj)
			System.out.println(str);

		obj.remove(2);
		System.out.println("\n");
		System.out.println("FINAL");
		for (String str : obj)
			System.out.println(str);

		System.out.println("\n");
		Collections.sort(obj);
		for (String str : obj)
			System.out.println(str);
		System.out.println(obj.contains("Steve"));

		// USING INITIALISATIONS
		ArrayList<String> obj2 = new ArrayList<>(

				Arrays.asList("Aditi", "Ram", "Steeve"));

		System.out.println("\n");
		for (String str : obj2)
			System.out.println(str);
	}

}
