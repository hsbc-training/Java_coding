package iterators;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationExample {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>(); 
		for (int i = 0; i < 10 ; i++) {
			v.addElement(i);
		}
		System.out.println(v);
		
		Enumeration e = v.elements();
		
		while(e.hasMoreElements()) {
			int i = (int)e.nextElement();
			System.out.println(i);
		}
	}

}
