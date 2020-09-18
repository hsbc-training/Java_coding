package arraylist;
import java.util.ArrayList;
import java.util.Iterator;

public class Iterating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a = new ArrayList<String>();
		a.add("w");
		a.add("x");
		a.add("y");
		a.add("z");
		
		for(String s : a) {
			System.out.println(s);
		}
		
		System.out.println(a.size());
	}

}
