package com.collection;

import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashTest2 {
    public static void main(String[] args) {
        //Map<String, Integer> hashMap = new HashMap<>(); // single thread level tricky fail fast - manipulating while iterating it.
        Map<String, Integer> hashMap = new ConcurrentHashMap<>();
        hashMap.put("first",1);
        hashMap.put("two",2);
        hashMap.put("three",3);

        Iterator<Map.Entry<String, Integer>> iterator = hashMap.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Integer> entry = iterator.next();
            if(entry.getKey().equals("two")){
                hashMap.put("four",4);
            }
        }

        System.out.println(hashMap);

    }
}
