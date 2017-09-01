package com.design_pattern.creational.singleton;

public class ThreadSingletonDemo {

	
	private static ThreadSingletonDemo threadSingletonDemo;
	
	private ThreadSingletonDemo(){
		
	}
	
	public static synchronized ThreadSingletonDemo getInstance(){
		
		
		if (threadSingletonDemo==null) {
			
			synchronized (ThreadSingletonDemo.class) {
				if(threadSingletonDemo==null){
					threadSingletonDemo = new ThreadSingletonDemo();		
				}
			}
			
		}
		
		return threadSingletonDemo;
	}
}
