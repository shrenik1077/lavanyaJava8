package com.shrenik.example;

import java.util.LinkedHashSet;
import java.util.Set;

public class MainApp {

	public static void main(String[] args) {
		
		Set movies = new LinkedHashSet();

		Movie m1 = new Movie(103,"Harry Potter",5);   // a01
		Movie m2 = new Movie(105,"Island",4);
		Movie m3 = new Movie(102,"Mr. Bean",5);
		Movie m4 = new Movie(103,"Harry Potter",5);   // a04
	
		
		// add() method calls equals() methods
		movies.add(m1);
		movies.add(m2);
		movies.add(m3);
		movies.add(m4);
		

		for(Object R:movies)
		{
			System.out.println(R);
		}
		
	}

}
