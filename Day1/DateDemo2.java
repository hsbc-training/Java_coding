package Day1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo2 {
	
	 public static void main(String args[]) {
	      Date dNow = new Date( );
	      SimpleDateFormat ft = 
	      new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a zzz");

	      System.out.println("Current Date: " + ft.format(dNow));
	   }

/*public static void main(String args[]) {
	Date dt=new Date();
	SimpleDateFormat ft=new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss at zzz");
	System.out.println("current date: "+ft.format(dt));
}*/
}
