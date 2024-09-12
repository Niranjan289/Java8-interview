package com.function;

import java.util.function.Function;

public class FunctionDem {
	
	public static void main(String[] args) {
		
		Function<String, Integer> fn = s->s.length();
		
		System.out.println(fn.apply("ManiRaj"));
	}
}
