package java_b;

import java.util.ArrayList;
import java.util.List;

public class AddMethodExample {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
	       al.add("Hi");
	       al.add("hello");
	       al.add("String");
	       al.add("Test");
	       al.add(3,"Howdy");

	       System.out.println("Elements after Howdy:"+ al);
	       al.add(0, "Bye");

	       System.out.println("Elements after bye:"+ al);
	       
	       ArrayList<String> a2 = new ArrayList<String>();
	       a2.add("text1");
	       a2.add("text2");
	       a2.add("text3");
	       a2.add("text4");
	       
	       System.out.println("a2 is "+ a2 );
	       al.addAll(a2);
	       System.out.println("Combined List"+al);
	       
	       ArrayList<String> a3 = new ArrayList<String>();
	       a3.add("Text 5");
	       a3.add("Text 6");
	       a2.addAll(2,a3);
	       System.out.println("Combined a2 and a3: "+a2);
	       
	       al.remove(3);
	       al.remove(2);
	       System.out.println("After removing 2 elements"+al);
	       
	       al.remove("text4");
	       System.out.println("After removing text4"+al);
	       
	       
	       ArrayList<String> subl = new ArrayList<String>(al.subList(1, 5));
	       System.out.println("Sublist from al"+subl);
	       
	       List<String> li = al.subList(2, 6);
	       System.out.println("Sublist from al"+li);
	       
	       
	       ArrayList<String> list = new ArrayList<String>();
	       list.add("pen");
	       list.add("pencil");
	       list.add("ink");
	       list.add("notebook");
	       list.add("book");
	       list.add("books");
	       list.add("paper");
	       list.add("white board");

	       System.out.println("First element of the ArrayList: "+list.get(0));
	       System.out.println("Third element of the ArrayList: "+list.get(2));
	       System.out.println("Sixth element of the ArrayList: "+list.get(5));
	       System.out.println("Fourth element of the ArrayList: "+list.get(3));
	       
	       System.out.println("Index of notebook: "+list.indexOf("notebook"));
	       System.out.println("Index of books: "+list.indexOf("books"));
	       System.out.println("Index of book: "+list.indexOf("book"));
	       System.out.println("Index of ink: "+list.indexOf("ink"));
	       //System.out.println(list.indexOf("xx"));
	       
	       list.add("ink");
	       System.out.println("List is:"+list);
	       System.out.println("First occurence of ink:"+list.indexOf("ink"));
	       System.out.println("First occurence of ink:"+list.lastIndexOf("ink"));
	       System.out.println("First occurence of book:"+list.indexOf("book"));
	       
	       System.out.println("List contains eraser:"+list.contains("eraser"));
	       System.out.println("List contains ink:"+list.contains("ink"));
	       System.out.println("List contains pen:"+list.contains("pen"));
	       System.out.println("List contains pens:"+list.contains("pens"));
	       
	       ArrayList<Integer> numli = new ArrayList<Integer>();
	       numli.add(1);
	       numli.add(99);
	       numli.add(56);
	       numli.add(13);
	       numli.add(44);
	       numli.add(6);

	       System.out.println("'1' is present in arraylist: "+numli.contains(1));
	       System.out.println("'55' is present in arraylist: "+numli.contains(55));
	       System.out.println("'44' is there in arraylist: "+numli.contains(44));
	       System.out.println("'7' is there in arraylist: "+numli.contains(7));
	}

}
