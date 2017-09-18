package com.design_pattern.behavioral.observer;


public interface Subject {

	public void register(Observer obj);
	public void unregister(Observer obj);
	
	public void notifyObservers();
	
	public Object getUpdate(Observer obj);
}
