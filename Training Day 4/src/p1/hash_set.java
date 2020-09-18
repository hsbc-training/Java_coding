package p1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class hash_set {

	public static void main(String[] args) {
		HashSet<String> hset = new HashSet<String>();
		hset.add("potato");
		hset.add("onions");
		hset.add("coriander");
		hset.add("Shengdaane");
		hset.add(null);
		System.out.println("printing clone : "+hset.clone());
		HashSet<String> m = (HashSet<String>) hset.clone(); //clone() returns shallow copy. typecasted close() to convert shallow copy into the hashset
		System.out.println(m);
		m.clear(); //deleting all the elements of the hashset
		
		ArrayList<String> list = new ArrayList<String>(hset);
		System.out.println("after conversion to array list: "+list);
		
		 Iterator<String> it = hset.iterator();
		 while(it.hasNext()){
		        System.out.println(it.next());
		     }
		 
				/*
				 * for(String str: hset) { System.out.println(str); }
				 */
		  
//		  Collections.sort(hset);   sorting does not work
		  System.out.println(hset);

	}

}
