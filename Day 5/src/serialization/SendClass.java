package serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SendClass {
	
	public static void main(String[] args) {
		Student obj = new Student(10, 20, "Rita", "Odisha", 30);
		try{ 
		      FileOutputStream fos = new FileOutputStream("Student.ser"); 
		      ObjectOutputStream oos = new ObjectOutputStream(fos);
		      oos.writeObject(obj);
		      oos.close();
		      fos.close();
		      System.out.println("Serialzation Done!!");
		   }catch(IOException ioe){
		      System.out.println(ioe);
		    }
	}

}
