/* WAP to create List and add items dynamically */

package com.shrenik.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		
		List records = new ArrayList();
		Scanner scan = new Scanner(System.in);
		String ans;
		
		Object r;    // {10,'shrenik',20.4,'test',20}
		
		while(true)
		{		
			System.out.print("Enter value :");
			r = scan.next();
			
			records.add(r);
			
			System.out.print("Do you want to add new Item ?");
			ans = scan.next();
			
			if(ans.equals("yes"))
			{
				continue;
			}
			else
			{
				break;
			}
		}
		
		System.out.println("List Records = " + records);
		
		
		// Addition of Integer values in List
		int total = doIntegerAddition(records);
		System.out.println("Addition of integers = " + total);
	}
	
	static int doIntegerAddition(List rec)
	{
		int addn=0;
		//1. Iterate through list
		for(Object r : rec)
		{
			//2. identify value as integer or not
			try
			{
				addn = addn + Integer.parseInt(r+"");
			}
			catch(Exception ex)
			{
				//System.out.println(ex);
			}
		}
		
		return addn;
	}

}















