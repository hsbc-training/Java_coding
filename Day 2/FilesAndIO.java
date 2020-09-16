package second;
import java.io.*;
import java.util.Stack;


public class FilesAndIO {
	
	/*
	 * public static String reverseString(String s) { for(int i = 0, j = s.length()
	 * - 1; i != j ; i++ , j-- ) { char a = s.charAt(i); char b = s.charAt(j); char
	 * temp = a; a = b; b = temp;
	 * 
	 * } // String is not mutable return s; }
	 */
	
	public static StringBuilder reverse(StringBuilder sb) {
		Stack<Character> myStack = new Stack<Character>();
		for(int i = 0; i < sb.length(); i++) {
			myStack.push(sb.charAt(i));
		}
		StringBuilder ab = new StringBuilder();
		
		return ab;
	}

	public static void main(String[] args) throws IOException {
		FileInputStream in= null;
		FileOutputStream out= null;

		StringBuilder str = new StringBuilder(); 
		
		try {
			in = new FileInputStream("input.txt");
			out = new FileOutputStream("output.txt");
			
			int c;
			while((c=in.read()) != -1) {
				out.write(c);
				str.append(c);
			}
		} finally {
			if(in != null) {
				in.close();
			}
			if(out != null) {
				out.close();
			}
		}
		System.out.println(str);
		for(int i = 0; i < str.length() ; i++) {
			if(str.charAt(i)=='a') {
				str.deleteCharAt(i);
			}
		}
		System.out.println(str.reverse());
		
	}

}
