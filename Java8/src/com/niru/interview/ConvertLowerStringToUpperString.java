package com.niru.interview;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class ConvertLowerStringToUpperString {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("a", "b", " c", null, "b", "o");

        strings.stream()
                .filter(Objects::nonNull)
                .map(String::toUpperCase)
                .forEach(System.out::println);

        Optional.ofNullable(getUserName())
                .map(String::toUpperCase)
                .ifPresent(System.out::println);

    }

    public static String getUserName() {
        return "maxi";
    }

    public static String getUserDetails() {
        return null;
    }
}
