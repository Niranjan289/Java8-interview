package com.interview.attended;

public class Task extends Thread{
    @Override
    public void run(){
        for(int i = 1; i < 10; i++){
            System.out.print(i + " " );
        }
        System.out.print("\n" + "Task1 done..! \n");
    }
}
