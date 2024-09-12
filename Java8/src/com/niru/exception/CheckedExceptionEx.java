package com.niru.exception;

public class CheckedExceptionEx {
    /*
    * The exceptions which are checked by compiler for smooth execution of program at runtime,
    * whether the programmer handling or not such type of exceptions are called as "Checked Exceptions"
    * */

    public static void main(String[] args) {
        System.out.println("Will Sleep some time..!");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
