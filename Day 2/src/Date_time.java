import java.util.Date;
import java.text.*;

public class Date_time {
	public static void main(String[] args) {
		Date date =  new Date();
		System.out.println(date.toString());
		
		Date date1 = new Date(999999999);
		System.out.println(date1.toString());
		
		Date dNow = new Date( );
	      SimpleDateFormat formatdate = 
	      new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a zzz");

	      System.out.println("Current Date: " + formatdate.format(dNow));
	}
}
