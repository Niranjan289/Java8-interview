package com.predicates;

import java.util.function.Predicate;

public class PredicateMethods {
	
	
	public static void main(String[] args) {
		int[] x= {1,2,3,4,5,6};
		
		Predicate<Integer> even = i->i%2 == 0;
		Predicate<Integer> pre = s->s>2;
		
		System.out.println("Printing Even Numbers");
		m1(even,x);
		
		System.out.println("Printing Odd Numbers");
		m1(even.negate(),x);
		
		System.out.println("Printing greater than 2 Numbers");
		m1(pre,x);
		
		System.out.println("Printing  Even and greater than 2 Numbers");
		m1(pre.and(even),x);
		
		System.out.println("Printing  Even or greater than 2 Numbers");
		m1(pre.or(even),x);
	}
	
	public static void m1(Predicate<Integer> p, int[] a) {
		for(Integer i:a) {
			if(p.test(i))
				System.out.println(i);
		}
		
	}
	
}
