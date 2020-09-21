package loop;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTime {

	public static void main(String[] args) {

		Date date = new Date();
		System.out.println(date.toString());

		SimpleDateFormat ft = new SimpleDateFormat("E dd/MM/yyyy 'at' HH:mm:ss a zzz");
		System.out.println("Current Date: "+ ft.format(date));

		String str = String.format("Current Date/Time :  %tc", date);
		System.out.println(str);

		System.out.printf("%1$s %2$tB %2$td, %2$tY", "Due date:", date);

		System.out.println("\nThread");
		try {
			System.out.println(new Date()+"\n");
			Thread.sleep(5*60*10);
			System.out.println(new Date()+"\n");
		} catch (Exception e) {
			System.out.println("Got an exception!");
		}
		
		try {
	         long start = System.currentTimeMillis( );
	         System.out.println(new Date( ) + "\n");
	         
	         Thread.sleep(5*60*10);
	         System.out.println(new Date( ) + "\n");
	         
	         long end = System.currentTimeMillis( );
	         long diff = end - start;
	         System.out.println("Time Difference is : " + diff);
	      } catch (Exception e) {
	         System.out.println("Got an exception!");
	      }
	}

}
