
import java.util.*;
public class Array_lists {

	public static void main(String[] args) {
		ArrayList <String> list=new ArrayList<String>();          //declaring an arraylist
		list.add("Pooja");        //add elements o the list
		list.add("Siya");        //can use Arrays.aslist()instead
		list.add("Naman");
		list.add("Steve");
		
		System.out.println("List after addition: "+list);
		
		list.remove(1);            //remove element by index
		list.remove("Steve");      //remove element 
		
		System.out.println("List after removing: "+list);
		
		list.add("Harsha");
		list.add("Joy");
		list.add(0, "Rahul"); //add at specific index (overloaded method)
		list.set(2,"Sai");    //previous element gets replaced with a new element at the specified index
		
		System.out.println("New elements added: ");
		
		for(String str:list)               //iterating the list
		{
			System.out.println(str);
		}
		
		System.out.println("Size of a list: " +list.size());   //size of list
		
		Collections.sort(list);   //sorting the list
		System.out.println("List after sorting: "+list);
		
		Collections.sort(list,Collections.reverseOrder());//sort in decreasing order
		System.out.println("List in decreasing order:" +list);
		
		System.out.println("Index of Rahul: "+list.indexOf("Rahul"));  //position of element
		
		System.out.println("Element at position 2: "+list.get(2)); //get element
		
		boolean a=list.contains("Naman");  //check if an element is there in list
		if(a)
		{
			System.out.println("Naman is there in list");
		}
		else
		{
			System.out.println("Naman is not there in the list");
		}
		
		 ArrayList<String> list_colour = new ArrayList<String>(Collections.nCopies(4, "Red"));//4 times red in list
		  System.out.println("ArrayList items: "+list_colour);
		  
		  Iterator iter = list_colour.iterator(); //using iterator
		  System.out.println("Colours:");
	      while (iter.hasNext()) {
	         System.out.print(iter.next()+",");
	      }
	      System.out.println("");
	      
	      Enumeration<String>e=Collections.enumeration(list_colour); //Get the enumeration object
	      System.out.println("Colours after enumeration:");
	      while(e.hasMoreElements())  //Enumerate through the list
	      {
	    	  System.out.print(e.nextElement()+",");
	      }
	      System.out.println();
	      
	      ArrayList<String> Colours2 = new ArrayList<String>(); //
	       Colours2.add("Text1");
	       Colours2.add("Text2");
	       Colours2.add("Text3");
	       Colours2.add("Text4");
	       
	       list_colour.addAll(Colours2);  //adding all the elements to another list
	       System.out.println("Colours2 list: "+list_colour);
	       
	       list_colour.addAll(2,Colours2); //adding all the elements at specific index to another list
	       System.out.println("Appending the list at specific position: "+list_colour);
	       
	       ArrayList<String> Colours3 = new ArrayList<String>(list_colour.subList(1, 4)); //sublist
	       System.out.println("SubList stored in ArrayList: "+Colours3);
	       
	       System.out.println(list_colour.lastIndexOf("Red")); //last occurance of an element
	       
	       System.out.println(list_colour.indexOf("Text1")); //First occurance of an element
	      
	}

}
