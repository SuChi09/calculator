package de.lhind.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
public class CalculatorCli {

	private CalculatorInterface calculatorInterface;

	@Autowired
	public CalculatorCli(CalculatorInterface calculatorInterface) {
		this.calculatorInterface = calculatorInterface;
	}

	@ShellMethod("Calculation")
	public double calc(String op, String a, String b) {
		return calculatorInterface.operation(op, a, b);
	}
}
