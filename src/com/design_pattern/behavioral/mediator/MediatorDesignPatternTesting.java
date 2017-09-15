package com.design_pattern.behavioral.mediator;

public class MediatorDesignPatternTesting {

	public static void main(String[] arg){
		ChatMediator chatM = new ChatMediatorImp();
		User user1 =  new UserImp(chatM, "Harsh");
		User user2 =  new UserImp(chatM, "Manoj");
		User user3 =  new UserImp(chatM, "Nitin");
		User user4 =  new UserImp(chatM, "Durgesh");
		User user5 =  new UserImp(chatM, "Roshan");
		chatM.addUser(user1);
		chatM.addUser(user2);
		chatM.addUser(user3);
		chatM.addUser(user4);
		chatM.addUser(user5);
		
		user1.send("Hi All");
		
	}
}
