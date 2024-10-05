package com.niru.interview;

import com.niru.dto.Order;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupingByTest {
    public static void main(String[] args) {
        List<Order> listOfOrders = getListOfOrders();
        Map<Integer, List<String>> collect = listOfOrders.stream()
                .collect(Collectors.groupingBy(order -> order.getId(), Collectors.mapping(Order::getOrderName, Collectors.toList())));
        System.out.println(collect);
        System.out.println("*********************************************");
        //Approach #1
        List<String> strings = Arrays.asList("apple", "banana", "papaya", "apple", "banana", "orange","apple");
        Map<String, Long> collect1 = strings.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect1);

        //Approach #2
        Map<String, Integer> collect2 = strings.stream().collect(Collectors.toMap(newelement -> newelement, newelement -> Collections.frequency(strings, newelement),
                (oldelement, newelement) -> oldelement));
        System.out.println(collect2);
        System.out.println("*********************************************");

        //Print repeated string value with count - descending order
        Map<String, Long> flatMap = new LinkedHashMap<>();
        collect1.entrySet().stream().sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .forEachOrdered(e->flatMap.put(e.getKey(), e.getValue()));
        System.out.println(flatMap);
        System.out.println("*********************************************");

        String[] str = {"Monkey", "Donkey", "Goat", "ox", "Goat", "Monkey"};
        List<String> animalList = Arrays.asList(str);
        Map<String, Long> aniMap = new LinkedHashMap<>();
        animalList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet()
                .stream().sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .forEachOrdered(t-> aniMap.put(t.getKey(), t.getValue()));
        System.out.println(aniMap);

        aniMap.entrySet().stream().forEach(r-> System.out.println(r.getKey()));


        animalList.stream().distinct().collect(Collectors.toList()).stream().forEach(System.out::println);

    }

    public static List<Order> getListOfOrders(){
        return Arrays.asList(new Order(1, "Iphone"), new Order(2, "Vivo"), new Order(3, "OnePlus")
        , new Order(1, "Oppo"), new Order(2, "Vivo Z1 Pro"));
    }
}
