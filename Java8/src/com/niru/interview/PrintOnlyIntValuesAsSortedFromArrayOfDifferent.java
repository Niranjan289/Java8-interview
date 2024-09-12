package com.niru.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PrintOnlyIntValuesAsSortedFromArrayOfDifferent {
    //input : ["1","3","7abc","4","2","xyz8", "5"]
    //output : [1,2,3,4,5]

    public static void main(String[] args) {
        // Input list of strings
        List<String> input = List.of("1", "3", "7abc", "4", "2", "xyz8", "5");

        // List to store the valid numbers
        List<Integer> numbers = new ArrayList<>();

        // Process each string in the input list
        for (String s : input) {
            // Try to parse the string as an integer
            try {
                int num = Integer.parseInt(s);
                numbers.add(num); // Add valid number to the list
            } catch (NumberFormatException e) {
                // If parsing fails, it means the string is not a valid integer
                // Do nothing and continue to the next string
            }
        }

        // Sort the list of numbers
        Collections.sort(numbers);

        // Print the sorted list
        System.out.println(numbers);
    }
}
