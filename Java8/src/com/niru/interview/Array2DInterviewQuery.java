package com.niru.interview;

import java.util.Arrays;

public class Array2DInterviewQuery {

    public static void main(String[] args) {
        int[][] array = {{1,3,6,8,5},{11,22,35,20},{36,34,39,40}};
        int target = 34;

        boolean result = calculateTargetValue(array, target);
        System.out.println(result);
    }

    private static boolean calculateTargetValue(int[][] array, int target) {
        for(int[] row : array) {
            Arrays.sort(row);
            System.out.println(Arrays.toString(row));
            if(Arrays.binarySearch(row, target) >= 0){
                return true;
            }
        }
        return false;
    }
}
