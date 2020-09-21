package oops;

import java.io.*;

public class ReadConsole {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter characters, 'q' to quit.");

		char ch = 0;

		 while (ch != 'q'){
			ch = (char) br.read();
			System.out.print(ch);
		}
		System.out.print(" Rejected");
	}
}