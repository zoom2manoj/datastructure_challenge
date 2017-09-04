package com.design_pattern.structural.composition;

public class CompositionPatternDesign {
	
	public static void main(String[] arg){
		
		
		Shape triangeShape = new Triangle();
		Shape squireShape = new Square();
		Shape circleShape = new Circle();
		
		Drawing drawing = new Drawing();
		drawing.add(circleShape);
		drawing.add(squireShape);
		drawing.add(triangeShape);
		drawing.draw("red");
		
		drawing.clear();
		drawing.add(circleShape);
		drawing.add(squireShape);
		drawing.draw("green");
		
	}
}
