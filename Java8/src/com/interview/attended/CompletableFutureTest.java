package com.interview.attended;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureTest {
    public static void main(String[] args) {
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() ->
        {
            try {
                Thread.sleep(2000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }

            return "Completable Future executed..!";
        });

        future.thenAccept(result -> {
            System.out.println("Result: " + result);
        });

        try {
            System.out.println("Waiting for result..!");
            System.out.println("Future result: " + future.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        System.out.println("Main Thread continues executing...!");
    }
}
