package com.design_pattern.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImp implements ChatMediator{

	
	List<User> users ;
	
	public ChatMediatorImp() {
		users = new ArrayList<User>();
	}	
	
	@Override
	public void sendMessage(String message, User user) {
		// TODO Auto-generated method stub
		for (User u: users) {			
			if (u!=user) {
				u.recieve(message);
			}
		}
	}

	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		this.users.add(user);
	}
}
