package day4;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
	public static void main(String[] args) {
		HashSet <String> hset = new HashSet<String>();
		
		hset.add("Apple");
		hset.add("Mango");
		hset.add("Grapes");
		hset.add("Orange");
		
		hset.add("Apple");
		
		hset.add(null);
		hset.add(null);
		
		Iterator<String> iter = hset.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println();
		System.out.println(hset);
		hset.clear();
		System.out.println(hset);
	}
}
