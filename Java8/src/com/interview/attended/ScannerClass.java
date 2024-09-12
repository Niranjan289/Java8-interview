package com.interview.attended;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter string: ");
        String str = scanner.nextLine();

        String temp="";

        for (int i = 0; i <= str.length() - 1; i++){
            temp = str.charAt(i) + temp;
        }

        System.out.println(temp);
    }
}
