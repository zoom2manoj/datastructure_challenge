package com.design_pattern.structural.bridge;

public abstract class Shape {

	Color color;
	public Shape(Color c) {
		// TODO Auto-generated constructor stub
		this.color = c;
	}
	
	public abstract void applyColor();
}
