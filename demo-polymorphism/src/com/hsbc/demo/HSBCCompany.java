package com.hsbc.demo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class HSBCCompany {
	List<Employee> employees = createEmployeeList();
	
	List<Employee> createEmployeeList(){
		List<Employee> list = new ArrayList<>();
		
		for(int i=0 ; i<10 ; i++){
			Contractor contractor = new Contractor();
			list.add(contractor);
			}
		for(int i=0 ; i<20 ; i++){
			HSBCStaff hsbcStaff = new HSBCStaff();
			list.add(hsbcStaff);
			}
	
		for(int i=0 ; i<20 ; i++){
			HRStaff hrStaff = new HRStaff();
			list.add(hrStaff);
			}
		return list;
	}
	
	float calculateTotalSalary(){
		float totalSalary=0;
		for (Iterator iterator = employees.iterator(); iterator.hasNext();) {
			Employee employee = (Employee) iterator.next();
			totalSalary+=employee.getSalary();
		}
		return totalSalary;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HSBCCompany company = new HSBCCompany();
		float totalSalary = company.calculateTotalSalary();
		System.out.println(totalSalary);
	}

}
