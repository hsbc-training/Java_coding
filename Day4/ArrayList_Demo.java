import java.util.*;  
public class ArrayList_Demo{ 
   public static void main(String args[]){  
      ArrayList<String> alist=new ArrayList<String>();  
      alist.add("Steve");
      alist.add("Tim");
      alist.add("Lucy");
      alist.add("Pat");
      alist.add("Angela");
      alist.add("Tom");
  
      //displaying elements
      System.out.println(alist);
  
      //Adding "Steve" at the fourth position
      alist.add(3, "Steve");
  
      //displaying elements
      System.out.println(alist);
      //change elements
      alist.set(0, "Smriti");
      
      System.out.println(alist);
      //remove elements
      alist.remove(2);
      System.out.println(alist);
      alist.remove("Tom");
      System.out.println(alist);
      
      //iterating array list
      
      for(String str:alist) {
    	  System.out.println(str);
    	  
      }
      
      //size of arraylist
      
      System.out.println("Size of array is: "+alist.size());
      
      //sorting the arraylist
      
      Collections.sort(alist);
      for(String str:alist) {
    	  System.out.println(str);
      }
      //IndexOf
      System.out.println("Index of object is:"+ alist.indexOf("Smriti"));
      
      //getIndex
      System.out.println("Object at position 4:"+alist.get(3));
      
      //Empty the list
      System.out.println(alist);
      //alist.clear();
      System.out.println(alist);
      
      //Initialiasation
      ArrayList<Integer> obj=new ArrayList<Integer>(
    		  Arrays.asList(1,2,3)  );
      System.out.println(obj);
      
	   ArrayList<String> cities = new ArrayList<String>(){
		   {
		   add("Delhi");
		   add("Agra");
		   add("Chennai");
		   }};
	  System.out.println("Content of Array list cities:"+cities);
	  
	  ArrayList<Integer> numbers=new ArrayList<Integer>(Collections.nCopies(10, 5));
	  System.out.println(numbers);
	  
	  //Looping ArrayList
	  
	  System.out.println("For Loop");
	  for(int i=0;i<alist.size();i++) {
		  System.out.println(alist.get(i));
	  }
	  System.out.println();
	  System.out.println("Adavnced java loop");
	  for(String i:alist)
	  {System.out.println(i);}
	  System.out.println();
	  
	  //looping using iterator
	  System.out.println("Using Iterator");
	  Iterator i=alist.iterator();
	  while(i.hasNext()) {
		  System.out.println(i.next());
	  }
	  //using enum
	  Enumeration<String> e=Collections.enumeration(alist);
	  while(e.hasMoreElements()) {
		  System.out.println(e.nextElement());
	  }
	  System.out.println();
	  Collections.reverse(alist);
	  System.out.println(alist);
	  
	  Collections.sort(alist, Collections.reverseOrder());
	   System.out.println(alist);
	   
	  //adding two lists
	   System.out.println();
	   System.out.println("After adding two lists");
	  alist.addAll(2,cities);
	  System.out.println(alist);
	  
	  //creating sublist
	  System.out.println();
	  System.out.println("Sublist:");
	  ArrayList <String> a1= new ArrayList<String>(alist.subList(1, 4));
	  System.out.println(a1);
	  
	  //Last occurrence of any element
	  System.out.println();
	  alist.add("Delhi");
	  System.out.println(alist);
	  System.out.println("last occurence of Delhi:"+alist.lastIndexOf("Delhi"));
	  //chek whether the element is present in the list
	  
	  System.out.println();
	  System.out.println("Does Delhi occue in the list:"+alist.contains("Delhi"));
	  System.out.println("Does ice occue in the list:"+alist.contains("Ice"));
	  System.out.println("");
   }      
   
}