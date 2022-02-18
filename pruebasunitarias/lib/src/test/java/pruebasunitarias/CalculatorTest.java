package pruebasunitarias;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {
	
	private final Calculator calculator = new Calculator();

	@Test
	void addition() {
		assertEquals(8, calculator.addNumbers(5, 3));
	}
	@Test
	void substraction() {
		assertEquals(5, calculator.subtractNumbers(10, 5));
	}
	@Test
	void divide() {
		assertEquals(5, calculator.divideNumbers(20, 4));
	}
	@Test
	void multiplication() {
		assertEquals(40, calculator.multiplyNumbers(8, 5));
	}

}
