package com.design_pattern.behavioral.visitor;

public class ShoppingCardVisitorImp implements ShoppingCardVisitor{

	@Override
	public int visit(Book book) {
		// TODO Auto-generated method stub
		int sum =0;
		if (book.getPrice()>50) {
			sum  = book.getPrice()-5;
		}else{
			sum = book.getPrice();
		}
		
		return sum;
	}

	@Override
	public int visit(Fruit fruit) {
		// TODO Auto-generated method stub
		int sum = (fruit.getPricePerKG())*(fruit.getWeight());
		System.out.println(fruit.getName()+" cost = "+sum);
		return sum;
	}

}
