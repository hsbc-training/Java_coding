package HashMapPackage;

import java.util.*;
import java.util.Map.Entry;
/*
 * Package create to demo HashMap
 * 
 * Class created to implement HashMap
 */
public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<Integer, String> numberMap = new HashMap<Integer, String>();
		numberMap.put(1,"Mountain");
		numberMap.put(2, "Daniel Hardman");
		numberMap.put(4, "Dana Scott");
		numberMap.put(5, "Jiraya");
		
		//Iterating the map using Iterator
		Set set = numberMap.entrySet();
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			Map.Entry mentry = (Map.Entry)itr.next();
			System.out.println("Key is "+mentry.getKey()+" Value is "+mentry.getValue()+"\n");
		}
		
		String var=numberMap.get(2);
		System.out.println("Value at index 2 is "+var+"\n");
		
		numberMap.remove(4);
		System.out.println("Map Status after removal");
		Set set2 = numberMap.entrySet();
		Iterator iterator2 = set2.iterator();
	      while(iterator2.hasNext()) {
	          Map.Entry mentry2 = (Map.Entry)iterator2.next();
	          System.out.print("Key is: "+mentry2.getKey() + " & Value is: ");
	          System.out.println(mentry2.getValue());
	       }
	}
}
