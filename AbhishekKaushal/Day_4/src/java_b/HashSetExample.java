package java_b;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hset = new HashSet<>();
		hset.add("apple");
		hset.add("grapes");
		hset.add("mangoes");
		hset.add("bananas");
		hset.add("orange");
		
		hset.add("apple");
		hset.add("mangoes");
		
		hset.add(null);
		hset.add(null);
		
		System.out.println(hset);
		//System.out.println(hset.clone());
		
		HashSet<String> hs= (HashSet<String>) hset.clone();
		System.out.println("After clear: ");
		hset.clear();
		System.out.println(hset);
		System.out.println("With Iterator:");
		for(Iterator iterator = hs.iterator();iterator.hasNext();)
		{
			System.out.println(iterator.next());
		}
		System.out.println("With for loop:");
		for(String fruit: hs)
		{
			System.out.println(fruit);
		}
	}

}
