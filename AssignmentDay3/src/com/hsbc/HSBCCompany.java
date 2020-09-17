package com.hsbc;
import java.util.ArrayList;
import java.util.List;
public class HSBCCompany {
	List<Employee> employees=createEmployeeList();
	
	List<Employee>	createEmployeeList()	
	{
		List<Employee> list=new ArrayList<>();
		for (int i=0;i<10;i++)
		{
			Contractor contractor=new Contractor();
					list.add(contractor);
		}
		
		for (int i=0;i<20;i++)
		{
			HSBCStaff hsbcstaff=new HSBCStaff();
					list.add(hsbcstaff);
		}
		return list;
		
	}
	public static void main(String[] args) {
		
	}

}
