package com.niru.interview;

import java.util.Scanner;

public class ReverseOfInteger {
    public static void main(String[] args) {
        int rev=0, r, k;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter integer value..");
        int n = scanner.nextInt();
        k = n;
        while (n>0){
            r = n%10;
            rev = rev * 10 + r;
            n= n/10;
        }

        System.out.println(rev);

    }
}
