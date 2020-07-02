package com.shrenik.example;

public class Product {
	private int prodcode;
	private String prodname;
	private double price;
	
	public Product()
	{
		prodcode = -1;
		prodname = "#UknownProdName";
		price = 0.0;
	}
	
	
	public Product(int prodcode, String prodname, double price) {
		super();
		this.prodcode = prodcode;
		this.prodname = prodname;
		this.price = price;
	}

	

	public int getProdcode() {
		return prodcode;
	}


	public String getProdname() {
		return prodname;
	}


	public double getPrice() {
		return price;
	}


	@Override
	public String toString() {
		return String.format("%10d %20s %10.2f",prodcode,prodname,price);
	}
}
