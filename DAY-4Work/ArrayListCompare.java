package day4;
import java.util.ArrayList;
import java.util.List;

public class ArrayListCompare {
	
		  public  static void main(String args[]){
	      ArrayList<String> al = new ArrayList<String>();

	      //Adding elements to the ArrayList
	      al.add("Text 1");
	      al.add("Text 2");
	      al.add("Text 3");

	      System.out.println("ArrayList Elements are: "+al);

	      //Adding elements to a List
	      List<String> list = new ArrayList<String>();
	      list.add("Text 4");
	      list.add("Text 5");
	      list.add("Text 6");

	      //Adding all elements of list to ArrayList using addAll
	      al.addAll(list);
	      System.out.println("Updated ArrayList Elements: "+al);
	   }
	}


