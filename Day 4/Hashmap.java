import java.util.*;
public class Hashmap {
public static void main(String[] args) {
	HashMap<Integer,String> begin=new HashMap<Integer,String>();
	begin.put(7,"Ash");
	begin.put(11,"Pikachu");
	begin.put(5,"Zapdos");
	begin.put(13,"Treeko");
	begin.put(3,"Ditto");
	//Display using content Iterator
	Set set =begin.entrySet();
	Iterator it=set.iterator();
	while (it.hasNext()) {
		Map.Entry mentry=(Map.Entry) it.next();
		System.out.println("key is:"+mentry.getKey()+"  value is: ");
		System.out.println(mentry.getValue());
	}
	String var= begin.get(2);
    System.out.println("Value at index 2 is: "+var);

    /* Remove values based on key*/
    begin.remove(3);
    System.out.println("Map key and values after removal:");
    Set set2 = begin.entrySet();
    Iterator iterator2 = set2.iterator();
    while(iterator2.hasNext()) {
        Map.Entry mentry2 = (Map.Entry)iterator2.next();
        System.out.print("Key is: "+mentry2.getKey() + " & Value is: ");
        System.out.println(mentry2.getValue());
     }
}
}
