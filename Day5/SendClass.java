import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
public class SendClass {
public static void main(String[] args) {
	Student obj=new Student(101,25,"Chaitnya","Agra",6);
	try {
		FileOutputStream fos =new FileOutputStream("Student.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(obj);
		oos.close();
		fos.close();
		System.out.println("Serialization Done!!");
	}
	catch(IOException ioe){
		System.out.println(ioe);
		
	}
}
}
