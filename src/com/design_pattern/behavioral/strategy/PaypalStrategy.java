package com.design_pattern.behavioral.strategy;

public class PaypalStrategy implements PaymentStrategy{
	
	private String email;
	private String pwd;
	
	public PaypalStrategy(String email, String pwd) {
		this.email = email;
		this.pwd = pwd;				
	}

	@Override
	public void pay(int amount) {
		System.out.println(amount+" paid by Paypal account");
	}

}
