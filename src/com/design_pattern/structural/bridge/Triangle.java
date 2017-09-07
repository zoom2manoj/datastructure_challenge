package com.design_pattern.structural.bridge;

public class Triangle extends Shape{

	
	public Triangle(Color c) {
		super(c);
		// TODO Auto-generated constructor stub

	}

	@Override
	public void applyColor() {
		// TODO Auto-generated method stub
		System.out.println("triangel shape with color");
		color.applyColor();
	}

}
