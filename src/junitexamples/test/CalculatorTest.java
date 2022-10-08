package junitexamples.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import junitexamples.code.Calculator;

class CalculatorTest {
	Calculator calculator;
	int num1;
	int num2;
	
	@BeforeEach
	void initializeCalculator() {
		calculator = new Calculator();
		num1 = 5;
		num2 = 10;
	}
	
	
	@Test
	void testAdd() {	
		int sum = calculator.add(num1, num2);
		assertEquals(15, sum, 0.0);
	}

	@Test 
	void testSubtract() {
		int difference = calculator.subtract(num1, num2);
		assertEquals(-5, difference, 0.0);		
	}

	@Test
	void testDivide() {
		double quotient = calculator.divide(num1, num2);
		assertEquals(.5, quotient, 0.0);
	}

	@Test
	void testMultiply() {
		double product = calculator.multiply(num1, num2);
		assertEquals(50, product, 0.0);		
	}

}
