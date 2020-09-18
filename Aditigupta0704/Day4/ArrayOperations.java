package Day4;

import java.util.*;

public class ArrayOperations {
public static void main(String[] args)
{
	ArrayList<String> array=new ArrayList<>();
	array.add("Aditi");
	array.add("Rahul");
	array.add("Rohan");
	
	ArrayList<String> fruits=new ArrayList<>();
	fruits.add("apple");
	fruits.add("banana");
	fruits.add("mango");
	
//	array.addAll(fruits);   //addAll()
//	System.out.println(array);
	
	array.addAll(1, fruits);
	System.out.println(array);
	
	
	array.remove("apple");
	System.out.println(array);
	
	array.remove(3);
	System.out.println(array);
	
	
	ArrayList<Integer> a1=new ArrayList<Integer>();
	a1.add(1);
	a1.add(10);
	a1.add(15);
	a1.add(15);
	a1.add(1);
	a1.add(18);
	a1.add(1);
	
	System.out.println("last index of 15 is "+ a1.lastIndexOf(18));
	
	System.out.println("last index of 15 is "+ a1.lastIndexOf(1));
	
	System.out.println("ls 15 present "+ a1.contains(15));
}
}
