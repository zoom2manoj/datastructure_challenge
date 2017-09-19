package com.design_pattern.behavioral.visitor;

import com.design_pattern.behavioral.strategy.Item;

public class ShoppingCardClient {

	public static void main(String[] arg){
		ItemElement[] itemElementArray = new ItemElement[]{new Book("12345", 100), new Book("6678", 600), new Fruit("Banana", 50, 2), new Fruit("Apple", 70, 6)};
		int total = calculateTotal(itemElementArray);
		System.out.println("total cost pay from visitor "+total);
	}

	private static int calculateTotal(ItemElement[] itemElementArray) {
		
		ShoppingCardVisitor visitor = new ShoppingCardVisitorImp();
		int sum = 0;
		for (ItemElement item: itemElementArray) {
			sum+=item.accept(visitor);
		}
		
		return sum;
	}
}
