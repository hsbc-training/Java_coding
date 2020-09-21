import java.util.regex.*;

public class RegularPattern {
	
	/*public static void main(String[] args) 
    { 
        // create a REGEX String 
        String REGEX = ".*vishnu.*"; 
  
        // creare the string 
        // in which you want to search 
        String actualString 
            = "www.geeksforgeeks.org"; 
  
        // compile the regex to create pattern 
        // using compile() method 
        Pattern pattern = Pattern.compile(REGEX); 
  
        // get a matcher object from pattern 
        Matcher matcher = pattern.matcher(actualString); 
  
        // check whether Regex string is 
        // found in actualString or not 
        boolean matches = matcher.matches(); 
  
        System.out.println("actualString "
                           + "contains REGEX = "
                           + matches); 
    }*/
	public static void main(String args[]){
		String n = "This order 77878 was placed for QT OK?";
		String pattern = "(.*)(\\d+)(.*)";
		String test = "(.*)(\\d)(.*)";
		
		Pattern r = Pattern.compile(pattern);
		Pattern r1 = Pattern.compile(test);
		
		Matcher m1 = r1.matcher(n);
		Matcher m = r.matcher(n);
		
		boolean matches  = m1.matches();
		
		System.out.println( m1.group(3));
		
		if(m.find()){
			System.out.println("Found value " + m.group(0));
			System.out.println("Found value " + m.group(1));
			System.out.println("Found value " + m.group(2));
		}else{
			System.out.println("No Match");
		}
	}
}
