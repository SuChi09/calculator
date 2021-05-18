package de.lhind.calculator.factory;

import de.lhind.calculator.operation.AddOperation;
import de.lhind.calculator.operation.DivisionOperation;
import de.lhind.calculator.operation.MultiplicationOperation;
import de.lhind.calculator.operation.Operation;
import de.lhind.calculator.operation.SubtractionOperation;

public class InputFactory {

	public static Operation convertToOperation(String op) {
		switch (op) {
			case "add":
				return new AddOperation();
			case "sub":
				return new SubtractionOperation();
			case "mul":
				return new MultiplicationOperation();
			case "div":
				return new DivisionOperation();
		}
		throw new IllegalArgumentException("Unsupported operation: " + op);
	}

	public static double convertToDouble(String number) {
		return Double.parseDouble(number);
	}
}
