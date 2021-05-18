package de.lhind.calculator.operation;

public class SubtractionOperation implements Operation {
	@Override
	public Double apply(Double a, Double b) {
		return a - b;
	}
}
