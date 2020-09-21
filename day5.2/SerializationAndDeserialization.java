package day5_ExceptionHandling;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

public class SerializationAndDeserialization {
	public static void main(String args[])
	  {
	    Student obj = new Student(101, 25, "Chaitanya", "Agra", 6);
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

