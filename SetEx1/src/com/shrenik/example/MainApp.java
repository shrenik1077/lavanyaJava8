package com.shrenik.example;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class MainApp {

	public static void main(String[] args) {
		HashSet ex1 = new HashSet();
		ex1.add(10);
		ex1.add(90);
		ex1.add(10);
		ex1.add(28);
		ex1.add(90);
		ex1.add(82);
	
		
		System.out.println("HashSet Example = " + ex1);
		
		LinkedHashSet ex2 = new LinkedHashSet();
		ex2.add(10);
		ex2.add(90);
		ex2.add(10);
		ex2.add(28);
		ex2.add(90);
		ex2.add(82);
		
		System.out.println("Linked HashSet Example = " + ex2);
			
		
		TreeSet ex3 = new TreeSet();
		ex3.add(10);
		ex3.add(90);
		ex3.add(10);
		ex3.add(28);
		ex3.add(90);
		ex3.add(82);
		
		System.out.println("Tree Set Example = " + ex3);
		

	}

}
