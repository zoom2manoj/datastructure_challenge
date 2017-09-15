package com.design_pattern.behavioral.chainofresponsibility;

public class Dollar10Dispenser implements DispenseChain{

	DispenseChain chain;
	
	@Override
	public void setNextChain(DispenseChain chainDispense) {
		this.chain = chainDispense;
		
	}

	@Override
	public void dispense(Currency curr) {
		
		if (curr.getAmount()>=10) {
			int notes = curr.getAmount()/10;
			int reminder = curr.getAmount()%50;
			
			System.out.println("Dispnese : "+notes+" 10$ notes");
			if (reminder!=0) {
				this.chain.dispense(new Currency(reminder));				
			}
		}else{
			this.chain.dispense(curr);
			
		}
		
	}

	
	
}
