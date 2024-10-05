package com.interview.attended;

public class Task2 implements Runnable {
    @Override
    public void run() {
        for(int i = 101; i<=110;i++){
            System.out.print(i + " ");
        }
        System.out.println("\n Task2 Done..!");
    }
}
