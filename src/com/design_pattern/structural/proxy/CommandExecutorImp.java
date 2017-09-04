package com.design_pattern.structural.proxy;

public class CommandExecutorImp implements CommandExecutor{

	@Override
	public void runCommand(String cmd) throws Exception {
		// TODO Auto-generated method stub
		Runtime.getRuntime().exec(cmd);
		System.out.println("'"+cmd+"' command executed");
	}

}
