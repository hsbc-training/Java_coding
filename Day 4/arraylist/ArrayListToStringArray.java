package arraylist;

import java.util.ArrayList;

public class ArrayListToStringArray {
	public static void main(String[] args) {
		ArrayList<String> friendsnames= new ArrayList<String>();
		friendsnames.add("Ankur");
		friendsnames.add("Ajeet");
		friendsnames.add("Harsh");
		friendsnames.add("John");
		
		String [] s = friendsnames.toArray(new String[friendsnames.size()]);
		
		for(String k : s) {
			System.out.println(k);
		}
	}
	
}
