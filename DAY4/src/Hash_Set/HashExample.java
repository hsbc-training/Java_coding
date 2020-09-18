package Hash_Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
public class HashExample {
	public static void main(String[]args)
	{
		HashSet<String> hs=new HashSet<String>(); //HashSet declarationn
		
		hs.add("RAM");
		hs.add("RINA");
		hs.add("PRITI"); //Adding elements to set
		hs.add("SACHIN");
		hs.add("AVYUKTA");
	//	hs.add(null);
	//	hs.add(null);  //Adding null
		
		System.out.println(hs); //Printing set
		
		System.out.println("Is RAM there in set? "+hs.contains("RAM")); //check if an element is there in set
		
		System.out.println("Is set empty? "+hs.isEmpty()); //check if set is empty
		
		Iterator<String> it = hs.iterator();//print using iterator
		System.out.println("Elements on iterating:");
	     while(it.hasNext()){
	        System.out.print(it.next()+",");
	     }
	    System.out.println();
	    
	    List<String>ls=new ArrayList<String>(hs);
	    System.out.println("Array list contains: "+ls);
		
		System.out.println("Number of elements in HashSet: "+hs.size()); //size of set
		
		
		String[] array = new String[hs.size()];
	    hs.toArray(array);  //set converted to an array
	 
	     // Displaying Array elements
	     System.out.println("Array elements: ");
	     for(String t : array)
	     {
	        System.out.print(t+",");
	     }
		 System.out.println();
		 
	     // Creating a TreeSet of HashSet elements
	     Set<String> tset = new TreeSet<String>(hs);
	 
	     // Displaying TreeSet elements
	     System.out.println("TreeSet contains: ");
	     for(String t : tset){
	        System.out.print(t+",");
	     }
		System.out.println();

		System.out.println("Null removed? "+hs.remove(null)); //remove particular element from the set
		
		System.out.println("Set after removing null: "+hs);
		
		System.out.println("Cloned copy of set: "+hs.clone()); //cloned copy
		
		hs.clear(); //Clear set
		System.out.println("Set cleared."+hs);
	
		
	}
}
