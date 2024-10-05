package com.cipher;

import java.util.Arrays;

public class SumOfEvens {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Calculate the sum of even numbers using Stream API
        int sumOfEvens = Arrays.stream(numbers)  // Convert the array to an IntStream
                .filter(num -> num % 2 == 0)  // Filter even numbers
                .sum();  // Sum up the filtered numbers

        // Print the result
        System.out.println("Sum of even numbers: " + sumOfEvens);
    }
}
