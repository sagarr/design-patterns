package com.rohankar.visitor.recyling;

public class WeightVisitor implements Visitor {

	private double totalWeight;

	public double getTotalWeight() {
		return totalWeight;
	}

	@Override
	public void visit(Thrash p) {
		totalWeight += p.getWeight();
	}

}
