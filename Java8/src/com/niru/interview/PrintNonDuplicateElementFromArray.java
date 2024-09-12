package com.niru.interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PrintNonDuplicateElementFromArray {

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 3, 4, 7, 7, 8, 8};

        Arrays.stream(arr).boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(i-> i.getValue() == 1)
                .map(Map.Entry::getKey)
                .forEach(System.out::println);
    }
}
