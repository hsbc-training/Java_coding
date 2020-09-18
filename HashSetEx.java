import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.Set;
import java.util.*;

public class HashSetEx {
	public static void main(String[] args) {
		HashSet<String> hstr = new HashSet<String>();
		hstr.add("Mauli");
		hstr.add("Shiv");
		hstr.add("Pooja");
		hstr.add("Liza");
		hstr.add("Alice");
		hstr.add("Rosy");
		hstr.add("Monty");
		hstr.add("moris");
		hstr.add(null);
		System.out.println(hstr);
		
		//cloning
		HashSet<String> hstr2 = new HashSet<String>();
		hstr2 = (HashSet)hstr.clone();
		System.out.println(hstr2);
		
		//iterate thro' Hash
		Iterator<String> s = hstr.iterator();
		while(s.hasNext()) System.out.println(s.next());
		
		//hash set n to an array
		String[] hsarray = new String[hstr.size()];
		hstr.toArray(hsarray);
		for(String t: hsarray) System.out.println("Array element: "+t);
		
		//converting it in to treeset
		Set            <String> tset = new TreeSet<String>(hstr);
		for(String tst: tset) System.out.println("TreeSet element: "+tst);
		
		List<String> list = new ArrayList<String>(hstr);
		System.out.println("list:"+list);
		//clearing all elements
		hstr.clear();
		System.out.println(hstr);
	}
	
}
