package Day4;

import java.util.*;
public class ArrayListLooping {

	public static void main(String[] args)
	{
		
	ArrayList<Integer> obj=new ArrayList<>();	
		obj.add(5);
		obj.add(7);
		obj.add(33);
		obj.add(12);
		
		System.out.println("FOR");
		
		//using for loop
		
		for(int i=0;i<obj.size();i++)
			System.out.println(obj.get(i));
		System.out.println("\n");
		System.out.println("ADV FOR");
		
		//advanced for loop
		
		for(Integer i:obj)
			System.out.println(i);
		System.out.println("\n");
		System.out.println("WHILE");
		
		//while loop
		
		int s=obj.size();
		int p=0;
		while(s>p)
		{
			System.out.println(obj.get(p));
		    p++;
		}
		System.out.println("\n");
		System.out.println("ITERATOR");
		
		//iterator
		
		Iterator itr=obj.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
	}
}
