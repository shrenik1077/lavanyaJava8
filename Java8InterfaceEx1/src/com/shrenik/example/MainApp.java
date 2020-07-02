package com.shrenik.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.shrenik.example.myInterfaces.StudentInterface;
import com.shrenik.example.myInterfaces.Test;
import com.shrenik.example.myclasses.Student;

public class MainApp {

	public static void main(String[] args) {
		List <Student> studList = new ArrayList<>();
		
		studList.add(new Student("Smith",23));
		studList.add(new Student("John",19));
		studList.add(new Student("Peter",27));
		
		StudentInterface obj = new Test();
		
		List <Student>sortedStudentsData = obj.getSortedStudents(studList);
		
		System.out.println("studList = " + studList);
		
		StudentInterface.welcomeUser("Lavanya");
		
		List <Integer>numbersList = new ArrayList<>(
				Arrays.asList(10,30,12,41,4,52)
				);
		
		int minValue = obj.getMinimumValueFromList(numbersList);
		System.out.println("Minimum Value = " + minValue);

	}

}
