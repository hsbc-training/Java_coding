package java_b;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Details {
	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(12, "Chaitanya");
		hm.put(2, "Rahul");
		hm.put(7, "Singh");
		hm.put(49, "Ajeet");
		hm.put(3, "Anuj");

		Set set = hm.entrySet();
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			Map.Entry entry = (Map.Entry) iterator.next();
			System.out.println("Key is " + entry.getKey() + " and value is " + entry.getValue());

		}
		System.out.println(hm.get(3));

		hm.remove(3);
		Set set2 = hm.entrySet();
		Iterator iterator2 = set.iterator();
		while (iterator2.hasNext()) {
			Map.Entry entry2 = (Map.Entry) iterator2.next();
			System.out.println("Key is " + entry2.getKey() + " and value is " + entry2.getValue());

		}
	}
}
