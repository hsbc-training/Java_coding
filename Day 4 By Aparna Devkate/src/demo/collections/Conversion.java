package demo.collections;

import java.util.ArrayList;
import java.util.Arrays;

class Operations{
	
	public ArrayList<String> arraytoArralyList(String[] names) {
		ArrayList<String> list = new ArrayList<>(Arrays.asList(names));
		System.out.println("\nAfter converting Array To ArrayList");
		for(String s : list)
			System.out.println(s);
		return list;
	}
	
	public String [] arrayListToArray(ArrayList<String> list) {
		String[] names=null;
		
		names = list.toArray(new String[list.size()]);
		System.out.println("\nAfter converting ArrayList to Array");
		for(String name : names) {
			System.out.println(name);
		}
		return names;
		
	}
}


public class Conversion {
	public static void main(String[] args) {
		
		Operations op = new Operations();
		ArrayList<String> list= new ArrayList<>();
		list.add("The 100");
		list.add("Friends");
		String [] names = {"Dean","Ambrose","Clark","Octavia","Raven"};
		op.arrayListToArray(list);
		op.arraytoArralyList(names);
		
	}
	

}
