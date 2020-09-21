
public class Task4 {
	 public static void main(String args[]) {
		 char[] helloArray = { 'h', 'e', 'l', 'l', 'o', '.' };
	     String sc = new String(helloArray);  
	     System.out.println( sc );
		 String checked = "Hello World";
	      int len = checked.length();
	      System.out.println( "String Length is : " + len );
	      String string1 = " Code for ";
	      System.out.println("This is " + string1 + "Day 2");
	      String fs;
	      float floatVar=10.0F;
	      int intVar=5;
	      String stringVar="ABC";
	      
	      fs = String.format("The value of the float variable is " +
	                         "%f, while the value of the integer " +
	                         "variable is %d, and the string " +
	                         "is %s", floatVar, intVar, stringVar);
	      System.out.println(fs);
	 }
}
