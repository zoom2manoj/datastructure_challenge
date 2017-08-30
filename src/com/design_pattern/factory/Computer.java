package com.design_pattern.factory;

public abstract class Computer {

	
	public abstract String getRAM();
	public abstract String getHAD();
	public abstract String getCPU();
	
	public String getString(){
		return "RAM "+this.getRAM()+" HAD "+this.getHAD()+" CPU "+this.getCPU();
	}
}
