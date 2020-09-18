package string;

public class string_functions {

	public static void main(String[] args) {
		String s1 = "Live life full of adventures";
		String s2 = ".Enjoy it all";
	      char result = s1.charAt(8);
	      System.out.println(result);
	      
	      String s3=s1.concat(s2);
	      System.out.println(s3);
	      
	      int res=s1.compareTo(s2);
	      System.out.println(res);
	      
	      int len=s1.length();
	      System.out.println("Length of string s1:"+len);

	}

}
