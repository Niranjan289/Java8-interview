package com.ExecutorService;

public class Task3 extends Thread{
    private int number;

    public Task3(int number){
        this.number = number;
    }
    @Override
    public void run() {
        System.out.println("Task3- " + number + " Stared..");

        for (int i = number * 100; i <= number * 100 + 10; i++){
            System.out.print(i + " ");
        }

        System.out.println("\n Task3- " + number + " Ended..!");
    }
}
