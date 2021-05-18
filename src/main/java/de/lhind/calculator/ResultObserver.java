package de.lhind.calculator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ResultObserver extends Observer{

	private final CalculatorService calculatorService;

	public ResultObserver(CalculatorService calculatorService) {
		this.calculatorService = calculatorService;
		this.calculatorService.register(this);
	}

	@Override
	public void notify(double result) {
		log.info("Result: {}", result);
	}
}
