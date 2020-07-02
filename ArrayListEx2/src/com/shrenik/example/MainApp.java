package com.shrenik.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainApp {

	public static void main(String[] args) {
		
		List student = new ArrayList(
				Arrays.asList("Smith","Peter","Raj","Mith","Ashish","Shrenik")
				);
		
		System.out.println("Student List = " + student);
		
		// remove() method
		
		student.remove(0);
		
		System.out.println("After Remove first list Item = " + student);
		
		// contains() method
		
		String user_value = "John";
		boolean result = student.contains(user_value);
		
		System.out.println("Student Name '" + user_value + "' is exist in list or not :" + result);
		
		// clear() method
		
		student.clear();
		System.out.println("Students List after clear = " + student);

	}

}
