package com.design_pattern.structural.adapter;

public class AdapterDesign_ObjectImpDemo implements SocketAdapter{

	private Socket socket = new Socket();
	
	@Override
	public Volt get120Volt() {
		// TODO Auto-generated method stub
		return socket.getVolts();
	}

	@Override
	public Volt get12Volt() {
		// TODO Auto-generated method stub
		return convertVolt(socket.getVolts(), 12);
	}

	
	@Override
	public Volt get3Volt() {
		// TODO Auto-generated method stub
		return convertVolt(socket.getVolts(), 40);
	}

	
	private Volt convertVolt(Volt volts, int i) {
		// TODO Auto-generated method stub
		return new Volt(volts.getVolts()/i);
	}

	
}
