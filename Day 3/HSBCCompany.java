package com.hsbc.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HSBCCompany {

	List<Employee> employees = createEmployeeList();

	private List<Employee> createEmployeeList() {

		List<Employee> list = new ArrayList<>();

//		for (int i = 0; i < 10; i++) {
//			Contractor  contractor = new Contractor();
//			list.add(contractor);
//		}
//		
//		for (int i = 0; i < 20; i++) {
//			HSBCStaff  hsbcStaff = new HSBCStaff();
//			list.add(hsbcStaff);
//		}
//		
//		for (int i = 0; i < 10; i++) {
//			HRStaff  hrStaff = new HRStaff();
//			list.add(hrStaff);
//		}
		
		HRDepartment.factory(10, Contractor.class, list);
		HRDepartment.factory(20, HSBCStaff.class, list);
		HRDepartment.factory(5, HRStaff.class, list);
		
		return list;
	}
	
	float calculateTotalSalary() {
		float totalSalary = 0;
		for (Iterator iterator = employees.iterator(); iterator.hasNext();) {
			Employee employee = (Employee) iterator.next();
			totalSalary += employee.getSalary();								//Polymorphism
		}
		return totalSalary;
	}
	
	public static void main(String[] args) {
		HSBCCompany company = new HSBCCompany();
		float totalSalary = company.calculateTotalSalary();
		System.out.println("Total Salary : " + totalSalary);
	}
}
