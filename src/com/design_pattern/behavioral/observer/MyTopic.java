package com.design_pattern.behavioral.observer;

import java.util.ArrayList;
import java.util.List;


public class MyTopic implements Subject{


	private List<Observer> observers;
	private String message;
	private boolean changed;
	private final Object MUTEX= new Object();
	
	public MyTopic() {
		// TODO Auto-generated constructor stub
		this.observers = new ArrayList<Observer>();
	}
	@Override
	public void register(Observer obj) {
		if(obj == null) throw new NullPointerException("Null Observer");
		synchronized (MUTEX) {
		if (!observers.contains(obj)) {
			observers.add(obj);
		}	
		}
		
	}
	
	

	@Override
	public void unregister(Observer obj) {
		synchronized (MUTEX) {
			observers.remove(obj);
		}
		
	}

	@Override
	public void notifyObservers() {
		/*List<Observer>  observerLocal = null;
		synchronized (MUTEX) {
			if (!changed) {
				return;
			}
			observerLocal  = new ArrayList<Observer>();
			this.changed = false;			
		}*/
		for (Observer obj  : observers) {
			
			obj.update();
		}
	}

	@Override
	public Object getUpdate(Observer obj) {
		// TODO Auto-generated method stub
		return this.message;
	}
	
	//method to post message to the topic
		public void postMessage(String msg){
			System.out.println("Message Posted to Topic:"+msg);
			this.message=msg;
			this.changed=true;
			notifyObservers();
		}

}
