import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector vec = new Vector();
		
		vec.add(6);
		vec.add(7);
		vec.add(1);
		vec.add(3);
		vec.add(5);
		
		System.out.println(vec);
		
		List list = vec.subList(1, 3);
		
		System.out.println(list);
		
		Collections.sort(vec);
		
		System.out.println(vec);
		
		System.out.println(vec.indexOf(5));
		
		Vector vec2 = new Vector(vec);
		
		System.out.println(vec2);
		
		vec2.remove(1);
		
		System.out.println(vec2);
		
		
	}

}
