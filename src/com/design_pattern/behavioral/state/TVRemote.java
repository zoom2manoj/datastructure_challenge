package com.design_pattern.behavioral.state;

public class TVRemote {

	public static void main(String[] arg){
		TVContext context = new TVContext();
		
		TVStartState tvStartState = new TVStartState();
		TVOffState tvOffState = new TVOffState();
		
		context.setState(tvStartState);
		context.doAction();
		
		context.setState(tvOffState);
		context.doAction();
	}
}
