//serialization
package userdefinedexception;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
public class sendClass {
public static void main(String[] args) {
	Stud obj=new Stud(101,25,"Alibaba","Egypt",5);
	try {
		FileOutputStream fos=new FileOutputStream("Stud.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(obj);
		oos.close();
		fos.close();
		System.out.println("Serialization done");
	}catch(IOException ioe) {
		System.out.println(ioe);
	}
}
}
