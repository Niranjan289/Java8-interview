package com.niru.interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringToCharactor {

    public static void main(String[] args) {
        String str = "Niranjan";

        char[] chars = str.toCharArray();

        List<Character> collect = str.chars().mapToObj(i -> (char) i).collect(Collectors.toList());
        Collections.reverse(collect);
        System.out.println(collect);

        String string = collect.stream().collect(StringBuilder::new,
                StringBuilder::appendCodePoint,
                StringBuilder::append).toString();
        System.out.println(string);

    }

}
