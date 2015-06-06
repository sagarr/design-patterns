package com.rohankar.visitor.recyling;

public class PriceVisitor implements Visitor {

	private double totalPrice;

	public double totalPrice() {
		return totalPrice;
	}

	@Override
	public void visit(Thrash p) {
		totalPrice += p.getPrice();
	}

}
