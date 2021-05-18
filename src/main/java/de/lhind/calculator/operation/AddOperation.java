package de.lhind.calculator.operation;

public class AddOperation implements Operation {
	@Override
	public Double apply(Double a, Double b) {
		return a + b;
	}
}
