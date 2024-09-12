package com.predicates;

import java.util.function.Predicate;

public class PredicateTest {
	
	public static void main(String[] args) {
		
		Predicate<Integer> predit = i->i<50;
		Predicate<String> pre = s->s.length()>5;
		
		System.out.println(predit.test(50));
		System.out.println(pre.test("ManiRaj"));
	}

}
