package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
//different ways to initialize an arraylist
public class Arraylist1 {
public static void main(String[] args) {
	ArrayList<String> a1=new ArrayList<>(
	//first way
	Arrays.asList("abhi","abhinav","avi")
	);
	System.out.println(a1);
	
	//2nd way
	ArrayList<String> a2=new ArrayList<String>() {{
		add("abhinav");
		add("abhi");
		add("akash");		
		
	}};
	System.out.println(a2);
	
	//add all elements of a list to another list
	a1.addAll(a2);//adding a2 after a1
	System.out.println(a1);
	
	//addall from a specified index
	a1.addAll(2,a2);
	
	//sublist to list
	ArrayList<String> a4=new ArrayList<String>(a1.subList(0, 2));
	System.out.println(a4);
	
	//Sublist to list
	List<String> a5=a1.subList(0, 2);
	System.out.println(a5);
	
	//to get last index of
	System.out.println(a1.lastIndexOf("abhinav"));
	
	//normal way
	//obj.add();
	
	//3rd way:if we want to initialize list with same elements
	ArrayList<String> a3=new ArrayList<String>(Collections.nCopies(5, "abhi"));
	System.out.println(a3);
}
}
