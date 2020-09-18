package demo.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class HashMapDemo {
	
	private HashMap<String, Integer> score = new HashMap<>();
	
	public void add(ArrayList<Score> list) {
			
		Iterator it = list.iterator();
		while(it.hasNext()) {
			Score s = (Score) it.next();
			score.put(s.getName(), s.getMarks());
		}
	}
	
	
	public void display() {
		System.out.println(score);
	}

}
