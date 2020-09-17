package day3.com.hsbc.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HSBCCompany {
	List<Employee> employees = createEmployeeList();

	public List<Employee> createEmployeeList() {
		// TODO Auto-generated method stub
		List<Employee> list = new ArrayList<>();
		HRDepartment.factory(10, Contractor.class, list);
		HRDepartment.factory(10, HSBCStaff.class, list);
		HRDepartment.factory(10, HRStaff.class, list);
		return list;
	}
	
	float calculateTotalSalary() {
		float totalSalary=0;
		for (Iterator iterator = employees.iterator(); iterator.hasNext();) {
			Employee employee = (Employee) iterator.next();
			totalSalary+=employee.getSalary();
		}
		return totalSalary;
	
	}
	public static void main(String[] args) {
		HSBCCompany company = new HSBCCompany();
		float totalSalary = company.calculateTotalSalary();
		System.out.println(totalSalary);
	}
	
}
