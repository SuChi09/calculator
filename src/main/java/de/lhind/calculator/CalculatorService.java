package de.lhind.calculator;

import java.util.LinkedList;
import java.util.List;

import de.lhind.calculator.factory.InputFactory;
import de.lhind.calculator.operation.Operation;

public class CalculatorService {

	private static CalculatorService calculatorService = new CalculatorService();
	List<Observer> observers = new LinkedList<>();

	private CalculatorService() {
	}

	public static CalculatorService getInstance() {
		return calculatorService;
	}

	public void register(Observer observer){
		observers.add(observer);
	}

	public double operation(String op, String a, String b) {
		Operation operation = InputFactory.convertToOperation(op);
		double doubleA = InputFactory.convertToDouble(a);
		double doubleB = InputFactory.convertToDouble(b);

		double result = operation.apply(doubleA, doubleB);
		observers.forEach(observer -> observer.notify(result));

		return result;
	}
}
