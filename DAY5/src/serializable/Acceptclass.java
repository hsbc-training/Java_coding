package serializable;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Acceptclass {
	 public static void main(String args[])
	 {
	    Student o=null;
	    try
	    {
	    	FileInputStream fs=new FileInputStream("Student.ser");
	    	ObjectInputStream os=new ObjectInputStream(fs);
	    	o=(Student)os.readObject();
	    	os.close();
	    	fs.close();
	    }
	    catch(IOException ie)
	    {
	    	ie.printStackTrace();
	    	return;
	    }
	    catch(ClassNotFoundException c)
	    {
	    	System.out.println("Student Class is not found.");
	    	c.printStackTrace();
	    	return;
	    }
	    System.out.println("Student Name:"+o.getStuName());
	    System.out.println("Student Age:"+o.getStuAge());
	    System.out.println("Student Roll No:"+o.getStuRollNum());
	    System.out.println("Student Address:"+o.getStuAddress());
	    System.out.println("Student Height:"+o.getStuHeight());
}
}