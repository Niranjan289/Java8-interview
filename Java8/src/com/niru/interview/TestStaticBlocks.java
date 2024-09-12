package com.niru.interview;

public class TestStaticBlocks {
    static int a=10;
    static int b=20;
    static int c=30;

    TestStaticBlocks(){
        a=100;
    }

    static void m1(){
        b=200;
    }

    static{
        c=300;
    }

    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
