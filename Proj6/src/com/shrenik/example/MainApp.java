package com.shrenik.example;

public class MainApp {

	public static void main(String[] args) {
		
		function1();
		
		Runnable r = ()-> {	System.out.println("This is another anonymous implementation of Runnable Interface"); };			
		
		Thread t = new Thread(r);
		t.start();
		
		
		Subject s1 = () -> {
				System.out.println("This is Object s1 to define Subject as Java");
			};
			
		s1.createClassSubject();
		
		Subject s2 = new Subject() {

			@Override
			public void createClassSubject() {
				System.out.println("This is Object s2 to define Subject as Python");
				
			}};
			
		s2.createClassSubject();
	}

	private static void function1() {
		Runnable r = new Runnable() {
			@Override
			public void run() {
				System.out.println("This is anonymous implementation of Runnable Interface");				
			}			
		};
		
		Thread t = new Thread(r);
		
		t.start();
	}

}
