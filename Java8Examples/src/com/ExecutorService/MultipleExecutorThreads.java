package com.ExecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultipleExecutorThreads {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        executorService.execute(new Task3(1));
        executorService.execute(new Task3(2));
        executorService.execute(new Task3(3));
        executorService.execute(new Task3(4));

        executorService.shutdown();
    }
}
