package de.lhind.calculator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyDouble;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class CalculatorServiceTest {

	@Test
	void operation() {
		Observer observer = mock(Observer.class);
		CalculatorService.getInstance().register(observer);
		assertEquals(1.0, CalculatorService.getInstance().operation("add", "0", "1"));
		assertEquals(-1.0, CalculatorService.getInstance().operation("sub", "0", "1"));
		assertEquals(0, CalculatorService.getInstance().operation("mul", "0", "1"));
		assertEquals(0, CalculatorService.getInstance().operation("div", "0", "1"));

		verify(observer, times(4)).notify(anyDouble());
	}
}
