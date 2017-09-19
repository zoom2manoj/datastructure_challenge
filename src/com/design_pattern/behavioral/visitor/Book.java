package com.design_pattern.behavioral.visitor;

public class Book implements ItemElement{

	
	private String isBnNumber;
	private int price;
	
	public Book(String isBnNumber, int price) {
		// TODO Auto-generated constructor stub
	this.isBnNumber = isBnNumber;
	this.price = price;
	}
	
	public String getIsBnNumber() {
		return isBnNumber;
	}
	
	public int getPrice() {
		return price;
	}
	
	@Override
	public int accept(ShoppingCardVisitor visitor) {
		// TODO Auto-generated method stub
		return visitor.visit(this);
	}

}
