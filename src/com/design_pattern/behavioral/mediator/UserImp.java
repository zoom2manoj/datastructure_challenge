package com.design_pattern.behavioral.mediator;

public class UserImp extends User{

	public UserImp(ChatMediator chatM, String name) {
		super(chatM, name);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void send(String msg) {
		// TODO Auto-generated method stub
		System.out.println(this.name +" : sending  = "+ msg);
		this.chatM.sendMessage(msg, this);
	}
	@Override
	public void recieve(String msg) {
		// TODO Auto-generated method stub
		System.out.println(this.name +" : recieve = "+msg);
	}	
}
