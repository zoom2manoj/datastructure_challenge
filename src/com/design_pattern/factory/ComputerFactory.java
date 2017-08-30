package com.design_pattern.factory;

public class ComputerFactory {

	public static Computer getComputer(String type, String ram, String had, String cpu){
		if ("pc".equalsIgnoreCase(type)) {
			return new PC(ram, had, cpu);
		}else if ("server".equalsIgnoreCase(type)) {
			return new Server(ram, had, cpu);
		}else{
			return null;
		}
	}
	
	
}
