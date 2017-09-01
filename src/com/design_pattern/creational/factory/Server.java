package com.design_pattern.creational.factory;

public class Server extends Computer{

	String ram, had, cpu;
	
	public Server(String ram, String had, String cpu){
		this.ram = ram;
		this.had = had;
		this.cpu = cpu;
	}
	@Override
	public String getRAM() {
		// TODO Auto-generated method stub
		return this.ram;
	}

	@Override
	public String getHAD() {
		// TODO Auto-generated method stub
		return this.had;
	}

	@Override
	public String getCPU() {
		// TODO Auto-generated method stub
		return this.cpu;
	}
	
	
	
	
}
