import java.util.*;
import java.util.Collections;

public class arrayList {
 public static void main(String[] args) {
	 ArrayList<String> alist=new ArrayList<String>();  
     alist.add("Steve");
     alist.add("Tim");
     alist.add("Lucy");
     alist.add("Pat");
     alist.add("Angela");
     alist.add("Tom");
     System.out.println("Original list:"+alist);
     System.out.println("total names:"+ alist.size());
     alist.add(0, "Mauli"); // adding at particular index
     System.out.println("After updating 0th index"+alist);
     alist.remove("Tim"); // removing a name
     System.out.println("After removing Tim"+alist);
     System.out.println("total names after removing operation:"+ alist.size());
     for(String s: alist)
    	 System.out.println("name is:"+s);
     //sorting operation
     Collections.sort(alist);
     ArrayList<Integer> numbers = new ArrayList<Integer>() {{
    	 add(23);
    	 add(10);
    	 add(12);
    	 add(4);
     }};
     Collections.sort(numbers);
     //using iterator loop
     System.out.println("Iterator");
     Iterator iter = numbers.iterator();
     while (iter.hasNext()) {
        System.out.println(iter.next());
     }
     //using enumeration
     ArrayList<Integer> numlist = new ArrayList<Integer>() {{
    	 add(45);
    	 add(15);
    	 add(34);
    	 add(49);
     }};
     Enumeration<Integer> e = Collections.enumeration(numlist);
     while(e.hasMoreElements())
     {
    	 System.out.println(e.nextElement());
     }
     Collections.sort(numlist,Collections.reverseOrder());
     numlist.addAll(numbers);
     System.out.println(numlist); //adding both int array list in one
     numlist.addAll(0,numbers); //adds numbers list at start i.e. 0th index
     System.out.println(numlist);
     //removing from particular index
     numlist.remove(0);
     System.out.println(numlist);
     //make a sublist
     List<Integer> subList = numlist.subList(3, 6);
     System.out.println(subList);
     //first occurance
     System.out.println(numlist.indexOf(10));
     //last occurance of any number
     //checking if the element is there or not
     System.out.println(alist.contains("shiv"));
     System.out.println(numlist.lastIndexOf(10));
     //get element from arrayList
     System.out.println(alist.get(2));
//======================================================
//==============sorting students data===================
//======================================================
     System.out.println("==========STUDENT'S DATA=========");
 	 //comparable
     ArrayList<stucomparable> studentData1 = new ArrayList<stucomparable>();
 	 studentData1.add(new stucomparable(45, "Mauli", 21));
 	 studentData1.add(new stucomparable(44, "Shivam", 20));
 	 studentData1.add(new stucomparable(48, "Lipsa", 22));
 	 studentData1.add(new stucomparable(52, "Rose", 21));
 	 
 	 Collections.sort(studentData1);
 	 for(stucomparable s: studentData1)
 		 System.out.println(s);
 	 
 	 //comparator
 	 ArrayList<student> studentData = new ArrayList<student>();
 	 studentData.add(new student(45, "Mauli", 21));
 	 studentData.add(new student(44, "Shivam", 20));
 	 studentData.add(new student(48, "Lipsa", 22));
 	 studentData.add(new student(52, "Rose", 21));
 	 studentData.add(2, new student(50, "Rommy", 23)); //adding at particular index
 	 Collections.sort(studentData, student.StuRollno);
 	 System.out.println(studentData);
 	 Collections.sort(studentData, student.nameCompare);
 	 System.out.println(studentData);
 	 Collections.sort(studentData, student.compareAge);
 	 System.out.println(studentData);
}
}
