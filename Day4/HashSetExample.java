import java.util.*;
public class HashSetExample {
   public static void main(String args[]) {
      // HashSet declaration
      HashSet<String> hset = 
               new HashSet<String>();

      // Adding elements to the HashSet
      hset.add("Apple");
      hset.add("Mango");
      hset.add("Grapes");
      hset.add("Orange");
      hset.add("Fig");
      //Addition of duplicate elements
      hset.add("Apple");
      hset.add("Mango");
      //Addition of null values
      hset.add(null);
      hset.add(null);

      //Displaying HashSet elements
      System.out.println(hset);
      
      //clearing the whole hashset
      //hset.clear();
      //System.out.println(hset);
      
      //Iterating over
      System.out.println("Using Iterator:");
      Iterator <String> i=hset.iterator();
      while(i.hasNext()) {
    	  System.out.println(i.next());
      }
      
      //iterating using for
      System.out.println();
      System.out.println("Using For:");
      for(String temp:hset) {
    	  System.out.println(temp);
      }
      //Converting Hastset to array
      System.out.println();
      String[] array1=new String[hset.size()];
      hset.toArray(array1);
      System.out.println("Array:");
      for(String s:array1)
      {System.out.println(s);}
      
      //Converting to treeset
  System.out.println(hset); 
  hset.remove(null);
  System.out.println(hset);
      System.out.println();
      Set<String> tset = new TreeSet<String>(hset);
      
      System.out.println("TreeSet contains: ");
      for(String temp : tset)
         System.out.println(temp);
         
      // Creating a List of HashSet elements
      List<String> list = new ArrayList<String>(hset);
      System.out.println("ArrayList contains: "+ list);
      
      //cloning
      HashSet<String> h2=new HashSet<String>();
      h2=(HashSet<String>)hset.clone();
      System.out.println(h2);
      }
    }

