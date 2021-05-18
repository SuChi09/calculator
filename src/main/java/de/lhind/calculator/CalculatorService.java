package de.lhind.calculator;

public class CalculatorService {
	public static double div(double a, double b) {
		assert b != 0;
		return a / b;
	}

	public static double mul(double a, double b) {
		return a * b;
	}

	public static double sub(double a, double b) {
		return a - b;
	}

	public static double add(double a, double b) {
		return a + b;
	}
}
