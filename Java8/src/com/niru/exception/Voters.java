package com.niru.exception;

import java.util.Scanner;

public class Voters {
    public static void main(String[] args) {
        int age = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter age");
        age = scanner.nextInt();

        System.out.println(checkEligibility(age));
    }

    public static String checkEligibility(int age){
        String message;
        if(age > 18){
            message =  "Eligible to Vote..!";
        } else {
            throw new NotAllowedVoteException("Not Eligible to Vote..!");
        }
        return message;
    }
}
