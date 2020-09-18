package com.hsbc.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//10-contractor, 20=staff
public class HSBCCompany {
	List<Employee> employees = createEmployeeList();

	List<Employee> createEmployeeList() {
		List<Employee> list = new ArrayList<>();
		HRDepartment.factory(10, Contractor.class, list); 
		HRDepartment.factory(20, HSBCStaff.class, list); 
		HRDepartment.factory(5, HRStaff.class, list); 
		return list;
	}

	float calculateTotalSalary() {
		float totalSalary = 0;
		for (Iterator iterator = employees.iterator(); iterator.hasNext();) {
			Employee employee = (Employee) iterator.next();
			totalSalary = totalSalary + employee.getSalary();//polymorphism
//			System.out.println(totalSalary);
		}
		return totalSalary;
	}

	public static void main(String[] args) {
		HSBCCompany company = new HSBCCompany();
		float totalSalary = company.calculateTotalSalary();
		System.out.println(totalSalary);
	}
}
