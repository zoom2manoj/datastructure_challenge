package com.design_pattern.behavioral.strategy;

public class Item {

	private String upcCode;
	private int price;
	
	public Item(String upcCode, int price) {
		this.upcCode =  upcCode;
		this.price = price;
	}
	
	public String getUpcCode(){
		return this.upcCode;
	}
	
	public int getPrice(){
		return this.price;
	}
	
}
