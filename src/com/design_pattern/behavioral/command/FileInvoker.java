package com.design_pattern.behavioral.command;

public class FileInvoker {

	Command command;
	
	public FileInvoker(Command command) {
		this.command = command;
	}
	
	public void execute(){
		this.command.execute();
	}
}
