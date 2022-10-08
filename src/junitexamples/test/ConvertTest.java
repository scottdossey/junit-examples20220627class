package junitexamples.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import junitexamples.code.Convert;

class ConvertTest {
	Convert testing;
	
	//We can use the BeforeEach annotation to create a method
	//that is executed before each test method
	
	
	@BeforeAll
	static void initializeConvertTest() {
		System.out.println("Before all tests in ConvertTest");
	}	
	
	@AfterAll
	static void afterConvertTest() {
		System.out.println("After all tests in ConvertTest");	
	}
	
	@BeforeEach
	public void initializeTesting() {
		System.out.println("Before test");
		testing = new Convert();
		
	}
	
	@AfterEach
	public void afterTesting() {
		System.out.println("After test");
	}
	
	@Test
	void testConvertLength() {
	
		double result = testing.convertLength(240.0, "inches");
		
		//Check to see if the answer is what we expect it to be.
		//assertEquals(expected, actual, deltaErrorAllowed)
		assertEquals(100-.0, result, 0.0);
		
		result = testing.convertLength(100.0, "cm");
		assertEquals(240.0, result, 0.0);
		
	}
	
	@Test
	void testConvertVolume() {
		
		double result = testing.convertVolume(100, "ml");
		assertEquals(2957.0, result, 0.0);
		
		result = testing.convertVolume(2957.0, "oz");
		assertEquals(100.0, result, 0.0);
	}
	
	@Disabled
	@Test
	void testConvertTemperature() {
		double result = testing.convertTemperature(0, "F");		
		assertEquals(32, result, 0.0);
		
		result = testing.convertTemperature(100.0, "F");		
		assertEquals(212.0, result, 0.0);
	
		result = testing.convertTemperature(32.0, "C");
		assertEquals(0.0, result, 0.0);
		
		result = testing.convertTemperature(212.0,  "C");
		assertEquals(100.0, result, 0.0);		
		
	}
	
}
