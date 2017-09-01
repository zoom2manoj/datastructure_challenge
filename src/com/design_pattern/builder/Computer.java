package com.design_pattern.builder;

public class Computer {

	private String Hdd;
	private String Ram;
	
	private boolean isGraphicsCardEnable;
	private boolean isBluetoothEnable;
	
	public String getHdd(){
		return Hdd;
	}
	
	public String getRam(){
		return Ram;
	}
	
	public boolean getGraphicsCardEnable(){
		return isGraphicsCardEnable;		
	}
	
	public boolean getBluetoothEnable(){
		return isBluetoothEnable;
	}
	
	private Computer(ComputerBuilder builder){
		System.out.println("=============");
		System.out.println(this.Hdd);
		System.out.println(""+this.isGraphicsCardEnable);
		System.out.println("=============");
		this.Hdd = builder.Hdd;
		this.Ram = builder.Ram;
		this.isBluetoothEnable = builder.isBluetoothEnable;
		this.isGraphicsCardEnable = builder.isGraphicsCardEnable;
		System.out.println(this.Hdd);
		System.out.println(""+this.isGraphicsCardEnable);
	}
	
	public static class ComputerBuilder{
		private String Hdd;
		private String Ram;
		
		private boolean isGraphicsCardEnable;
		private boolean isBluetoothEnable;
		
		public ComputerBuilder(String hdd, String ram){
			this.Hdd = hdd;
			this.Ram =  ram;			
		}
		
		public ComputerBuilder isGraphicsCardEnables(boolean isGraphicscardenable){
			this.isGraphicsCardEnable = isGraphicscardenable;
			return this;
		}
		
		public ComputerBuilder isBluetoothEnable(boolean isBluetoothenable){
			this.isBluetoothEnable = isBluetoothenable;
			return this;
		}
		public Computer builder(){
			System.out.println("====="+this.isBluetoothEnable);
			return new Computer(this);
		}
	}
}
