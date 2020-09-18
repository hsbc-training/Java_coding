package HashSet;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;


public class Hashset {

	public static void main(String args[]) {
//	      // HashSet declaration
//	      HashSet<String> hset = 
//	               new HashSet<String>();
//
//	      // Adding elements to the HashSet
//	      hset.add("Apple");
//	      hset.add("Mango");
//	      hset.add("Grapes");
//	      hset.add("Orange");
//	      hset.add("Fig");
//	      //Addition of duplicate elements
//	      hset.add("Apple");
//	      hset.add("Mango");
//	      //Addition of null values
//	      hset.add(null);
//	      hset.add(null);
//
//	      //Displaying HashSet elements
//	      System.out.println(hset);
		
		//Delete elements
		
//		HashSet<String> hset=new HashSet<String>();
//		hset.add("Elements1");
//		hset.add("Elements2");
//		hset.add("Elements3");
//		hset.add("Elements4");
//		hset.add("Elements5");
//		
//		System.out.println("Before :Hashset contains"+hset);
//		hset.clear();
//		System.out.println("Before :Hashset contains"+hset);
		
		//iterator
//		HashSet<String> hset=new HashSet<String>();
//		
//		hset.add("abc");
//		hset.add("bcd");
//		hset.add("cde");
//		hset.add("def");
//		hset.add("efg");
//		
//		Iterator<String> it=hset.iterator();
//		while(it.hasNext())
//		{
//			System.out.println(it.next());
//		}
		
		//withou iterator
//		HashSet<String> hset=new HashSet<String>();
//		
//		hset.add("abc");
//		hset.add("bcd");
//		hset.add("cde");
//		hset.add("def");
//		hset.add("efg");
//		
//		for(String temp:hset)
//		{
//			System.out.println(temp);
//		}
		
		//Hset to Array
//		HashSet<String> hset=new HashSet<String>();
//		hset.add("Elements1");
//		hset.add("Elements2");
//		hset.add("Elements3");
//		hset.add("Elements4");
//		hset.add("Elements5");
//
//		System.out.println("HashSet contains:"+hset);
//		String[] array=new String[hset.size()];
//		hset.toArray(array);
//		
//		 System.out.println("Array elements: ");
//	     for(String temp : array){
//	        System.out.println(temp);
//	     }
//		HashSet<String> hset=new HashSet<String>();
//		HashSet<String> hset1=new HashSet<String>();
//		hset.add("Elements1");
//		hset.add("Elements2");
//		hset.add("Elements3");
//		hset.add("Elements4");
//		hset.add("Elements5");
//		hset1=(HashSet)hset.clone();
//		
//		System.out.println("the new set"+ hset1);
//		
		
		//Convert HashSet to ArrayList
		HashSet<String> hset=new HashSet<String>();
		hset.add("Steve");
		hset.add("Matt");
		hset.add("Govinda");
		hset.add("john");
		hset.add("Tommy");
		
		System.out.println("HashSet contains:"+ hset);
		
		ArrayList<String> list=new ArrayList<String>(hset);
		
		System.out.println("HashSet contains:"+ list);
		
	    }
}
