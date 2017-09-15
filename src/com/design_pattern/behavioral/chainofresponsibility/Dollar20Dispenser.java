package com.design_pattern.behavioral.chainofresponsibility;

public class Dollar20Dispenser implements DispenseChain{

	DispenseChain chain ; 
	
	
	@Override
	public void setNextChain(DispenseChain chainDispense) {
		// TODO Auto-generated method stub
		this.chain = chainDispense;
	}

	@Override
	public void dispense(Currency curr) {
		if (curr.getAmount()>=20) {
			int notes = curr.getAmount()/20;
			int reminder = curr.getAmount()%20;
			System.out.println("Dispnese "+notes+" 20$ ntoes");
			if (reminder!=0) {
				this.chain.dispense(new Currency(reminder));				
			}					
		}else{
			this.chain.dispense(curr);
		}
	}

}
