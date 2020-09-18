package Day4;

import java.util.*;

public class ArrayListSize {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		System.out.println(al.size());
		System.out.println("\n");

		al.add(1);
		al.add(95);
		al.add(77);
		System.out.println(al.size());
		System.out.println("\n");

		System.out.println("asc sort");
		Collections.sort(al);
		for (Integer i : al)
			System.out.println(i);

		System.out.println("\n");
		System.out.println("after desc sort");
		Collections.sort(al, Collections.reverseOrder());
		for (Integer i : al)
			System.out.println(i);

		System.out.println("\n");
		System.out.println(al);

	}

}
