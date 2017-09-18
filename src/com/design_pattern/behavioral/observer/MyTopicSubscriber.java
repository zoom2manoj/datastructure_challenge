package com.design_pattern.behavioral.observer;

public class MyTopicSubscriber implements Observer {
	
	private String name;
	private Subject topic;
	
	public MyTopicSubscriber(String nm){
		this.name=nm;
	}
	
	
	@Override
	public void update() {
		// TODO Auto-generated method stub
		String msg = (String) topic.getUpdate(this);
		if(msg == null){
			System.out.println(name+":: No new message");
		}else
		System.out.println(name+":: Consuming message::"+msg);
	}

	@Override
	public void setSubject(Subject sub) {
		// TODO Auto-generated method stub
		this.topic=sub;
	}

}
