package com.hsbc.model;

import java.util.List;

public class HRDepartment {
	public static void factory(int number, Class emplyeeType, List<Employee> employees){
		
		for (int i = 0; i < number; i++) {
			try {
				Employee contractor;
				contractor = (Employee) Class.forName(emplyeeType.getName()).newInstance();
				employees.add(contractor);
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
		
	}
}
