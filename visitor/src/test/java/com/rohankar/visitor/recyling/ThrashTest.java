package com.rohankar.visitor.recyling;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ThrashTest {

	@Test
	public void calculateThrashPrice() {
		PriceVisitor visitor = new PriceVisitor();
		visitor.visit(new Plastic());
		visitor.visit(new Paper());

		assertEquals(visitor.totalPrice(), 20, 0.1);
	}

	@Test
	public void calculateThrashWeight() {
		WeightVisitor visitor = new WeightVisitor();
		visitor.visit(new Plastic());
		visitor.visit(new Paper());

		assertEquals(visitor.getTotalWeight(), 32, 0.1);
	}
}
