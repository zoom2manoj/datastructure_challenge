package com.design_pattern.behavioral.command;

public class WriteCommand  implements Command{
	FileSystemReciever fileSystemReciever ;

	
	public WriteCommand(FileSystemReciever fileSystemReciever) {
		this.fileSystemReciever = fileSystemReciever;
	}
	
	@Override
	public void execute() {
		this.fileSystemReciever.writeFile();
	}
}
