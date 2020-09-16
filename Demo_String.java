
public class Demo_String {
public static void main(String args[])
{ char[] helloArray= {'h','i'};
	String helloS= new String(helloArray);
	System.out.println(helloS);
	
//string length
	int len=helloS.length();
	System.out.println("String length is "+len);
	
//	concatenaing strings
	String world=" World!";
	String s2=helloS.concat(world);
	System.out.println(s2);
	
	
	}
}
