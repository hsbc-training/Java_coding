package oops;
import java.util.Calendar;
import java.util.Formatter;

public class DateTimeConcept {
	public static void main(String args[]) {
	      Formatter fmt = new Formatter();
	      Calendar cal = Calendar.getInstance();
	      fmt = new Formatter();
	      fmt.format("%tc", cal);
	      System.out.println(fmt);
	   }

}
