package SerializationPractice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {
	public static void main(String[] args) {
		//Serialization of a student object
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
		    
		//De-Serialization of the saved object
	    Student o=null;
	    try{
	      FileInputStream fis = new FileInputStream("Student.ser");
	      ObjectInputStream ois = new ObjectInputStream(fis);
	      o = (Student)ois.readObject();
	      ois.close();
	      fis.close();
	    }
	    catch(IOException ioe)
	    {
	       ioe.printStackTrace();
	       return;
	    }catch(ClassNotFoundException cnfe)
	     {
	       System.out.println("Student Class is not found.");
	       cnfe.printStackTrace();
	       return;
	     }
	    System.out.println("Student Name:"+o.getStuName());
	    System.out.println("Student Age:"+o.getStuAge());
	    System.out.println("Student Roll No:"+o.getStuRollNum());
	    System.out.println("Student Address:"+o.getStuAddress());
	    System.out.println("Student Height:"+o.getStuHeight());
	}
}

