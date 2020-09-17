package com.hsbc.model;

public class HRDepartment {
	
	public static List<Employee> factory(int number ,  Class employeeType , List<Employee> employees){
		for(int i=0 ; i<10 ; i++)
		{
			Employee contractor = Class.forName(employeeType.getName()).newInstance();
			list.add(Contractor);
		
		}
	}

}
