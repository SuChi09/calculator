package de.lhind.calculator.operation;

public class MultiplicationOperation implements Operation {
	@Override
	public Double apply(Double a, Double b) {
		return a * b;
	}
}
