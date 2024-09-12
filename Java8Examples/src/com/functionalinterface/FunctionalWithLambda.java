package com.functionalinterface;

interface FunWithLam{
	public void sum(int a, int b);
}

public class FunctionalWithLambda {
	public static void main(String[] args) {
		FunWithLam fl = (a,b)->System.out.println(a+b);
		fl.sum(10, 10);
	}
}
