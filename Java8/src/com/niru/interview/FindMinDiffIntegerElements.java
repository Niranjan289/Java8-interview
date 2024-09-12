package com.niru.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindMinDiffIntegerElements {
    public static void main(String[] args) {
        int[] a = {2,6,8,12,63,-14,-16,16};
        findMinAbsoluteDiffElements(a);
    }

    private static void findMinAbsoluteDiffElements(int[] arr) {

        // Step 1: Sort the array
        Arrays.sort(arr);

        // Step 2: Initialize the minimum difference to a large value
        int minDiff = Integer.MAX_VALUE;

        // Step 3: Find the minimum difference
        for (int i = 1; i < arr.length; i++) {
            int diff = arr[i] - arr[i - 1];
            if (diff < minDiff) {
                minDiff = diff;
            }
        }

        // Step 4: Collect and print all pairs with the minimum difference
        List<int[]> result = new ArrayList<>();
        for (int i = 1; i < arr.length; i++) {
            int diff = arr[i] - arr[i - 1];
            if (diff == minDiff) {
                result.add(new int[]{arr[i - 1], arr[i]});
            }
        }

        // Print the result pairs in ascending order
        for (int[] pair : result) {
            System.out.println(pair[0] + " " + pair[1]);
        }
    }
}
