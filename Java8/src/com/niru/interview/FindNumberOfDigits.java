package com.niru.interview;

import java.util.Scanner;

public class FindNumberOfDigits {
    public static void main(String[] args) {
        int n, a=0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter digit: ");
        int k = scanner.nextInt();
        n = k;

        while (n>0){
            n = n/10;
            a++;
        }
        System.out.println("Number of digits exist in given number: " +a);
    }

}
