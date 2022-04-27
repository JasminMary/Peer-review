package com.qa.peertesting;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;

public class CalcTest {
	
	@BeforeAll
	static void testStart() {
	System.out.println("Starting Test suite!");
	}
	@BeforeEach
	void testStarteach() {
	System.out.println("Starting the test");
	}
	
	@Test
	void testCalc() {
		Calc c = new Calc();
		String actual = c.calculator(5, 3, 15);
		String expected = "5.0*3.0=15.0, 15.0/3.0=5.0, 15.0/5.0=3.0";
		assertEquals(expected, actual, "The calculator is wrong");
	}
	@Test
	void testBadCalc() {
		Calc c = new Calc();
		String actual = c.calculator(1, 5, 7);
		String expected = "Doesn't work";
		assertEquals(expected, actual, "The calculator is wrong");	
	}
	@AfterAll
	static void endtest() {
		System.out.println(" All Test has ended");
	}	
	@AfterEach
	void endtesteach() {
		System.out.println("This Test has ended");

}
}
