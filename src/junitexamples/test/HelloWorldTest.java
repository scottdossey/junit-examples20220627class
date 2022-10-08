package junitexamples.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junitexamples.code.HelloWorld;

class HelloWorldTest {

	HelloWorld hw;
	
	public HelloWorldTest() {
		hw = new HelloWorld();
	}
	
	@Test
	void testGetMessage() {		
		assertEquals("Hello, World!", hw.getMessage());
	}
	
	@Test
	void testGetMessage2() {	
		assertEquals("Hello, Jason!", hw.getMessage("Jason"));
	}

}
