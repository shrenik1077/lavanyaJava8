package com.shrenik.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MainApp {

	public static void main(String[] args) {
		
		// ArrayList
		List numlist = new ArrayList();
		numlist.add(10);
		numlist.add(15);
		numlist.add(16);
		
		System.out.println(numlist);
		
		
		// Q1. Make addition of first and Second value of List 
		int sum = (int)numlist.get(0) + (int)numlist.get(1);
		System.out.println("Addition = " + sum);
		
		
		List citieslist = new ArrayList(
				Arrays.asList("California","Newyork","London","Delhi")
				);
	
		// print list of cities in ascending order
		Collections.sort(citieslist);
		
		System.out.println(citieslist);
	
		
		// LinkedList
		LinkedList dobs = new LinkedList();
		
		dobs.add("9/2/1991");
		dobs.add("12/5/2000");
		dobs.add("9/4/1990");
		dobs.add("12/5/2000");
		dobs.add("9/2/1991");
		

		for(int i=0;i<dobs.size();i++)
		{
			int cnt=0;
			for(int j=i+1;j<dobs.size();j++)
			{
				if(dobs.get(i).equals(dobs.get(j)))
					cnt++;
			}
			
			if(cnt>0)
				System.out.println(dobs.get(i) + " is Duplicate");
		}
		
		
		
		
	}

}
