package com.design_pattern.structural.adapter;

public class AdapterDesignPatternDemo {
	
	public static void main(String[] arg){
		
		testClassAdapter();
		testObjectAdapter();
	}

	private static void testObjectAdapter() {
		// TODO Auto-generated method stub
		
		SocketAdapter socketAdapter = new AdapterDesign_ObjectImpDemo();
		System.out.println("120 volt used "+socketAdapter.get120Volt().getVolts()+" object adapter");
		System.out.println("12 volt used "+socketAdapter.get12Volt().getVolts()+" object adapter");
		System.out.println("3 volt used "+socketAdapter.get3Volt().getVolts()+" object adapter");
	}

	private static void testClassAdapter() {
		// TODO Auto-generated method stub
		SocketAdapter socketAdapter = new AdapterDesign_InterfaceImpDemo();
		
		System.out.println("120 volt used "+socketAdapter.get120Volt().getVolts()+" adapter");
		System.out.println("12 volt used "+socketAdapter.get12Volt().getVolts()+" adapter");
		System.out.println("3 volt used "+socketAdapter.get3Volt().getVolts()+" adapter");

	}

}
