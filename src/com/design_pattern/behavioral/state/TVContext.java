package com.design_pattern.behavioral.state;

public class TVContext implements State{

	
	State state;
	
	public TVContext() {
		//this.state = state;
	}
	
	public void setState(State state) {
		this.state = state;
	}
	
	public State getState() {
		return state;
	}
	
	@Override
	public void doAction() {
		this.state.doAction();
	}

}
