package com.design_pattern.behavioral.chainofresponsibility;

public interface DispenseChain {

	void setNextChain(DispenseChain chainDispense);
	void dispense(Currency curr);
}
