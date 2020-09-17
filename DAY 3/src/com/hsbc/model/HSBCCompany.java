package com.hsbc.model;

import java.util.*;

public class HSBCCompany {
	List<Employee> employees = createEmployeeList();
	
	

	private List<Employee> createEmployeeList() {
		List<Employee> list = new ArrayList<>();
		HRDepartment.factory(10, Contractor.class, list);
		HRDepartment.factory(10, HSBCStaff.class, list);
		HRDepartment.factory(100, HRStaff.class, list);
		
		return list;
	}
	
	float calculateTotalSalary() {
		float totalSalary=0.0f;
		for(Iterator iterator = employees.iterator(); iterator.hasNext();) {
			Employee employee = (Employee) iterator.next();
			totalSalary=totalSalary + employee.getSalary();
		}
		return totalSalary;
	}
	
	public static void main(String[] args) {
		HSBCCompany company = new HSBCCompany();
		float totalSalary = company.calculateTotalSalary();
		System.out.println(totalSalary);
		
	}
}
