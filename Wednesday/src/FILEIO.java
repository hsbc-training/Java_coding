import java.io.*;

import javax.swing.SortingFocusTraversalPolicy;


public class FILEIO {
	public static void main(String args[]) throws IOException{
		FileReader i = null;
		FileReader i1 = null;
		FileWriter o = null;
		
		try{
		i = new FileReader("input.txt");
		i1= new FileReader("input.txt");
		o = new FileWriter("output.txt");
		
		int c1,c;
		int l=0;
		while((c1 = i.read()) != -1){
			l++;
		}
		
		char[] rev = new char[l];
		char[] rev1 = new char[l];
		
		int m=0;
		while((c = i1.read()) != -1){
			rev[m++]=(char)c;
		}
		
		for(int k=0;k<rev.length;k++)
			rev1[k]=rev[--l];
		
		int r;
		
		for(int k=0;k<rev.length;k++){
			r = rev1[k];
			r=(char)r;
			o.write(r);
			
		}
		
		
		}finally{
			if(i!=null){
				i.close();
			}
			if(i1!=null){
				i.close();
			}
			if(o!=null){
				o.close();
			}
			if(o1!=null){
				o.close();
			}
		}
	}

}
