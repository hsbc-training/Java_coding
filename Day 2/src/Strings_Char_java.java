
public class Strings_Char_java {
	public static void main(String [] args) {
		
		String s1 = new String("HSBC");
		String s2 = "HSBC";
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s1==s2);
		
		sum(123,3456);
		
//		char [] name= {'P','r','a','t','h','a','m'};
//		String namestring = new String(name);
//		System.out.println("namestring");
//		int len = namestring.length();
//		System.out.println("length of name is " + len);
//		System.out.println("Phrase : "+ namestring.concat(" Sharma") + " is learning java");
//		
//		
//		float floatVar=15.0f;
//		int intVar = 29;
//		String stringVar="hello";
//		
//		System.out.printf("The value of the float variable is " +
//                "%f, while the value of the integer " +
//                "variable is %d, and the string " +
//                "is %s \n", floatVar, intVar, stringVar);
//		
//		String fs;
//		fs = String.format("The value of the float variable is " +
//		                   "%f, while the value of the integer " +
//		                   "variable is %d, and the string " +
//		                   "is %s", floatVar, intVar, stringVar);
//		System.out.println(fs);
	}
	
	static int sum(int a, int b) {
		return a+b;
	}
}
