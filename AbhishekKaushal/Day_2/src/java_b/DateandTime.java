package java_b;

import java.util.Date;
import java.text.*;

public class DateandTime {
	public static void main(String[] args) {
		Date date = new Date();
		
		System.out.println(date.toString());
		
		
		Date dNow = new Date();
		SimpleDateFormat ft = new SimpleDateFormat("E yyyy.mm.dd 'at' hh:mm:ss a zzz");
		System.out.println("Current date" + ft.format(dNow));
		
		String str = String.format("Current Date/Time: %tc", date);
		System.out.println(str);
		
		
		System.out.printf("%s %tB %<te, %<tY", "Due date:", date);
		
	}
}
