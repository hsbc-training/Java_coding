
import java.util.*;
public class Student_arraylist {

	public static void main(String[] args) {
		ArrayList <Student_array> s = new ArrayList<Student_array>(); //ArrayList of objects
        s.add(new Student_array(5,"Riya",23));  //added objects
        s.add(new Student_array(7,"Hitesh",25));
        s.add(new Student_array(8,"Raunak",21));
        s.add(new Student_array(2,"Samiha",22));

        Collections.sort(s);
        System.out.println("List after sorting: ");
        for(Student_array str: s){
			System.out.println(str);
	   }
        
	}

}
