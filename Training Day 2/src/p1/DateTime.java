package p1;
import java.util.*;
import java.text.*;
public class DateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		System.out.println(date);
		
		SimpleDateFormat df = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz"); //creating new date format
		System.out.println("Current date: "+ df.format(date));
		
		String str = String.format("Current Date and Time : %tc", date); //using string class
		System.out.printf(str);
		
		System.out.printf("%1$s %2$tB %2$td, %2$tY", "\nDue Date: ", date);

	}

}
