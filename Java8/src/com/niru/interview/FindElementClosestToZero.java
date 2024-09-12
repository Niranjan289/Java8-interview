package com.niru.interview;

public class FindElementClosestToZero {
    public static void main(String[] args) {
        int[] arr = {3, -2, 5, -6, 7, -1, -4, 2};
        System.out.println(findElementClosestToZero(arr));
    }

    private static int findElementClosestToZero(int[] arr) {

        int closest = arr[0];

        for(int i = 1; i < arr.length; i++){
            int current = arr[i];
            if(Math.abs(current) < Math.abs(closest) || (Math.abs(current) == Math.abs(closest) && current > closest)){
                closest = current;
            }
        }

        return closest;
    }
}
