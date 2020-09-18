package Day1;
import java.io.*;
public class copyfile {
	public static void main(String args[]) throws IOException {  
	      FileInputStream in = null;
	      FileOutputStream out = null;
          try {
	         in = new FileInputStream("input.txt");
	         out = new FileOutputStream("output.txt"); 
	         int c;
	         while((c = in.read()) != -1) {
	        	 if((char)c=='a')//if we want to copy to output file without a
	        		 continue;
	        	
	        	 System.out.println((char)c);
	          out.write(c);
	         }
	      }
	       finally{
	         if(in != null){
	            in.close();
	         }
	         if(out != null){
	            out.close();
	         }
	        }
	   }

}
