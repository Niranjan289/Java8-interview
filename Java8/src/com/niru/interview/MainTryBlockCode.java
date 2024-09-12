package com.niru.interview;

public class MainTryBlockCode {
    public static void main(String[] args) {
        try {
            System.out.println("a method called");
            b(2,0);
        } catch (Exception e){
            System.out.println("main method: " + e.getMessage());
        }
    }

    public static void a(){
        System.out.println("a method called");
        b(2,0);
    }

    public static void b(int a, int b){
        System.out.println(a / b);
    }
}
