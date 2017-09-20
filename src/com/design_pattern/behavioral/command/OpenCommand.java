package com.design_pattern.behavioral.command;

public class OpenCommand implements Command{

	FileSystemReciever fileSystemReciever;
	
	
	public OpenCommand(FileSystemReciever fileSystemReciever) {
		this.fileSystemReciever = fileSystemReciever;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		fileSystemReciever.openFile();
	}

}
