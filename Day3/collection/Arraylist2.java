package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;

//iteratin arraylist
public class Arraylist2 {
	 public static void main(String[] args) {

	      ArrayList<Integer> arrlist = new ArrayList<Integer>();
	      arrlist.add(14);
	      arrlist.add(7);
	      arrlist.add(39);
	      arrlist.add(40);
	      
	      //normal for
	      for(int i=0;i<arrlist.size();i++) {
	    	  System.out.println(arrlist.get(i));
	      }
	      
	      /* Advanced For Loop*/ 		
	      System.out.println("Advanced For Loop"); 		
	      for (Integer num : arrlist) { 		      
	           System.out.println(num); 		
	      }
	      
	      //using iterator
	      Iterator i1=arrlist.iterator();
	      while(i1.hasNext()) {
	    	  System.out.println(i1.next());
	      }
	      
	      //using enumeration
	      Enumeration<Integer> e=Collections.enumeration(arrlist);
	      while(e.hasMoreElements()) {
	    	  System.out.println(e.nextElement());
	      }
	 }
}
