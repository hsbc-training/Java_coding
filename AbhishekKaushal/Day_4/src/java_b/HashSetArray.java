package java_b;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class HashSetArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs = new HashSet<>();
		hs.add("E1");
		hs.add("E2");
		hs.add("E3");
		hs.add("E4");
		hs.add("E5");
		
		String[] arr = new String[hs.size()];
		hs.toArray(arr);
		System.out.println("Hashset"+hs);
		System.out.println("Array:");
		for(String element : arr)
			System.out.println(element);
		
		Set<String> treeset = new TreeSet<>(hs);
		System.out.println("Treeset is: "+treeset);
		
		List<String> list = new ArrayList<>(hs);
		System.out.println("List is: "+list);
		
	}

}
