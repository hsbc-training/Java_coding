package day4;

import java.util.*;  
/**
 * Array list lab
 * @author bk
 *
 */
public class arrayList{  
   public static void main(String args[]){  
      ArrayList<String> alist=new ArrayList<String>();  
      //Adding Elements in the rear end
      alist.add("Steve");
      alist.add("Tim");
      alist.add("Lucy");
      alist.add("Pat");
      alist.add("Angela");
      alist.add("Tom");
  
      //displaying elements
      System.out.println(alist);
  
      //Adding "Steve" at the specified position
      alist.add(3, "Steve");
  
      //displaying elements
      System.out.println(alist);
      
      alist.set(0,"Bharat");
      System.out.println(alist);
      
      //removing from a specified position
      alist.remove(0);
      System.out.println(alist);
      
      alist.remove("Angela");
      System.out.println(alist);
      
		/*
		 * for (String str : alist) { System.out.println(str); }
		 */
      
      //Iterator
      Iterator iter = alist.iterator();
      while(iter.hasNext()) {
    	  System.out.print(iter.next());
      }
      
      System.out.println();
      
      //Sorting, reverse sorting using Collections in 2 ways
      System.out.println(alist.size());
      Collections.sort(alist);
      System.out.println(alist);
      
      Collections.sort(alist,Collections.reverseOrder());
      System.out.println(alist);
      
      Collections.reverse(alist);
      System.out.println(alist);
      
      //finding index of an object & finding object at a given position
      //int pos = alist.indexOf("Tom");
      String str = alist.get(alist.indexOf("Tom"));
      System.out.println(" "+str);
      
      //Boolean check if an element exists
      System.out.println(alist.contains("Tim"));
      
      
      //Adding two lists
      ArrayList<String> alist2 = new ArrayList<String>();
      alist2.add("Parth");
      alist2.add("Pushkar");
      alist2.add("Bharat");
      
      ArrayList<String> alist3 = new ArrayList<>();
      alist3.add("Aditi");
      alist3.add("Vishnu");
      
      
      System.out.println(alist);
      System.out.println(alist2);
      System.out.println(alist3);
      alist.addAll(alist2);
      alist.addAll(0, alist3);
      System.out.println(alist);
      
      //sublisting
      List<String> alist_sublisted = new ArrayList<String>();
      alist_sublisted = alist.subList(3, 7);
      System.out.println(alist_sublisted);
      
      //swapping
      Collections.swap(alist, alist.size()-1, 0);
      System.out.println(alist);
      
      //shallow copy
      ArrayList<String> al_copy = (ArrayList<String>)alist.clone();
      System.out.println(al_copy);
      
      //isEmpty
      //clearing the list
      System.out.println(alist.isEmpty());
      alist.clear();
      System.out.println(alist);
      System.out.println(alist.isEmpty());
      
   }  
}
