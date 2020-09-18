//Things to remember 
//add method creates an object in arraylist 
//set is used to update while add is used to add at any location 
//alist.get is used to find whats there at that index
//alist.contains tells boolean response for particular element 
//alist.clear() to remove everything 

import java.util.*;
public class Arr_List {
public static void main(String[] args) {
	ArrayList<String> alist=new ArrayList<String>();
	alist.add("Zombie");
	alist.add("Yatch");
	alist.add("Watch");
	alist.add("Vulture");
	//System.out.println(alist);
	//To add at a particular location
	alist.add(3,"Wrong");
	//System.out.println(alist);
	//To update an element at particular location 
	alist.set(4,"Vegan");
	//System.out.println(alist);
	//to remove an element 
	//alist.remove("Watch");
	//System.out.println(alist);
	alist.remove(3);
	//System.out.println(alist);
	alist.add("Hola");
	alist.set(1,"Books");
	for(String sc:alist) {
		System.out.print(" "+sc);
	}
	System.out.println("");
	alist.add(0,"Beginning");   //his is overloaded method
	alist.add("End");
	alist.remove(5);
	//System.out.println(alist);
	//to print the number of elements in the array list
	System.out.println("Total elements: "+ alist.size());
	Collections.sort(alist);
	System.out.println(alist);
	int pos=alist.indexOf("Vegan");
	System.out.println("Position of Vegan is "+pos);
	String find=alist.get(4);
	System.out.println(find);
	boolean s=alist.contains("Zombie");
	System.out.println(s);
	//to reverse the order
	Collections.reverse(alist);
	System.out.println(alist);
	
	ArrayList<String> blist=new ArrayList<String>();
	blist.add("Name 1");
	blist.add("Name 2");
	blist.add("Name 3");
	blist.add("Name 4");
	alist.addAll(2,blist);
	System.out.println(alist);
}
}
