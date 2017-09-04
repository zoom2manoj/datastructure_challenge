package com.design_pattern.structural.proxy;

public class CommandExecutorProxy implements CommandExecutor{

	
	private boolean isAdmin;
	private CommandExecutor cExecutor;
	
	public CommandExecutorProxy(String username, String pwd) {
		// TODO Auto-generated constructor stub
		if ("manoj".equals(username)&&"manoj@123".equals(pwd)) {
			isAdmin = true;
		}
		
		cExecutor = new CommandExecutorImp();
	}
	
	@Override
	public void runCommand(String cmd) throws Exception {
		// TODO Auto-generated method stub
		if (isAdmin) {
			cExecutor.runCommand(cmd);
		}else{
			if (cmd.startsWith("rm")) {
				throw new Exception("rm command is not allow non-admin users");
			}else{
				cExecutor.runCommand(cmd);
			}
		}
			
	}
	

}
