package Hash_Set;
import java.util.*;
public class Hashmap {
	public static void main(String[]args)
	{
	 HashMap<Integer, String> hmap = new HashMap<Integer, String>();

     /*Adding elements to HashMap*/
     hmap.put(12, "Chaitanya");
     hmap.put(2, "Rahul");
     hmap.put(7, "Singh");
     hmap.put(49, "Ajeet");
     hmap.put(3, "Anuj");
     hmap.put(5,"Pooja");
     
     Set set = hmap.entrySet(); //entry set of key-value pair
     Iterator iterator = set.iterator();  //set iterator to it
     while(iterator.hasNext()) {
        Map.Entry mentry = (Map.Entry)iterator.next(); //traverse iterator through the entries
        System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
        System.out.println(mentry.getValue());
     }
     
     String var= hmap.get(2);
     System.out.println("Value at index 2 is: "+var); //get value based on index
     
     hmap.remove(3); //remove value based on index
     System.out.println("Map key and values after removal:"); 
     
     Set set2 = hmap.entrySet();
     Iterator iterator2 = set2.iterator();
     while(iterator2.hasNext()) {
         Map.Entry mentry2 = (Map.Entry)iterator2.next();
         System.out.print("Key is: "+mentry2.getKey() + " & Value is: ");
         System.out.println(mentry2.getValue());
      }
}
}