package Day4;

import java.util.*;

public class Hashset_demo {

	public static void main(String[] args)

	{

		HashSet<String> hs = new HashSet<>();
		HashSet<String> hs2 = new HashSet<>();
		HashSet<String> hs3 = new HashSet<>();

		hs.add("Aditi");
		hs.add("Teena");
		hs.add("Sita");
		hs.add("Aditi");
		hs.add("Aditi");

		hs3 = (HashSet) hs.clone();
		System.out.println(hs3);

		System.out.println(hs);

		hs2.add("Steeve");
		hs2.addAll(hs);
		System.out.println(hs2);

//		hs.clear();
//		System.out.println(hs);

//      iterating using iterator		
		Iterator itr = hs.iterator();
		while (itr.hasNext())
			System.out.println(itr.next());
		System.out.println("\n");

//      iterating without iterator
		for (String s : hs) {
			System.out.println(s);
		}
// converting hashset to array

		System.out.println("\n");
		String[] str = new String[hs.size()];
		hs.toArray(str);
		for (String temp : str) {
			System.out.println(temp);
		}
//to check if set is empty or not
		System.out.println(hs.isEmpty());
//size of set
		System.out.println(hs.size());
//remove element
		hs.remove("Aditi");
		for (String h : hs)
			System.out.println(h);
	}

}