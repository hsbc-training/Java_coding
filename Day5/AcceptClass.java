import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
public class AcceptClass {
public static void main(String[] args) {
	Student o=null;
	try {
		FileInputStream fis=new FileInputStream("Student.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		o=(Student) ois.readObject();
		ois.close();
		fis.close();
	}
	catch(IOException ioe) {
		ioe.printStackTrace();
		return;
		
	}
	catch(ClassNotFoundException cnf) {
		System.out.println("Student class is not found");
		cnf.printStackTrace();
		return;
	}
	System.out.println("Student Name:"+o.getStuName());
	System.out.println("Student Age:"+o.getStuAge());
	System.out.println("Student Height:"+o.getStuHeight());
	System.out.println("Student Address:"+o.getStuAddress());
	System.out.println("Student Roll number:"+o.getStuRollNum());
}
}
