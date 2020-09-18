package arraylist;

import java.util.ArrayList;

public class AddElements {
	public static void main(String[] args) {
		ArrayList<String> aList = new ArrayList<String>();
		aList.add("first");
		aList.add("second");
		aList.add("third");
		
		System.out.println(aList);
		
		aList.add(2,"Inserted at 3rd position");
		System.out.println(aList);
	}
}
