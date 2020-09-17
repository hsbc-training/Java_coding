package com.hsbc.model;

import com.hsbc.model.Employee;

public class Contractor extends Employee {

	@Override //overridded to avoid ambiguities
	float getSalary() {
		return 25360;
	}

}