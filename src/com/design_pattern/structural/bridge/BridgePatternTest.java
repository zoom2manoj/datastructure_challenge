package com.design_pattern.structural.bridge;

public class BridgePatternTest {

	public static void main(String[] arg){
		Shape shp = new Triangle(new RedColor());
		shp.applyColor();
		
		Shape shpp = new Pentagon(new GreenColor());
		shpp.applyColor();
	}
}
