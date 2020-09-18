import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class HashsetExample {
	
	public static void main(String[] args) {
		
		HashSet<String> fruits = new HashSet<String>();
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("mango");
		fruits.add("kiwi");
		fruits.add("apple");
		fruits.add(null);
		fruits.add(null);
		//Before removal
		System.out.println("Before removal :"+fruits);
		
		//After removal
		//fruits.clear();
		//System.out.println("After removal :"+fruits);
		
		//Using iterator to iterate hashset
		Iterator<String> iter = fruits.iterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
		
		//Hashset to array
		String[] arr = new String[fruits.size()];
		fruits.toArray(arr);
		System.out.println("Array elements");
		for(String x : arr)
		{
			System.out.println(x);
		}
		
		//Hashset to list
		List<String> list = new ArrayList<String>(fruits);
		System.out.println("List of elements");
		System.out.println(list);
		
		//Hashset to treeset
		Set<String> tset = new TreeSet<String>(fruits);
		System.out.println("TreeSet contains: ");
	     for(String temp : tset){
	        System.out.println(temp);
	     }
	     
	     HashSet<String> cloned_hashset = new HashSet<String>();
	     cloned_hashset = (HashSet)fruits.clone();
	     
	     System.out.println("The new set: " + cloned_hashset); 
		
		
		
		
	}
	

}
