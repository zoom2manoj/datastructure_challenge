package com.design_pattern.behavioral.command;

public class FileSystemClient {

	public static void main(String[] arg){
		FileSystemReciever fs = FileSystemReceiverUtil.getUnderlyingFileSystem();
		
		OpenCommand openFileCommand = new OpenCommand(fs);
		FileInvoker fi = new FileInvoker(openFileCommand);
		fi.execute();
		
		
		WriteCommand wc = new WriteCommand(fs);
		fi = new FileInvoker(wc);
		fi.execute();
		
		CloseCommand cc = new CloseCommand(fs);
		fi = new FileInvoker(cc);
		fi.execute();
	}
}
