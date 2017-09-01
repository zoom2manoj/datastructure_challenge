package com.design_pattern.builder;

public class BuilderPattern {

	public static void main(String[] arg){		
		Computer computer  = new Computer.ComputerBuilder("HDDDDD", "RAMMMMM").isGraphicsCardEnables(true).isBluetoothEnable(true).builder();
		System.out.println(computer.getHdd());
	}
}
