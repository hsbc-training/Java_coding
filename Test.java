package interfaces;
public class Test {

   public static void main (String args[]) {
      char[] helloArray = { 'h', 'e', 'l', 'l', 'o', '.' };
      String helloString = new String(helloArray);  
      System.out.println( helloArray );
      int len = helloString.length();
      System.out.println("Length of string is : "+len);  		  
   }
}