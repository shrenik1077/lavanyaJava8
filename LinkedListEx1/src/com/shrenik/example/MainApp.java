package com.shrenik.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class MainApp {

	public static void main(String[] args) {
		
		LinkedList <Integer>numbers = new LinkedList(
				Arrays.asList(10,40,29,42,52,23)
				);
		
		Collections.sort(numbers);
		// Call toString()
		System.out.println("Linked List Numbers = " + numbers);
		
		// for Loop
		// enhanced Loop
		
		
		System.out.println("Using Enhanced For Loop");
		for(Object R:numbers)
		{
			System.out.print(R+" ");
		}
		
		// Q1. Create Custom Class Objects LinkedList and print records
		LinkedList <Player>precords = new LinkedList();
		
		precords.add(new Player(102,"Sachin",1900));
		precords.add(new Player(103,"Sehwag",2000));
		precords.add(new Player(104,"Virat",1600));
		
		for(Object R:precords)
		{
			Player x = (Player)R;
			System.out.println(x);
		}
		
		// Q2. Check who player scored more
		int max=0;
		Player ans = null;
		for(Object R:precords)
		{
			Player x = (Player)R;
			if(x.getTotalruns() > max)
			{
				max=x.getTotalruns();
				ans = x;
			}
		}
		
		System.out.println("\n Player who Scored max runs = " + ans);
		
		// Q3. Sort Players by order by totalruns
		Collections.sort(precords);
		
		System.out.println("After Sorting Player Records");
		System.out.println(precords);
		
	}

}
