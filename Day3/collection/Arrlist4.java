
  package collection;
  
  import java.util.ArrayList; import java.util.Collections;
  
  public class Arrlist4 { public static void main(String args[]){
  ArrayList<student> arraylist = new ArrayList<student>();
  arraylist.add(new student(10,"Chaitanya", 223)); 
  arraylist.add(new student(20,"Rahul", 245));
  arraylist.add(new student(50,"Ajeet", 209));
  
  Collections.sort(arraylist);
  
  for(student str: arraylist){ System.out.println(str); } } }
 