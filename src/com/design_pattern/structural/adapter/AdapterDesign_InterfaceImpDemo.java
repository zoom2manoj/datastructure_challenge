package com.design_pattern.structural.adapter;

public class AdapterDesign_InterfaceImpDemo extends Socket implements SocketAdapter{

	@Override
	public Volt get120Volt() {
		// TODO Auto-generated method stub
		return getVolts();
	}

	@Override
	public Volt get12Volt() {
		// TODO Auto-generated method stub
		return convertVolt(getVolts(), 10);
	}

	

	@Override
	public Volt get3Volt() {
		// TODO Auto-generated method stub
		return convertVolt(getVolts(), 40);
	}
	
	
	private Volt convertVolt(Volt volts, int i) {
		// TODO Auto-generated method stub
		return new Volt(volts.getVolts()/i);
	}
	
	
	
}
