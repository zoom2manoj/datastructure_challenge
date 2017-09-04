package com.design_pattern.structural.proxy;

public class ProxyPatternDesign {

	public static void main(String[] arg){
		CommandExecutor cep = new CommandExecutorProxy("manoj", "waskljdf");
		try {
			cep.runCommand("ipconfig");
			cep.runCommand(" rm -rf abc.pdf");
		} catch (Exception e) {
			System.out.println("Exception Message::"+e.getMessage());
		}
	}
}
