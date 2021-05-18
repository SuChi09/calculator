package de.lhind.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static de.lhind.calculator.CalculatorService.add;
import static de.lhind.calculator.CalculatorService.div;
import static de.lhind.calculator.CalculatorService.mul;
import static de.lhind.calculator.CalculatorService.sub;

@RestController
public class CalculatorController {

	@GetMapping("/calc")
	public double operation(@RequestParam(value = "op") String op, @RequestParam(value = "a") double a, @RequestParam(value = "b") double b) {
		switch (op) {
			case "add":
				return add(a, b);
			case "sub":
				return sub(a, b);
			case "mul":
				return mul(a, b);
			case "div":
				return div(a, b);
		}
		throw new IllegalArgumentException("Unsupported operation: " + op);
	}
}
