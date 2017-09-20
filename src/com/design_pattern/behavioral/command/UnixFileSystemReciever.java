package com.design_pattern.behavioral.command;

public class UnixFileSystemReciever implements FileSystemReciever{

	@Override
	public void openFile() {
		System.out.println("File opening in Unix OS");
		
	}

	@Override
	public void writeFile() {
		System.out.println("Write File in Unix OS");	
	}

	@Override
	public void closeFile() {
		System.out.println("Close file in Unix OS");
	}

}
