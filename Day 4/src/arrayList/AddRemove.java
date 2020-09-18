package arrayList;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 
 * @author suryavanshi
 *
 */
public class AddRemove {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		
		ArrayList<Integer> list2 = new ArrayList<>();
		list2.add(5);
		list2.add(6);
		list2.add(7);
		list2.add(8);
	
		list.addAll(list2);
		System.out.println(list);
		
		list.addAll(2, list2);
		System.out.println(list);
		
		list.remove(2);
		System.out.println(list);
		
		list.remove(Integer.valueOf(2));
		System.out.println(list);
		
		list2.removeAll(list2);
		System.out.println(list2);
		
	}
}
