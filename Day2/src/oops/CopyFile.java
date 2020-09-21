package oops;

import java.io.*;

public class CopyFile {

	public static void main(String args[]) throws IOException {
		FileInputStream in = null;
		FileOutputStream out = null;
		int a = 0;
		String str;
//		int i = 0;

		try {
			in = new FileInputStream("input.txt");
			out = new FileOutputStream("output.txt");

			int c;
			while ((c = in.read()) != -1) {
				a++;
				System.out.print((char)c);
//				char c=(char)i;
				out.write(c);
			}
//			for(int j=a;j>0;j++) {
//				str=s
//			}
			System.out.println(a);
		} finally {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}
		}
	}
}