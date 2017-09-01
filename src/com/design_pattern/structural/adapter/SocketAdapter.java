package com.design_pattern.structural.adapter;

public interface SocketAdapter {

	public abstract Volt get120Volt();
	public abstract Volt get12Volt();
	public abstract Volt get3Volt();
	
}
