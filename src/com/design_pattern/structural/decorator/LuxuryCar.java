package com.design_pattern.structural.decorator;

public class LuxuryCar extends CarDecorator{

	public LuxuryCar(Car c) {
		super(c);
	}
	
	@Override
	public void assemble() {
		// TODO Auto-generated method stub
		super.assemble();
		System.out.println("Adding Luxury Car Features");
	} 
}
	