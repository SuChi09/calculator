package de.lhind.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
public class CalculatorCli {

	private CalculatorController calculatorController;

	@Autowired
	public CalculatorCli(CalculatorController calculatorController) {
		this.calculatorController = calculatorController;
	}

	@ShellMethod("Calculation")
	public double calc(String op, double a, double b) {
		return calculatorController.operation(op, a, b);
	}
}
