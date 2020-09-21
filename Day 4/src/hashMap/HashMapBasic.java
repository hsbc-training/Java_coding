package hashMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;
public class HashMapBasic {

	public static void main(String args[]) {

		HashMap<Integer, String> hash = new HashMap<Integer, String>();

		hash.put(33, "Rohan");
		hash.put(22, "Rahul");
		hash.put(71, "Rohit");
		hash.put(34, "Shubham");
		hash.put(32, "ABC");

		Set set = hash.entrySet();
		Iterator iterator = set.iterator();
		while(iterator.hasNext()) {
			Map.Entry m = (Map.Entry)iterator.next();
			System.out.print("\nKey : "+ m.getKey() + " Value : " + m.getValue());
		}

		System.out.println("\nValue at Key 33 : "+ hash.get(33));

		hash.remove(32);

		System.out.println("HashMap Key Values after removal:");
		Set set2 = hash.entrySet();
		Iterator iterator2 = set2.iterator();
		while(iterator2.hasNext()) {
			Map.Entry m2 = (Map.Entry)iterator2.next();
			System.out.print("\nKey : " + m2.getKey() + " & Value : " + m2.getValue());
		}

	}
}