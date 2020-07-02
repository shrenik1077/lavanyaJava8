package com.shrenik.example.myInterfaces;

import java.util.Collections;
import java.util.List;

import com.shrenik.example.myclasses.Student;

public interface StudentInterface {

	public default List<Student> getSortedStudents(List<Student> studList){
		Collections.sort(studList);
		return studList;
	}
	
	static void welcomeUser(String username)
	{
		System.out.println("Hi User " + username);
	}
	
	abstract int getMinimumValueFromList(List<Integer> numbersList);
}

