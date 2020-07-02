package com.shrenik.example;

import java.util.ArrayList;
import java.util.List;

public class MainApp {

	public static void main(String[] args) {
		List <Product>prodrecords = new ArrayList();
		
		Product p1 = new Product();
		prodrecords.add(p1);
		
		prodrecords.add(new Product(101,"Mouse",900.00));
		
		prodrecords.add(new Product(103,"Keyboard",1900.00));
		
		prodrecords.add(new Product());
		
		prodrecords.add(new Product(105,"Monitor",9000.00));
		
		//print List Items using Enhanced For Loop
		
		for(Product rec:prodrecords)
		{
			System.out.println(rec);
		}
		
		System.out.println("\n Empty Products");
		//find empty products
		findEmptyProduct(prodrecords);

	}
	
	static void findEmptyProduct(List prodrecords)
	{
		for(Object p: prodrecords)
		{
			Product x = (Product)p;
			if(x.getProdcode() == -1)
				System.out.println(p);
		}
	}

}
