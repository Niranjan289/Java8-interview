package com.niru.interview;


import java.util.Arrays;
import java.util.List;

public class FindMinAndMax {
    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(2, 3, 5, 9, 6, 7, 1);
        Integer integer = integers.stream().min((i, j) -> i.compareTo(j)).get();
        System.out.println(integer);

        Integer integer1 = integers.stream().max((i,j)-> i.compareTo(j)).get();
        System.out.println(integer1);
    }

}
