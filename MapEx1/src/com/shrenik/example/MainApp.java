package com.shrenik.example;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MainApp {

	public static void main(String[] args) {
		Map <Integer,String>students = new HashMap();

		students.put(139,"Smith");
		students.put(12,"Omkar");
		students.put(45,"Nitin");
		
		//1. toString()
		System.out.println(students);
		
		//2. only keys
		Set allkeys = students.keySet();
		System.out.println("All Keys of object students = " + allkeys);
		
		//3. all values
		Collection allvalues = students.values();
		System.out.println("All values of object students = " + allvalues);
		
		
		Map <Integer,String>cities = new LinkedHashMap();
		cities.put(416416,"Mumbai");
		cities.put(416136,"Pune");
		cities.put(416318,"Delhi");
		cities.put(417383,"Surat");
		
		//4. print records using for loop
		Set allpincodes = cities.keySet();
		for(Object key : allpincodes)
		{
			System.out.println(key + "======>" + cities.get(key));
		}
		
		
		Map <String,Vehicle>vehicles = new TreeMap();
		
		vehicles.put("m0012",new Vehicle("Two Wheeler","red"));
		vehicles.put("m0014",new Vehicle("Moped","blue"));
		vehicles.put("m0051",new Vehicle("Bike","red"));
		vehicles.put("m0042",new Vehicle("Four Wheeler","white"));
		
		// using for loop print records
		Set allvehiclekeys = vehicles.keySet();
		for(Object key:allvehiclekeys)
		{
			System.out.println(key + " ===> " + vehicles.get(key));
		}
		
	}

}
