package oops;

import java.io.*;

public class strArray {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] name = new String[10];
		for (int i = 0; i < 10; i++) {
			System.out.println("Enter name number => " + (i + 1));
			name[i] = br.readLine();
		}

		for (int j = 0; j < 10; j++) {
			System.out.println("The name number => " + (j + 1) + " is " + name[j]);
		}

	}
}