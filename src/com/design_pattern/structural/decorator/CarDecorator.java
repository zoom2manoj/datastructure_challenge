package com.design_pattern.structural.decorator;

public class CarDecorator implements Car{
	Car c;
	
	public CarDecorator(Car c) {
		// TODO Auto-generated constructor stub
		this.c = c;
	}

	@Override
	public void assemble() {
		this.c.assemble();		
	}
	
	
	
}
