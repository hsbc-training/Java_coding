package hashSet;
import java.util.HashSet;
import java.util.Iterator;

/** 
 * HashSet Basics
 * @author suryavanshi
 *
 */
public class HashSetExample {
	public static void main(String args[]) {

		HashSet<String> hashSet = new HashSet<>();

		hashSet.add("Apple");
		hashSet.add("Mango");
		hashSet.add("Grapes");
		hashSet.add("Orange");
		hashSet.add("Fig");

		hashSet.add("Mango");								//Duplicate Element	
		
		hashSet.add(null);									// null Element

		System.out.println(hashSet);

		Iterator<String> it = hashSet.iterator();			//Using Iterator
		while(it.hasNext()){
			System.out.print(it.next() + " ");
		}

		System.out.println();

		for (String string : hashSet) {						//Using forEach
			System.out.print(string + " ");
		}

		hashSet.clear();									//Clear HashSet
		System.out.println("\nHashSet after clearing : " + hashSet);
	}
}