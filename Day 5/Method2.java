package pack1;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
public class Method2 {
public static void main(String[] args)  {
	FileInputStream fis=null;
	try {
	fis=new FileInputStream("myfile.txt");
	}catch(FileNotFoundException fnfe) {
		System.out.println("The specific file is not present in the given path");
	}
	int k;
	try {
		while((k=fis.read())!=-1) {
			System.out.print((char)k);
		}
		fis.close();
	}catch(IOException ioe) {
		System.out.println("IO error occured"+ioe);
	}
}
}
