package days_2_work;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regular_expersion {
	public static void main(String args[]) {
		String line = "This order was placed for QT300! ok ?";
		String pattern = "(.*)(\\d+)(.*)";
		
		// create a patter object
		Pattern r = Pattern.compile(pattern);
		
		//now create matcher object 
		Matcher m = r.matcher(line)	;
		
		if(m.find( )) {
			System.out.println("found value: "+m.group(0));
			System.out.println("found value: "+m.group(1));
			System.out.println("found value: "+m.group(1));
		}
		else {
			System.out.println("No match");
		}
	}

}
