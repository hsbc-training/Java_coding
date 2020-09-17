package Day2_loopstring;

public class Stringfxn {
 
	public static void main(String[] args)
	{
		char[] helloArray = { 'h', 'e', 'l', 'l', 'o', '.' };
	      String helloString = new String(helloArray);  
	      System.out.println( helloString );
	   
	
		String s="Aditi Gupta";
		
		int l=s.length();//length
		System.out.println(l);
		
		char a= s.charAt(5);//character
		System.out.print(a);
		
	    String s2="Hello";
	    System.out.print(s.concat(s2));
	    
	    
		
	}
}
