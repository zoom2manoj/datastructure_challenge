package com.design_pattern.behavioral.chainofresponsibility;

public class Dollar50Dispenser implements DispenseChain{

	private DispenseChain dispenseChange;

	@Override
	public void setNextChain(DispenseChain chainDispense) {
		this.dispenseChange =  chainDispense;
		
	}

	@Override
	public void dispense(Currency curr) {
		if (curr.getAmount()>=50) {
			int num = curr.getAmount()/50;
			int reminder = curr.getAmount()%50;
			System.out.println("Dispense "+num+" 50$ notes");
			if (reminder!=0) {
				this.dispenseChange.dispense(new Currency(reminder));
			}
		}else{
			this.dispenseChange.dispense(curr);
		}
		
	}
	
	
}
