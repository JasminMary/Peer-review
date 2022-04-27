package com.qa.peertesting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Doggo {


	public  String placement(int x) {

		List<Integer> dogs = new ArrayList<Integer>();

		for (int i = 1; i <= 100; i++) {
			if (x != i) {
				dogs.add(i);
				if (i % 10 == 1 && i !=11) {
					System.out.println(i + "st");
				} else if (i % 10 == 2 && i !=12) {
					System.out.println(i + "nd");
				} else if (i % 10 == 3 && i !=13) {
					System.out.println(i + "rd");
				} else {
					System.out.println(i + "th");
				}

			}
			
		}
		String str = dogs.toString();
		return str;
	}

}
