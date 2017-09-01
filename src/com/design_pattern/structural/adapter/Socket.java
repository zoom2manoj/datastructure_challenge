package com.design_pattern.structural.adapter;

public class Socket {
	
	public Volt getVolts(){
		return new Volt(120);
	}

}
