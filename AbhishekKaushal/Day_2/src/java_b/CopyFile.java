package java_b;
import java.io.*;
public class CopyFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream in = null;
		FileOutputStream out = null;
		
		try 
		{
			in = new FileInputStream("C:\\Users\\asus\\Documents\\input.txt");
			out = new FileOutputStream("C:\\Users\\asus\\Documents\\output.txt");
			
			int c;
			String str="";
			while((c = in.read())!=-1)
			{
//				if((char)(c) == 'a')
//				{
//					continue;
//				}
				str = str+c;
				out.write(c);
			}
//			StringBuffer sb=new StringBuffer(str);
//			sb.reverse();
//			out.write(sb.toString().getBytes());
		}
		finally {
			if(in!=null)
			{					
				 in.close();
			}
			if(out!=null)
			{					
				out.close();
			}
			}
		
	}

}
