package hashSet;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
/**
 * Converting HashSet to Array
 * Converting HashSet to TreeSet
 * Converting HashSet to ArrayList
 * 
 * @author suryavanshi
 *
 */
class ConvertHashSet{ 
	public static void main(String[] args) {

		HashSet<String> hset = new HashSet<>();

		hset.add("Element1");
		hset.add("Element2");
		hset.add("Element3");
		hset.add("Element4");

		System.out.println(hset + " ");

		String[] arr = new String[hset.size()];
		hset.toArray(arr);

		System.out.println("HashSet to Array");
		for (String string : arr) {
			System.out.print(string + " ");
		}
		
		System.out.println("\nHashSet to TreeSet");
		Set<String> tset = new TreeSet<String>(hset);
		for (String string : tset) {
			System.out.print(string + " ");
		}
		
		System.out.println("\nHashSet to ArrayList");
		List<String> list = new ArrayList<>(hset);
		for (String string : list) {
			System.out.print(string + " ");
		}
		
		System.out.println("\nHashSet Clone");
		HashSet<String> h2 = new HashSet<>();
		h2 = (HashSet<String>) hset.clone();
		System.out.println(h2);
		
	}
}