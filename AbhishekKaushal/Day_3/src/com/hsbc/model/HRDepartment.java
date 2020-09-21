package com.hsbc.model;

import java.util.List;

public class HRDepartment {
	
	public static void factory(int number, Class employeeType, List<Employee> employees)
	{
		for(int i=0;i<number;i++)
		{
			Employee contractor;
			try {
				contractor = (Employee) Class.forName(employeeType.getName()).newInstance();
				employees.add(contractor);
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
