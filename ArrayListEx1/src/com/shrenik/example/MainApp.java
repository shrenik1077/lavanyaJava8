/* WAP to make number collection and print using function having ArrayList as a Paramter */

package com.shrenik.example;

import java.util.ArrayList;
import java.util.List;

public class MainApp {

	public static void main(String[] args) {
		List <Integer>numlist = new ArrayList();
		
		numlist.add(10);
		numlist.add(20);
		numlist.add(20);
		numlist.add(40);
		numlist.add(60);
		
		
		showArrayListValues(numlist);
		
		numlist.add(100);
		numlist.add(200);
		
		showArrayListValues(numlist);   // {10 to 200}  
		
		
		List <String>colors = new ArrayList();
		
		colors.add("red");
		colors.add("green");
		colors.add("red");
		colors.add("orange");
		colors.add("blue");
		
		// Print color list using enhanced loop
		System.out.println("Total Colors in List = " + colors.size());
		
		for(String color: colors)
		{
			System.out.println(color);
		}
		
		// Only First Color
		System.out.println("First Color = " + colors.get(0));
		
		// Last Color
		System.out.println("Last Color = " + colors.get(colors.size()-1));
		
		
		// swap first color with last color
		colors.set(0, "blue");
		colors.set(4, "red");
		
		System.out.println("Using toString() , colors list = " + colors);
		
		// add() method insert new value to given index
		colors.add(2,"white");
		System.out.println("After adding new element at position 2 = " + colors);

	}
	
	static void showArrayListValues(List plist)
	{
		
		// size() function returns total count of elements in list
		System.out.println("Total values in ArrayList = " + plist.size());
		for(int i=0;i<plist.size();i++)
		{
			System.out.println(plist.get(i));
		}
	}

}

/*
	1. add(object)
	2. set(index,object)
	3. add(index,object)
	
 */














