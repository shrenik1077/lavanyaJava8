package com.shrenik.example;
import java.util.List;
import java.util.ArrayList;

public class MainApp {

	public static void main(String[] args) {
		Employee e1 = new Employee(101,"Smith",9000);
		Employee e2 = new Employee(102,"John",19000);
		Employee e3 = new Employee(103,"Peter",70000);
		
		List <Employee>emprecords = new ArrayList();
		emprecords.add(e1);
		emprecords.add(e2);
		
		
		//print records
		
//		for(int i=0;i<emprecords.size();i++)
//		{
//			System.out.println(emprecords.get(i));
//		}
//		
		
		for(Object R:emprecords)
		{
			System.out.println(R);
		}
		
	}

}
