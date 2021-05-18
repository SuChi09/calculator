package de.lhind.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController implements CalculatorInterface {

	public CalculatorController() {
		new LogObserver(CalculatorService.getInstance());
	}

	@GetMapping("/calc")
	public double operation(@RequestParam(value = "op") String op, @RequestParam(value = "a") String a, @RequestParam(value = "b") String b) {
		return CalculatorService.getInstance().operation(op, a, b);
	}
}
