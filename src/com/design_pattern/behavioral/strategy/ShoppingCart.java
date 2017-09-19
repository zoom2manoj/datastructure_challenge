package com.design_pattern.behavioral.strategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

	
	List<Item> itemList = null;
	
	public ShoppingCart() {
		itemList = new ArrayList<Item>();		
	}
	
	public void addItem(Item item) {
			this.itemList.add(item);
	}
	
	public void removeItem(Item item) {
		this.itemList.remove(item);
	}
	
	public int calculateTotal(){
		int sum = 0;
		for (Item item : this.itemList) {
			sum+=item.getPrice();
		}
		return sum;
	}
	
	public void pay(PaymentStrategy paymentStrategy){
		int amount = calculateTotal();
		paymentStrategy.pay(amount);
	}
	
}
