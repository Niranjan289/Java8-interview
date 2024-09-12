package com.niru.interview;

public class TestMethodOverloading {
    void doFilter(Object o){
        System.out.println("Object");
    }
    void doFilter(String s){
        System.out.println("String");
    }

    public static void main(String[] args) {
        TestMethodOverloading testMethodOverloading = new TestMethodOverloading();
        testMethodOverloading.doFilter("main");
    }
}
