package day3.com.hsbc.model;

import java.util.List;

public class HRDepartment {
	public static void factory(int number, Class employeeType, List<Employee> employees) {
		for (int i=0;i<number;i++) {
			try {
				Employee contractor;
				contractor = (Employee) Class.forName(employeeType.getName()).newInstance();
				employees.add(contractor);
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
	}
}
