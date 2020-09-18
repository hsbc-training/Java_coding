package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Arrlist {
public static void main(String[] args) {
	ArrayList<String> arr=new ArrayList<>();
	arr.add("Abhi");
	arr.add("Abhinav");
	arr.add("Avi");
	arr.add("steve");
	System.out.println(arr);
	arr.add(1, "Name");
	System.out.println(arr);
	arr.set(0, "My names");
	System.out.println(arr);
	arr.remove("Avi");
	System.out.println(arr);
	
	//iterating arraylist
	for(String s:arr) {
		System.out.println(s);
	}
	//size
		System.out.println(arr.size());
		
    //sort
		Collections.sort(arr);
		System.out.println(arr);
		
    //sort in descending order
		Collections.sort(arr,Collections.reverseOrder());
		System.out.println(arr);
		
	//get index of
		int index=arr.indexOf("Abhinav");
		System.out.println(index);
	//get value at specified index
		String val=arr.get(0);
		System.out.println(val);
	//check if a va;ue is present or not
		boolean check=arr.contains("Abhinav");
		System.out.println(check);
	//to remove all elements from arraylist
	//arr.remove();
		
		HashSet<String> hh=new HashSet<String>(arr);
		System.out.println(hh);
		
		String[] s1=new String[arr.size()];
		arr.toArray(s1);
		for(String s:s1)
		System.out.println(s);
	}
}

