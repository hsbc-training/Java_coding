package com.hsbc.model;

import java.awt.List;
import java.util.ArrayList;

public class HSBCCompany {

	List<Employee> employees = createEmployeeList();
	List<Employee> createEmployeeList()
	{
		List<Employee> list = new ArrayList<>();
		for(int i=0 ; i<10 ; i++)
		{
			Contractor contractor = new Contractor();
			list.add(Contractor);
		
		}
		for(int i=0 ; i<10 ; i++)
		{
			HSBCStaff hsbcstaff = new HSBCStaff();
			list.add(hsbcstaff);
		
		}
		return List;
	
	}
	
	
	public static void main(String[] args) {
		
	}
}
