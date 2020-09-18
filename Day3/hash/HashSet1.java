package hash;

import java.util.HashSet;

public class HashSet1 {
public static void main(String[] args) {
	HashSet<String> h1=new HashSet<String>();
	h1.add("abhinav");
	h1.add("abhi");
	h1.add("sri");
	h1.add("avi");
	
	h1.add("abhi");//if we add duplicate element it will be overwritten
	System.out.println(h1);
	
	//clear() to remove all elements
	
	
	//copy one set to anothe
	HashSet<String> h2= new HashSet<String>(h1);
    System.out.println(h2);
	
}
}
