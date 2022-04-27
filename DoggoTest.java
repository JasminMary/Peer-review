package com.qa.peertesting;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class DoggoTest {
	
	@BeforeAll
	static void testStart() {
	System.out.println("Starting Test suite!");
	}
	@BeforeEach
	void testStarteach() {
	System.out.println("Starting the test");
	}
	
	@Test
	void placementTest() {
		Doggo d = new Doggo();
		String actual = d.placement(1);
		String expected = "[2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100]";
		assertEquals(expected, actual, "does not match");
		
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
