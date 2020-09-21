package java_b;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class AcceptClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student o = null;
		try {
			FileInputStream fis = new FileInputStream("Student.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			o = (Student) ois.readObject();
			ois.close();
			fis.close();
		} catch (IOException ioe) {
			ioe.printStackTrace();
			return;
		} catch (ClassNotFoundException cnfe) {
			System.out.println("Student Class is not found.");
			cnfe.printStackTrace();
			return;
		}
		
		System.out.println("Student Name:"+o.getStuName());
	    System.out.println("Student Age:"+o.getStuAge());
	    System.out.println("Student Roll No:"+o.getStuRollnumber());
	    System.out.println("Student Address:"+o.getStuAddress());
	    System.out.println("Student Height:"+o.getStuHeight());
	}

}
