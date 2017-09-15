package com.design_pattern.behavioral.mediator;

public abstract class User {
	ChatMediator chatM;
	String name;
	
	public User(ChatMediator chatM, String name) {
		this.chatM = chatM;
		this.name = name;
	}
	
	
	public abstract void send(String msg);
	public abstract void recieve(String msg);
	
}
