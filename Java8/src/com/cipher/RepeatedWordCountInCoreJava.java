package com.cipher;

import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class RepeatedWordCountInCoreJava {

    public static void main(String[] args) {

        String str = "This is my team. This is unique. this will create new thing.";
        String[] s = str.toLowerCase().split(" ");

        Map<String, Integer> map = new HashMap<>();

        for(String word : s){
            map.put(word, map.getOrDefault(word, 0)+1);
        }

        for(Map.Entry<String, Integer> entry : map.entrySet()){
            if(entry.getValue() > 1){
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }

        String name = "niranjan";
        char[] chars = name.toLowerCase().toCharArray();

        Map<Character, Integer> charMap = new HashMap<>();

        for (char c : chars){
            charMap.put(c, charMap.getOrDefault(c, 0) + 1);
        }

        Set<Map.Entry<Character, Integer>> entries = charMap.entrySet();

        for(Map.Entry<Character, Integer> entry : entries){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        //System.out.println(charMap);

    }



}
