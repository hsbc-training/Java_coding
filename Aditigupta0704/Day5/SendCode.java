package Day5;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SendCode {

	public static void main(String[] args) {
		
		SerializationDemo s = new SerializationDemo(01, 22, "Aditi","Agra",6);
		try {
			FileOutputStream fs = new FileOutputStream("SerializationDemo.sr");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(s);
			fs.close();
			os.close();
			System.out.println("Serialzation Done");
		}

		catch (IOException e) {
			System.out.println(e);
		}
	}

}
