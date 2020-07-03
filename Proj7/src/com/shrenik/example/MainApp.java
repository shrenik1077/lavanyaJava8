package com.shrenik.example;




public class MainApp {

	public static void main(String[] args) {
		
		//1. Taxable Interface Java 8 Implementation
		Taxable t1 = ()-> {System.out.println("Tax is 18%");};
		
		//2. Discount Interface Java8 Implementation
		Discount d1 = ()->{ return 7.3f;};
		System.out.println("Discount = " + d1.showDiscountAmount());
		

		
	}
}
