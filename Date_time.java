import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_time {
	public static void main(String args[])
	{
		Date date=new Date();
		System.out.println(date.toString());
		SimpleDateFormat ft=new SimpleDateFormat("'Today is' E 'on' yyyy.MM.dd 'at' hh:mm:ss a zzz");
		System.out.println("Curret date: " + ft.format(date));
		
		String str=String.format("Current date/time: %tc", date);
		System.out.println(str);
	}
}
