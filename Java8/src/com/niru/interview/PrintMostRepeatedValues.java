package com.niru.interview;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class PrintMostRepeatedValues {

    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,5,5,6,6,6,7,6,6};
        System.out.println(findRepeatedValue(num));
    }

    public static int findRepeatedValue(int[] n){

       return Arrays.stream(n).boxed()
                .collect(Collectors.groupingBy(i->i, Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .get()
                .getKey();
    }
}
