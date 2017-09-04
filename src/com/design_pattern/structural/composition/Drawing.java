package com.design_pattern.structural.composition;

import java.util.ArrayList;
import java.util.List;

public class Drawing {

	List<Shape> shapes = new ArrayList<Shape>();
	
	public void draw(String fillColor) {
		// TODO Auto-generated method stub
			for (Shape s: shapes) {
				s.draw(fillColor);
			}
	}
	
	public void add(Shape s){
		shapes.add(s);
	}
	
	public void delete(Shape s) {
		// TODO Auto-generated method stub
		shapes.remove(s);
	}
	
	public void clear() {
		// TODO Auto-generated method stub
		System.out.println("Clearing all the shapes from drawing");
		shapes.clear();
	}
}
