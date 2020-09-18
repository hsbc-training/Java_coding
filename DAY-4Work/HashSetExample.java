package day4;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class HashSetExample {
	
	public static void main(String args[])
	{
		HashSet<String> hset= new HashSet<String>();
		HashSet hset2= new HashSet();
		hset.add("Fareeya");
		hset.add("Huda");
		hset.add("palak");
		hset.add("Tarab");
		hset.add(null);
		//hset.clear();
		int len=hset.size();
		System.out.println("length of the hashset="+len);
		for(String itr:hset)
		{
			System.out.println(itr);
		}
		
        hset2 = (HashSet)hset.clone(); 
        System.out.println("Cloned hashset="+hset2);
        
        List<String> names= new ArrayList<String>(hset);
        Collections.sort(names);
        System.out.println("HashSet elements after sorting: "+names);
		
		
		
	}

}
