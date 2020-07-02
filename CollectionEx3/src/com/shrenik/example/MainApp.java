package com.shrenik.example;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class MainApp {

	public static void main(String[] args) {
		
		Set first = new HashSet();
			
			first.add(18);
			first.add(18);
			first.add(14);
			first.add(10);
			first.add(10);
			first.add(17);
			
			
			System.out.println(first);
		
		
		Set second = new LinkedHashSet();
	
			
			second.add(18);
			second.add(18);
			second.add(14);
			second.add(10);
			second.add(10);
			second.add(17);
			
		
		System.out.println(second);
	
		
		
		Set third = new TreeSet();
		
			third.add(18);
			third.add(18);
			third.add(14);
			third.add(10);
			third.add(10);
			third.add(17);		
		
			System.out.println(third);
		
	}
}
