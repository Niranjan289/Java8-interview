package com.ExecutorService;

public class Task2 implements Runnable {
    @Override
    public void run() {
        System.out.println("Task2 Started..");

        for(int i = 200; i <= 210; i++)
            System.out.print(i + " ");
        System.out.println();
        System.out.println("Task2 Ended..!");
    }
}
