package com.design_pattern.structural.decorator;

public class DecoratorPatternTest {

	
	public static void main(String[] arg){
		Car sCar =  new SportCar(new BasicCar());
		sCar.assemble();
		System.out.println("Sport Car Assembled\n\n");
		
		Car sLuxCar  =  new SportCar(new LuxuryCar(new BasicCar()));
		sLuxCar.assemble();
		
		
	}
}
