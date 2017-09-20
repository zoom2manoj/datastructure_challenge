package com.design_pattern.behavioral.command;

public class CloseCommand implements Command{

	
	FileSystemReciever fileSystemReciever;
	
	public CloseCommand(FileSystemReciever fileSystemReciever) {
		this.fileSystemReciever = fileSystemReciever;
	}
	@Override
	public void execute() {
		fileSystemReciever.closeFile();
	}

}
