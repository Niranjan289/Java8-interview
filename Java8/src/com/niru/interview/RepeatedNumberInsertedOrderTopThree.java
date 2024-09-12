package com.niru.interview;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RepeatedNumberInsertedOrderTopThree {
    public static void main(String[] args) {
        /*Given an array of size N with repeated numbers, you have to find the top three repeated numbers.
            Note: If number comes same number of times then our output is one who comes first in array.
            Examples:
    Input: arr[] = {3,4,2,3,15,3,16,16,15,15,16,2,3}
    Output: 3 16 15*/

        int arr[] = {3,4,2,3,16,3,15,16,15,15,16,2,3};
        Arrays.stream(arr).boxed()
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(3)
                .forEach(i -> System.out.println(i.getKey()));

    }
}
