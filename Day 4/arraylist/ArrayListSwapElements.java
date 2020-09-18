package arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSwapElements {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();

		al.add("Sachin");
		al.add("Rahul");
		al.add("Saurav");
		al.add("Sunil");
		al.add("Kapil");
		al.add("Vinod");

		System.out.println("ArrayList before Swap:");
		for (String temp : al) {
			System.out.println(temp);
		}
		
		Collections.swap(al,0,1);
		System.out.println("ArrayList after Swap" + al);
	}

}
