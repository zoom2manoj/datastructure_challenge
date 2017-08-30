package com.design_pattern.factory;

public class PC extends Computer{

	String RAM;
	String HAD;
	String CPU;
	
	public PC(String Ram, String Had, String Cpu){
		RAM = Ram;
		HAD = Had;
		CPU = Cpu;
	}
	
	@Override
	public String getRAM() {
		// TODO Auto-generated method stub
		return this.RAM;
	}

	@Override
	public String getHAD() {
		// TODO Auto-generated method stub
		return this.HAD;
	}

	@Override
	public String getCPU() {
		// TODO Auto-generated method stub
		return this.CPU;
	}
	
	

}
