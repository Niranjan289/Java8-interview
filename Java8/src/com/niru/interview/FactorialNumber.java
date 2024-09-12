package com.niru.interview;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class FactorialNumber {
    public static void main(String[] args) {
        System.out.println(findFactorialValue(5));

        int n = 5;
        //AtomicInteger fact = new AtomicInteger(1);

        int reduce = IntStream.rangeClosed(1, n)
                .reduce(1, (a, b) -> a * b);

        System.out.println(reduce);
    }

    public static int findFactorialValue(int n){
        int fact = 1;
        for(int i = 1; i <= n ; i++){
            fact = fact * i;
        }
        return fact;
    }
}
