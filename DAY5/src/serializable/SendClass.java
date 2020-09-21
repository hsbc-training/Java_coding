package serializable;

import java.io.*;
public class SendClass {
	 public static void main(String args[])
	  {
	    Student obj = new Student(1, 25, "Chaitanya", "Agra", 6);
	    try
	    {
	    	FileOutputStream fos=new FileOutputStream("Student.ser");
	    	ObjectOutputStream oos=new ObjectOutputStream(fos);
	    	oos.writeObject(obj);
	    	oos.close();
	    	fos.close();
	    	System.out.println("Serialization done!");
	    }
	    catch(IOException e)
	    {
	    	System.out.println(e);
	    }
}
}