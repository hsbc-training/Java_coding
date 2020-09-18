import java.util.*;

public class Names {
public static void main(String[] args) {
	ArrayList<String> names = new ArrayList<String>();
	names.add("Steve");
	names.add("James");
	names.add("Jason");
	names.add("Maria");
	names.add("John");
	
	//displaying elements
	System.out.println(names);
	
	//adding name to 4th  place
	names.add(3, "Esha");
	
	//display list after adding names
	System.out.println(names);
	
	//to change a particular element
	names.set(0, "Anu");
	
	//to remove element 
	names.remove(0);
	
	//to show size
	names.size();
	
	//loops
	System.out.println("For loop");
	for(int i=0 ; i<names.size();i++)
	{
		System.out.println(names.get(i));
	}
	
	System.out.println("Advanced for loop");
	for(String str:names)
	{
		System.out.println(str);
	}
	
	
	
	System.out.println("while loop");
	int i=0;
	while(names.size()> i)
	{
		System.out.println(names.get(i));
		i++;
	}
	
	System.out.println("Iterator");	
	Iterator iter = names.iterator();
	while(iter.hasNext())
	{
		System.out.println(iter.hasNext());
	}
	//Sorting
	System.out.println("After Sorting");
	Collections.sort(names);
	for(String str:names)
	{
		System.out.println(str);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
