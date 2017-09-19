package com.design_pattern.behavioral.strategy;

public class ShoppingCartTest {

	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
	
	Item item1 = new Item("1abcde",100);
	Item item2 = new Item("2abcde",400);
	cart.addItem(item1);
	cart.addItem(item2);
	
	//pay by paypal
	cart.pay(new PaypalStrategy("manoj.kb2011@gmail.com", "mypwd"));
	
	//pay by credit card
	cart.pay(new CreditCardStrategy("Manoj Kumar", "1234567890123456", "786", "12/15"));
}
}
