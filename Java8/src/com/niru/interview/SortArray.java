package com.niru.interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SortArray {

    public static void main(String[] args) {
        int[] array = {5,3,2,1,4,6};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        Integer[] integers = Arrays.stream(array).boxed().toArray(Integer[]::new);
        Arrays.sort(integers, Collections.reverseOrder());

        int[] ints = Arrays.stream(integers).mapToInt(Integer::intValue).toArray();
        System.out.println(Arrays.toString(ints));

        //Without using sort method...
        sortASCOrder(array);
        System.out.print("Ascending Order: ");
        for(int a : array) {
            System.out.print(a + " ");
        }

        System.out.println();
        String str = "Niranjan";
        //JDK 1.8 Streams...
        char[] chars = str.toCharArray();
        List<Character> collect = IntStream.range(0, chars.length)
                                                .mapToObj(c -> chars[c]).collect(Collectors.toList());
        Collections.reverse(collect);

        char[] chars1 = collect.stream().map(Character::charValue)
                .collect(StringBuilder::new,
                        StringBuilder::appendCodePoint,
                        StringBuilder::append)
                .toString()
                .toCharArray();
        System.out.println(Arrays.toString(chars1));

        //JDK 1.7 code..
        int length = str.length();
        for(int i = length - 1; i >= 0 ; i--) {
            System.out.print(str.charAt(i) + " ");
        }


    }

    private static void sortASCOrder(int[] array) {

        for(int i = 0; i < array.length - 1; i++){
            int intOfSmaller = i;
            for(int j = i + 1; j < array.length; j++){
                if(array[j] < array[intOfSmaller]){
                    intOfSmaller = j;
                }
            }
            int temp = array[i];
            array[i] = array[intOfSmaller];
            array[intOfSmaller] = temp;
        }
    }
}
