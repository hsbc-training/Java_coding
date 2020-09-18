package arraylist;

import java.util.ArrayList;

public class AddAll {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		a.add("a");
		a.add("b");
		a.add("c");
		a.add("d");
		System.out.println("First Print" + a);
		
		ArrayList<String> b = new ArrayList<String>();
		b.add("w");
		b.add("x");
		b.add("y");
		b.add("z");
		System.out.println("Second Print" + b);

		a.addAll(b);
		System.out.println("After joining" + a);
		
	}

}
