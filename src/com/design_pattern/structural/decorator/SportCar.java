package com.design_pattern.structural.decorator;

public class SportCar extends CarDecorator{
	
	public SportCar(Car c) {
		super(c);
	}
	
	@Override
	public void assemble() {
		// TODO Auto-generated method stub
		super.assemble();
		System.out.println("Adding sport car features");		
	}
}
