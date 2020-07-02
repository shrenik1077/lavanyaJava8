package com.shrenik.example;

public class Vehicle {
	
	public String vehname;
	public String color;
	
	public Vehicle() {}
	
	public Vehicle(String vehname, String color) {
		super();
		this.vehname = vehname;
		this.color = color;
	}

	@Override
	public String toString() {
		return "Vehicle [vehname=" + vehname + ", color=" + color + "]";
	}
	
	
	
}
