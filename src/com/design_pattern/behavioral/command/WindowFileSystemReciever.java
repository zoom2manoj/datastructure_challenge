package com.design_pattern.behavioral.command;

public class WindowFileSystemReciever implements FileSystemReciever{

	@Override
	public void openFile() {
		System.out.println("Open file in Widnow OS");
	}

	@Override
	public void writeFile() {
		System.out.println("Write file in Windwo System");
	}

	@Override
	public void closeFile() {
		System.out.println("Close file in Window system");
	}

}
