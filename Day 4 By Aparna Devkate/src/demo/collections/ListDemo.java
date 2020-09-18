package demo.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {

	private ArrayList<Integer> rollnums = new ArrayList<>();

	public void addRollnums(int num) {

		System.out.println("\nAdded " + num + " items in list");
		int i = 0;
		while (num != 0) {
			num--;
			i++;
			rollnums.add(i);
		}
	}
	public void check(int val) {
		if(rollnums.contains(val))
			System.out.println("\n"+val+" is present");
		else 
			System.out.println("\n"+val+" is not present");
	}
	public void updateValue(int index, int new_num) {
		System.out.println("\nUpdated Value at index " + index);
		rollnums.set(index, new_num);
	}

	public void displayList() {
		System.out.println("\nDisplaying List :");
		for (int i : rollnums) {
			System.out.println(i);
		}
	}

	public int getSize() {

		return rollnums.size();
	}

	public void sortList() {
		System.out.println("\nAfter Sort :");
		Collections.sort(rollnums);
	}
	
	public void reverseSortList() {
		System.out.println("\nAfter Reverse Sort :");
		Collections.sort(rollnums,Collections.reverseOrder());
	}

	public void removeItem(int item) {
		System.out.println("\nAfter Removal");
		rollnums.remove(item);
	}
	
	public void  conversionToArray() {
		
		System.out.println(rollnums.toArray());
	
		}
	
	
	public void displayUsingListIterator() {

		System.out.println("\nUsing next() method of ListIterator");

//		Iterator<Integer> itr = rollnums.listIterator();
		ListIterator<Integer> itr = rollnums.listIterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("\nUsing previous() method of ListIterator");

		while (itr.hasPrevious()) {
			System.out.println(itr.previous());
		}
	}

}
