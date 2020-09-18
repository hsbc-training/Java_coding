package p1;

import java.util.Iterator;
import java.util.LinkedList;

public class Linked_list {

	public static void main(String[] args) {
		LinkedList<String> list= new LinkedList<String>();
		list.add("Pushkar");
		list.add("Ramesh");
		list.add("Suresh");
		System.out.println(list);
		list.removeFirst();
		System.out.println(list);
		list.removeLast();
		System.out.println(list);
		list.remove(0);
		for(int i =0; i<10; i++)
		{
			list.add("a"+ i);
		}
		System.out.println(list);
		
		printList(list);
		list.removeFirst();
		printList(list);
		
		
		

	}

	private static void printList(LinkedList<String> list) {
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next() + " ");
		}
		
	}

}
