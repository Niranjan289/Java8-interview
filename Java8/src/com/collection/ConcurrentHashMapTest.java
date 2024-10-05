package com.collection;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConcurrentHashMapTest {

    private static final int NUM_THREADS = 5;
    private static final int NUM_INSERTION = 100;

   // private static HashMap<String, Integer> map = new HashMap<>(); // not accurate data over multiple thread - are trying to manipulate hash map data.
    private static ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

    public static void main(String[] args) throws InterruptedException{
        ExecutorService executorService = Executors.newFixedThreadPool(NUM_THREADS);

        for (int i = 0; i < NUM_THREADS; i++){
            executorService.execute(insertRecords());
        }

        executorService.shutdown();
        if(!executorService.isTerminated()){
            Thread.sleep(2000);
        }

        System.out.println("Size of Map: " + map.size());
    }

    public static Runnable insertRecords(){
        return () -> {
            for (int i = 0; i < NUM_INSERTION; i++){
                map.put(i + Thread.currentThread().getName(), i);
            }
        };
    }
}
