package com.niru.interview;

public class FibonacciExample {
    public static void main(String[] args) {
        int n = 10, first = 0, second = 1, next;
        System.out.print(first + "," + second + ",");
        for(int i = 0; i < n; i++){
            next = first + second;
            System.out.print(next + ",");
            first = second;
            second = next;
        }
    }
}
