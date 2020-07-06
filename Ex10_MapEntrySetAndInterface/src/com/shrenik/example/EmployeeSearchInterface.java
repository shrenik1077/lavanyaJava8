package com.shrenik.example;

import java.util.Map;

public interface EmployeeSearchInterface {
	public Employee searchByName(Map <Integer,Employee> empRecords, String user_empname);
}
