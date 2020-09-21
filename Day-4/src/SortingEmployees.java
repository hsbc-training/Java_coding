import java.util.ArrayList;
	import java.util.Collections;
	import java.util.List;

public class SortingEmployees {
	
		public static void main(String[] args) {
			ArrayList<Employee> list = new ArrayList<Employee>();
			
			list.add(new Employee(12,"Vishnu"));
			list.add(new Employee(2,"Gopal"));

			Collections.sort(list);
			
			for (Employee emp : list) {
				System.out.println(emp.getName()+ " " + emp.getId());	
			}
		}
	}


