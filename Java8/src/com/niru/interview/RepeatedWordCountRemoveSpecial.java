package com.niru.interview;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RepeatedWordCountRemoveSpecial {
    public static void main(String[] args) {
        String str = "Practice makes perfect1! practice@ only1 give more power. 1Perfect1 is the best out.";

        // Convert the string to lowercase and split by non-word characters (removes punctuation)
        Map<String, Long> wordCount = Arrays.stream(str.toLowerCase().split("\\W+"))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Arrays.stream(str.toLowerCase().replaceAll("[^a-zA-Z\\s]", "").split("\\s+"))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        // Print the result
        wordCount.forEach((word, count) -> System.out.println(word + " - " + count));
    }
}
