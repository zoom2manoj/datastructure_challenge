package com.design_pattern.behavioral.visitor;

public interface ShoppingCardVisitor {
	
	public int visit(Book book);
	public int visit(Fruit fruit);

}
