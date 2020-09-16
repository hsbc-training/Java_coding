package second;

public class StringClass {

	public static void main(String[] args) {
		// One way of creating String
		String helloWorld = "Hello World";
		
		// Creating string from Character array
		char [] helloArray = {'h', 'e', 'l','l','o'};
		String helloString = new String(helloArray);
		System.out.println( helloString );
		
		// Printing Length of String
		String p= "Dot saw I was Tod";
	    int len = p.length();
	    System.out.println( "Length is" + len );
	    
	    String middle = "middle";
	    System.out.println("first" + middle + "third");
	    
	    // Format Strings
	    float floatV = 4F;
	    int intV = 5;
	    char charV = 'd';
	    System.out.printf("Value of Float is" + "%f, Value of int is" + "%d Value of char is" + "%c",floatV, intV, charV );

	}

}
