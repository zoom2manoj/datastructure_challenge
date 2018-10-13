package com.design_pattern.structural.flyweight;

import java.util.HashMap;

public class ShapeFactory {

	private static final HashMap<ShapeType,Shape> shapes = new HashMap<ShapeType,Shape>();
	public static enum ShapeType{
		OVAL_FILL,OVAL_NOFILL,LINE;
	}
	
	public static Shape getShape(ShapeType shapeType){
		
		Shape shapeImp = shapes.get(shapeType);
		
		if (shapeImp==null) {
			if (shapeType.equals(ShapeType.OVAL_FILL)) {
				shapeImp = new Oval(true);
			}else if(shapeType.equals(ShapeType.OVAL_NOFILL)){
				shapeImp = new Oval(false);
			}else if(shapeType.equals(ShapeType.LINE)){
				shapeImp = new Line();
			}
		shapes.put(shapeType	,shapeImp);

		}		
		return shapeImp;
	}
}
