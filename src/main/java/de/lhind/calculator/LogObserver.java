package de.lhind.calculator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LogObserver extends Observer{

	public LogObserver(CalculatorService calculatorService) {
		calculatorService.register(this);
	}

	@Override
	public void notify(double result) {
		log.info("Result: {}", result);
	}
}
