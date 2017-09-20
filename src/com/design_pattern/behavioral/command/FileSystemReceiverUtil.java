package com.design_pattern.behavioral.command;

public class FileSystemReceiverUtil {

	public static FileSystemReciever getUnderlyingFileSystem(){
		 String osName = System.getProperty("os.name");
		 System.out.println("Underlying OS is:"+osName);
		 if(osName.contains("Windows")){
			 return new WindowFileSystemReciever();
		 }else{
			 return new UnixFileSystemReciever();
		 }
	}
}
