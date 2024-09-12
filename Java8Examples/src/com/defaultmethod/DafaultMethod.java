package com.defaultmethod;

interface moxi{
	default void m1() {
		System.out.println("Default Method -- Moxi Interface");
	}
}

public class DafaultMethod implements moxi {
	
	public static void main(String[] args) {
		DafaultMethod d = new DafaultMethod();
		d.m1();
	}
	
	public void m1() {
		System.out.println("DafaultMethod -- M1");
	}
	
}
