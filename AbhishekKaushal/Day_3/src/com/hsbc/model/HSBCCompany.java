package com.hsbc.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HSBCCompany {
	List<Employee> employees = createEmployeeList();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HSBCCompany hsbccompany = new HSBCCompany();
		System.out.println(hsbccompany.calculateTotalSalary());
		
	}
	private List<Employee> createEmployeeList() {
		// TODO Auto-generated method stub
		List<Employee> list = new ArrayList<>();
		HRDepartment.factory(10, Contractor.class, list);
		HRDepartment.factory(20, HSBCStaff.class, list);
		HRDepartment.factory(5, HRStaff.class, list);
//		for(int i=0;i<10;i++)
//		{
//			Contractor contractor=new Contractor();
//			list.add(contractor);
//		}
//		for(int i=0;i<10;i++)
//		{
//			HSBCStaff hsbcstaff=new HSBCStaff();
//			list.add(hsbcstaff);
//		}
//		
//		for(int i=0;i<4;i++)
//		{
//			HRStaff hrstaff=new HRStaff();
//			list.add(hrstaff);
//		}
		return list;
	}
	
	float calculateTotalSalary() {
		float totalSalary = 0;
		for(Iterator iterator = employees.iterator();iterator.hasNext();)
		{
			Employee employee = (Employee) iterator.next();
			totalSalary = totalSalary + employee.getSalary();
		}
		return totalSalary;
	}

}
