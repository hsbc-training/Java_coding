import java.awt.List;
import java.util.ArrayList;

public class ArrayListExample {
	
	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("Hema");
		arr.add("Happy");
		arr.add("Jiya");
		arr.add("Zoya");
		arr.add("Manav");
		System.out.println("Original List"+arr);
		
		//creating sublist
		ArrayList<String> sublist = new ArrayList<String>(arr.subList(1, 3));
		System.out.println(" SubList"+sublist);
		
		//Check whether element exists
		System.out.println("ArrayList contains the string 'Hema': "
                +arr.contains("Hema"));
		System.out.println("ArrayList contains the string 'Jaya': "
                 +arr.contains("Jaya"));
		
	}

}
