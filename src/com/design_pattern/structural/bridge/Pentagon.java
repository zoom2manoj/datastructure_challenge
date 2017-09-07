package com.design_pattern.structural.bridge;

public class Pentagon extends Shape{

	public Pentagon(Color c) {
		super(c);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void applyColor() {
		// TODO Auto-generated method stub
		System.out.println("Pentagon shape with color");
		color.applyColor();
	}

}
