package com.collection;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;

public class HashSetTest {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("mani");
        set.add("moxi");
        set.add("mani");
        set.add(null);
        set.add(null);

        System.out.println(set);

    }
}
