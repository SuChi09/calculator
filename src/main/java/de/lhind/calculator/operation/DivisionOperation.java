package de.lhind.calculator.operation;

public class DivisionOperation implements Operation {
	@Override
	public Double apply(Double a, Double b) {
		assert b != 0;
		return a / b;
	}
}
