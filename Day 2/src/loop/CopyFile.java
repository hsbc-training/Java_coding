package loop;
import java.io.*;
import java.util.*;

public class CopyFile {

	public static void main(String args[]) throws IOException { 
		
		FileInputStream in = new FileInputStream("input.txt");
		FileOutputStream out = new FileOutputStream("output.txt");

		List<Integer> list = new ArrayList<>();
		try{
			int c;
			while((c = in.read())!= -1) {
//				System.out.print((char)c);
//				if(c==97)
//					continue;
//				list.add(c);
//				Collections.reverse(list);
//				for (Integer integer : list) {
					out.write(c);
				}
				//out.write(c);
			}
		finally {
			if (in != null) {
				in.close();
			}
			
			if (out != null) {
				out.close();
			}
		}
		System.out.println(list.toString());

	}
}