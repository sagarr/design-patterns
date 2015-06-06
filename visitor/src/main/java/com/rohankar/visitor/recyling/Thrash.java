package com.rohankar.visitor.recyling;

public abstract class Thrash implements Visitable {

	public abstract double getPrice();

	public abstract double getWeight();

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}