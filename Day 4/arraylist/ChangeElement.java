package arraylist;

import java.util.ArrayList;

public class ChangeElement {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("a");
		names.add("b");
		names.add("c");
		names.add("d");
		names.set(0,"z");
		System.out.println(names);
	}
}
