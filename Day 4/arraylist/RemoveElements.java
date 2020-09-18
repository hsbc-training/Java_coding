package arraylist;

import java.util.ArrayList;

public class RemoveElements {

	public static void main(String[] args) {
		ArrayList<String> alist = new ArrayList<String>();
		alist.add("a");
		alist.add("b");
		alist.add("c");
		alist.add("d");
		alist.add("e");
		alist.add("f");

		// displaying elements
		System.out.println(alist);

		// Remove
		alist.remove("a");
		alist.remove("f");

		// displaying elements
		System.out.println(alist);

		// Remove using Index
		alist.remove(2);

		// displaying elements
		System.out.println(alist);

	}

}
