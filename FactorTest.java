package com.qa.peertesting;
	import static org.junit.jupiter.api.Assertions.assertEquals;

	import org.junit.jupiter.api.AfterAll;
	import org.junit.jupiter.api.AfterEach;
	import org.junit.jupiter.api.BeforeAll;
	import org.junit.jupiter.api.BeforeEach;
	import org.junit.jupiter.api.Test;

import com.qa.peertesting.Factor;

public class FactorTest {



		@BeforeAll
		static void testStart() {
		System.out.println("Starting Test suite!");
		}
		@BeforeEach
		void testStarteach() {
		System.out.println("Starting the test");
		}
		
		@Test
		void testfactors() {
			// create a calculator object
			Factor f = new Factor();
			//test the functionality
			int actual = f.Factors1(720);
			// value to check against, check if true
			int expected = 1;
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

