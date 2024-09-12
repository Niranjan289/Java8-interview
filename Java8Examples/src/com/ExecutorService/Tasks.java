package com.ExecutorService;

public class Tasks extends Thread{

    @Override
    public void run() {
        System.out.println("Task1 Started..");

        for(int i = 100; i <= 110; i++)
            System.out.print(i + " ");
        System.out.println();
        System.out.println("Task1 Ended..!");
    }
}

