import java.util.Date;
import java.util.*;
import java.text.*;
public class Task6 {
	public static void main(String args[]) {
		Date date =new Date();
		System.out.println(date.toString());
		String str = String.format("Current Date/Time : %tc", date );
		System.out.printf(str);
		Date dates = new Date();
	    System.out.printf("%1$s %2$tB %2$td, %2$tY", "Due date:", dates);
	}
	
}
