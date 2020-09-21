package java_b;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Method1 {
	public static void main(String args[]) throws IOException {
		FileInputStream fis = null;
		fis = new FileInputStream("C:\\Users\\asus\\Documents\\input.txt");
		int k;

		while ((k = fis.read()) != -1) {
			System.out.print((char) k);
		}
		fis.close();
	}
}
