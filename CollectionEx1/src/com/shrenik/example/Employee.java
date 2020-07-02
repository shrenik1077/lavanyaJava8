package com.shrenik.example;

public class Employee {

	public int empcode;
	public String empname;
	public int salary;
	
	public Employee() {}
	
	public Employee(int empcode, String empname, int salary) {
		super();
		this.empcode = empcode;
		this.empname = empname;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empcode=" + empcode + ", empname=" + empname + ", salary=" + salary + "]";
	}
	
	

	
}
