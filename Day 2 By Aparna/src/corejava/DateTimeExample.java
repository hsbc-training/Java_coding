package corejava;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeExample {
	
	public static void main(String[] args) {
		
		// Creating Date object
		Date date = new Date();
		System.out.println("\nToday's Date  with Default Format :"+date.toString());
		
		// Applying Format to The Date
		SimpleDateFormat newFormat = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
		System.out.println("Format 1: "+newFormat.format(date));
		
		// Date Formatting Using Printf
		System.out.printf("%1$s %2$tB %2$td, %2$tY", "Format 2:", date);
		
		
	}

}
