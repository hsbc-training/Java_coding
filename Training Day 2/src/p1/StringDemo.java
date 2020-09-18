package p1;
import java.util.*;

public class StringDemo {
	 public static void main(String args[]) {
	      char[] pushArray = { 'P', 'u', 's', 'h', 'k', 'a', 'r' };
	      String pushString = new String(pushArray);  //creating string class object
	      System.out.println( pushString );
	      String palindrome = "Dot saw I was Tod";
	      System.out.println( "String Length is : " + palindrome.length() ); //string.length()
	     
	      
	      float floatVar = 20.0F;
	      int intVar = 18;
	      String stringVar = "Pushkar";
	      System.out.printf("Using printf: The value of the float variable is %f, and the value of the integervariable is %d, and the string is %s", floatVar, intVar, stringVar);
	      //retunrs the object of printstream class
	      String fs;
	      fs= String.format("Using format: The value of the float variable is %f, and the value of the integer variable is %d anf the string is %s", floatVar, intVar, stringVar);
	      //returns the object of the String class
	      System.out.println("\n"+fs);
	   }
	 
	 

}
