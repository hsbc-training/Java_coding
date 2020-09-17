package com.hsbc.model;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class HSBCCompany {
  
	List<Employee> employees= createEmployeeList();
	
	List<Employee> createEmployeeList()
	{
		List<Employee> list=new ArrayList<>();
		{
			for(int i=0;i<10;i++)
			{
				Contractor contractor=new Contractor();
				list.add(contractor);
			}
			for(int i=0;i<10;i++)
			{
				HSBCStaff hsbcstaff=new HSBCStaff();
				list.add(hsbcstaff);
			}
			
			return list;
		}
	}
		
		float calculateTotalSalary()
		{
			float totalSalary=0;
			for( Iterator it=employees.iterator();it.hasNext(); )
			{
				Employee employee=(Employee)it.next();
				totalSalary=totalSalary + employee.getSalary();
			}
			return totalSalary;
		}
		
		
		public static void main(String[] args)
		{
			HSBCCompany company=new HSBCCompany();
			float totalSalary=company.calculateTotalSalary();
			System.out.println(totalSalary);
			
		}
	}
	
	

