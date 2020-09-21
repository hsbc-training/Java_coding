package HashSetPackage;
import java.util.*;

/*
 * 
 * @Author Pratham Sharma
 * Package created to demo HashSet
 * 
 * Class HashSetDemo created to implement demo
 */
public class HashSetDemo {
	public static void main(String[] args) {
		HashSet<String> fruitSet = new HashSet<String>();
		fruitSet.add("Apple");
		fruitSet.add("Mango");
		fruitSet.add("Grapes");
		fruitSet.add("Orange");
		fruitSet.add("Fig");
		
		//Adding duplicate values 
		fruitSet.add("Apple");
		fruitSet.add("Mango");
		
		//fruitSet.add(null);
		//fruitSet.add(null);
		
		//System.out.println(fruitSet);
		
		//Removing elements
			//Removing all elements in one go
		System.out.println("Set before clearing "+fruitSet+"\n");
		//fruitSet.clear();
		
		//System.out.println("Set after clearing "+fruitSet+"\n");
		
		//Iterate through a HashSet
			//using Iterator
		System.out.println("Looping the set using a n iterator \n");
		Iterator itr = fruitSet.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("\n");
		
			// using for each
		System.out.println("Looping using for each \n");
		for(String str:fruitSet) {
			System.out.println(str);
		}
		System.out.println("\n");
		
		//Converting the set into an array
		String [] setAsArray= new String[fruitSet.size()];
		fruitSet.toArray(setAsArray);
		
		System.out.println("Set elemnts looped over in an Array \n");
		for(String str: setAsArray) {
			System.out.println(str);
		}
		System.out.println("\n");
		
		// Converting the set to a TreeSet
		System.out.println("Looping over the tree set after conversion");
		Set<String> setAsTreeSet =  new TreeSet<String>(fruitSet);
		for(String abc: setAsTreeSet) {
			System.out.println(abc);
		}
		System.out.println("\n");
		
		//Converting the set to ArrayList
		System.out.println("Set as ArrayList");
		List<String> setAsArrayList = new ArrayList<String>(fruitSet);
		System.out.println(setAsArrayList+"\n");
		
		//HashSet methods
		HashSet<String> h2= new HashSet<String>();
		h2=(HashSet)fruitSet.clone();
		System.out.println(h2+"\n");
		
		System.out.println("Is fruitSet empty? "+ fruitSet.isEmpty()+"\n");
		System.out.println("What is the size of fruitSet ? "+fruitSet.size()+"\n");
		System.out.println("Do you have an orange ? "+fruitSet.contains("Orange")+"\n");
		
		//LinkedHashSet stores the elements 
		LinkedHashSet<String> linkedFruitSet = new LinkedHashSet<String>();
		linkedFruitSet.add("Orange");
		linkedFruitSet.add("Papaya");
		linkedFruitSet.add("Dragon fruit");
		linkedFruitSet.add("Apple");
		linkedFruitSet.add("Anjeer");
		
		System.out.println("Fruits in a LinkedHashSet "+linkedFruitSet+"\n");
	}
}
