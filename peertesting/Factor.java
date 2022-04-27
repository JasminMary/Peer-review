package com.qa.peertesting;

public class Factor {

		public int Factors1 (int x) {
			
			int i;
			
			for (i = 1; i <= x; i++) {
				
				if (x%i==0) {
					x=x/i;
					System.out.println("The current x value is: " + x +" The current i value: " + i);
				} 
				else {
					System.out.println("Number is not a factorial");
					x = 0;
				}
				
			}
			return x;
			
					
				
			}
				
	}


