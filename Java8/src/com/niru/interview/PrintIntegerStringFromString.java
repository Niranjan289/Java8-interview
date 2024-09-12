package com.niru.interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PrintIntegerStringFromString {

    public static void main(String[] args) {
        String str = "Hell1 5ow are 6ou wor1d";

        System.out.println("Any word starting character is Integer");
        Arrays.stream(str.split(" ")).filter(s -> s != null && Character.isDigit(s.charAt(0)))
                .forEach(System.out::println);


        System.out.println("------------------");
        System.out.println("Any word contains Integer:");
        Arrays.stream(str.split(" ")).filter(word -> word.chars().anyMatch(Character::isDigit))
                .forEach(System.out::println);

        System.out.println("-----------------------");
        Map<String, Integer> map = new HashMap<>();
        map.put("sravani",1);
        map.put("sravani",2);
        System.out.println(map.get("sravani"));


        String start = "Java Sql Java Net Word";
        String moreDup = "sssssssssssssssssssssssssfffffffffffffffffereeeeeeeeeeeeertfgsfgrtjgngfjtydjgdfrfkkkkkkkkkkk";

        Arrays.stream(start.split(" ")).filter(i-> i.startsWith("J")).forEach(System.out::println);
        Arrays.stream(start.split(" ")).filter(i-> i.startsWith("S"))
                .map(m-> m.toUpperCase()).forEach(System.out::println);

        Arrays.stream(moreDup.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(v-> v.getValue() > 10)
                .forEach(k->System.out.println(k.getKey()));




    }
}
