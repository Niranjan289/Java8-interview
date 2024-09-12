package com.niru.interview;

import java.util.Arrays;

public class RemoveDuplicatesWithCoreJava {
    public static int[] removeDuplicates(int[] arr) {
        int n = arr.length;

        // If array is empty or contains a single element
        if (n == 0 || n == 1) {
            return arr;
        }

        // Temporary array to store unique elements
        int[] temp = new int[n];
        int j = 0; // index for the temp array

        // Traverse the input array
        for (int i = 0; i < n - 1; i++) {
            // If current element is not equal to the next element
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }

        // Store the last element as it is always unique in the sorted array
        temp[j++] = arr[n - 1];

        // Create a new array with the correct size
        int[] uniqueArray = new int[j];
        for (int i = 0; i < j; i++) {
            uniqueArray[i] = temp[i];
        }

        return uniqueArray;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 4, 5, 6, 7, 7};

        // Sorting the array is necessary to compare adjacent elements
        java.util.Arrays.sort(arr);

        int[] result = removeDuplicates(arr);

        // Print the result
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
