package com.niru.interview;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n= scanner.nextInt();
        if(isPalindrome(n)){
            System.out.println("is Palindrome");
        } else {
            System.out.println("Is not Palindrome.");
        }

    }

    public static boolean isPalindrome(int num){
        int reversedNumber = 0,originalNumber = num;
        while (num>0){
            int digit= num%10;
            reversedNumber = reversedNumber * 10 + digit;
            num = num / 10;
        }
        return originalNumber == reversedNumber;
    }

}
