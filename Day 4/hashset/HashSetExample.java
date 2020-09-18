package hashset;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
	public static void main(String[] args) {
		HashSet<String> h = new HashSet<String>();
		h.add("a");
		h.add("b");
		h.add("c");
		h.add("d");
		h.add(null);
		System.out.println(h);

		// Iterate
		Iterator<String> it = h.iterator();
		System.out.println("Iterating over the hash set");
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		
		System.out.println(h);

		// Iterate without Iterator
		System.out.println("Iterating without Iterator");
		for (String s : h) {
			System.out.println(s);
		}
		
		// Convert HashSet to Array
		String[] arr = new String[h.size()];
		h.toArray(arr);
		System.out.println("Printing Array");
		for(String k : arr) {
			System.out.println(k);
		}
		
		// Delete all elements
		h.clear();
	}

}
