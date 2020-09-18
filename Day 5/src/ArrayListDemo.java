
import java.util.*;
/**
 * 
 * @author Pratham Sharma
 * 
 * Class to demo ArrayList
 *
 */
public class ArrayListDemo {
	
	public static void main(String[] args) {
		//Created a string array list
		ArrayList<String> stringList = new ArrayList<>();
		//Adding elements
		stringList.add("Gregor Clegane");
		stringList.add("Khal Drogo");
		stringList.add("Cersei Lannister");
		stringList.add("Sandor Clegane");
		stringList.add("Tyrion Lannister");
		stringList.add("Ned Stark");
		
		System.out.println(stringList+"\n");
		
		//Adding at index
		stringList.add(3, "Bran Stark");
		
		System.out.println(stringList+"\n");
		
		//Change element value
		stringList.set(3, "3 eyed Raven");
		System.out.println(stringList+"\n");
		
		//Remove element by value or by index
		stringList.remove("Ned Stark");
		stringList.remove(3);
		System.out.println(stringList+"\n");
		
		//Iterating Array List
			//For each loop
		for (String str: stringList) {
			System.out.println(str);
		}
		System.out.println("\n");
		
		
		//ArrayList of integer
		ArrayList<Integer> numbers = new ArrayList<>();
		//Adding integers
		numbers.add(3);
		numbers.add(6);
		numbers.add(9);
		numbers.add(12);
		numbers.add(15);
		
		//Adding one Collection to another
		
		ArrayList<Integer> numbers2 = new ArrayList<>();
		numbers2.add(99);
		numbers2.add(34);
		numbers2.add(78);
		
		System.out.println("Before adding another collection"+numbers+"\n");
		numbers.addAll(numbers2);//addAll(2,numbers2) adds all the elements of numbers2 from position 2
		System.out.println("After adding another collection"+numbers+"\n");
		
		//Size of numbers ArrayList
		System.out.println("The size of integer ArrayList is :"+numbers.size()+"\n");
		
		//Sorting ArrayList
			//Created ArrayList of fruits
		ArrayList<String> fruits = new ArrayList<>();
		fruits.add("Orange");
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Pineapple");
		
		//Sorting ArrayList using predefined function of collection
		Collections.sort(fruits);
		
		for(String str:fruits) {
			System.out.println(str);
		}
		System.out.println("\n");
		
		//Sorting in reverse Order
		Collections.sort(fruits, Collections.reverseOrder());
		System.out.println(fruits);
		System.out.println("\n");
		
		
		//Methods of ArrayList
		System.out.println(fruits.indexOf("Orange")+"\n");// to find first occurrence of the element
		System.out.println(fruits.contains("Gregor Clegane")+"\n");//to find a specific element
		
		//Initialize ArrayList
		
			//Using Arrays.asList
		ArrayList<String> names = new ArrayList<>(Arrays.asList("Cersei","Mountain","Bran"));
		System.out.println(names+"\n");
		
			//Anonymous inner class method
		ArrayList<String> cities = new ArrayList<String>() {

		{
			add("Delhi");
			add("Akhnoor");
			add("Vellore");
		}};
		System.out.println(cities+"\n");
		
			//using Collections.ncopies
		ArrayList<Integer> intList= new ArrayList<>(Collections.nCopies(10, 5));
		System.out.println(intList+"\n");
		
		
		//Loop ArrayList
		ArrayList<Integer> arrList = new ArrayList<>();
		arrList.add(12);
		arrList.add(1,34);
		arrList.add(49);
		arrList.add(23);
		
			//for loop
		System.out.println("Using for Loop");
		for(int i=0;i<arrList.size();i++) {
			System.out.println(arrList.get(i));
		}
			//Using For each
		System.out.println("Using for each");
		for(Integer in: arrList) {
			System.out.println(in);
		}
		System.out.println("Using while Loop");
			//Using while loop
		int c=0;
		while(c<arrList.size()) {
			System.out.println(arrList.get(c));
			c++;
		}
			//Using Iterator
		System.out.println("Using Iterator");
		Iterator iter = arrList.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		//SubList
		// subList(int fromIndex, int toIndex)  if toIndex is 5 adds till 4 follows '<' condition
		ArrayList<Integer> subNumbers = new ArrayList<>(numbers.subList(2, 5));
		System.out.println("\nSubList stored in ArrayList "+subNumbers+"\n");
		
		List<Integer> list = numbers.subList(1, 4);
	    System.out.println("SubList stored in List: "+list+"\n");
	    
	    //lastIndexOf is useful when we have duplicate elements or if we want to check for duplicacy it returns
	    //the last index where that element is found at eg: if 1 is a t 2 and 10 it will return 10
		numbers.add(12);
		numbers.add(15);
		System.out.println("LastoccurenceOf 12 is "+numbers.lastIndexOf(12)+"\n");
		System.out.println("LastoccurenceOf 15 is "+numbers.lastIndexOf(15)+"\n");
		
		//get() finds the value of element at the index given as parameter
		System.out.println("Fruit at position 2 is " +fruits.get(2)+"\n");
		
		//indexOf() is to find the first occurrence of elements in the list
		System.out.println("First occurence of 12 in list is at "+numbers.indexOf(12)+"\n");
		
		//Comapring two arrayList
	}
	
}