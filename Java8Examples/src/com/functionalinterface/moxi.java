package com.functionalinterface;

interface intra{
	public void m1();
}

public class moxi {
	
	public static void main(String[] args) {
		intra i=()->System.out.println("Hello Moxi");
		i.m1();
	}
}
