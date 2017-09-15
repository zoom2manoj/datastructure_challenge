package com.design_pattern.behavioral.mediator;

public interface ChatMediator {
	
	public void sendMessage(String message, User user);
	void addUser(User user);
}
