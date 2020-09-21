import java.io.*;

public class FileIO {
	public static void main(String [] args) throws IOException{
		FileInputStream in = null;
		FileOutputStream out = null;
		
		try {
			in = new FileInputStream("input.txt");
			out = new FileOutputStream("output.txt");
			
			int c;
			char [] line= new char[30]; 
			int i=0;
//			String line = new String();
			while((c=in.read())!=-1) {
				
				line[i]=(char)c;
				i=i+1;
//				System.out.print((char)c);
//				if ((char)c=='a'){
//					continue;
//				}
				
//				out.write(c);
			}
//			System.out.println(i);
			char [] revline = new char[i];
			
			System.out.println(line);
		}
		finally {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}
			
		}
	}
}
