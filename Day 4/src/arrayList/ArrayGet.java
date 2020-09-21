package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayGet {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Pune");
		list.add("Mumbai");
		list.add("Nagpur");
		list.add("Nashik");
		list.add("Solapur");
		list.add("Kolhapur");
		System.out.println(list);
		
		ArrayList<String> list2 = new ArrayList<String>(list.subList(1, 5));
		System.out.println(list2);
		
		ArrayList<Integer> al = new ArrayList<>();
		al.add(88);
		al.add(23);
		al.add(45);
		al.add(1);
		al.add(1);
		al.add(60);
		al.add(12);
		al.add(23);
		al.add(34);
		al.add(56);
		al.add(67);
		al.add(45);
		al.add(1);
		
		System.out.println("Last occurence of 23 at index : " + al.lastIndexOf(23));
		System.out.println("Last occurence of 1 at index : " + al.lastIndexOf(1));
		System.out.println("Last occurence of 56 at index : " + al.lastIndexOf(56));
		System.out.println("Last occurence of 45 at index : " + al.lastIndexOf(45));
		
		System.out.println("First Element : " + al.get(0));
		System.out.println("Third Element : " + al.get(3));
		System.out.println("Last Element : " + al.get(al.size()-1));
		
		System.out.println("First occurence of 23 at index : " + al.indexOf(23));
		
		System.out.println("'1' is present in list : " + al.contains(1));
		System.out.println("'0' is present in list : " + al.contains(0));
		
		System.out.println("Occurences of 1 : " + Collections.frequency(al, 1));
	}
}
