package Day2_loopstring;


import java.text.*;
import java.util.Date;
public class Date2 {

   public static void main(String args[]) {
      
      Date date = new Date();

      
      System.out.println(date.toString());
      
      SimpleDateFormat ft = 
      new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a zzz");

      System.out.println("Current Date: " + ft.format(date));
   }
}