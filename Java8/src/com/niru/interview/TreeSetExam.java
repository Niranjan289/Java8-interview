package com.niru.interview;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExam {
    public static void main(String[] args) {
        Set<Object> obj = new TreeSet<Object>();
        obj.add(1);
        obj.add(3);
        obj.add("Test");
        obj.add(2);

        System.out.println(obj);
    }
}
