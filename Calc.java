package com.qa.peertesting;

import java.util.ArrayList;
import java.util.List;

public class Calc {
	

	
	public String calculator(double a, double b, double c) {
		List<String> maths = new ArrayList<>();
		
		if (a * b == c) {
			maths.add(a + "*" + b + "=" + c);
		}
		if (a * c == b) {
			maths.add(a + "*" + c + "=" + b);
		}
		if (b * c == a) {
			maths.add(b + "*" + c + "=" + a);
		}
		if (a / b == c) {
			maths.add(a + "/" + b + "=" + c);
		}
		if (a / c == b) {
			maths.add(a + "/" + c + "=" + b);
		}
		if (b / c == a) {
			maths.add(b + "/" + c + "=" + a);
		}
		if (c / b == a) {
			maths.add(c + "/" + b + "=" + a);
		}
		if (c / a == b) {
			maths.add(c + "/" + a + "=" + b);
		}
		if (b / a == c) {
			maths.add(b + "/" + a + "=" + c);
		}
		if (a + b == c) {
			maths.add(a + "+" + b + "=" + c);
		}
		if (a + c == b) {
			maths.add(a + "+" + c + "=" + b);
		}
		if (b + c == a) {
			maths.add(b + "+" + c + "=" + a);
		}
		if (a - b == c) {
			maths.add(a + "-" + b + "=" + c);
		}
		if (a - c == b) {
			maths.add(a + "-" + c + "=" + b);
		}
		if (b - c == a) {
			maths.add(b + "-" + c + "=" + a);
		}
		if (c - b == a) {
			maths.add(c + "-" + b + "=" + a);
		}
		if (c - a == b) {
			maths.add(c + "-" + a + "=" + b);
		}
		if (b - a == c) {
			maths.add(b + "-" + a + "=" + c);
		} 
		if (maths.size() == 0) {
			maths.add("Doesn't work");
		}
		String str = maths.toString();
		str = str.replaceAll("[\\[\\](){}]","");
		return str;
		
	}


	
}
