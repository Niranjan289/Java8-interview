package com.niru.interview;

public class FindSecondLargestValue {

    public static int findSecondLargestValue(int[] num){

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int a : num) {
            if(a > largest) {
                secondLargest = largest;
                largest = a;
            } else if(a > secondLargest && a < largest) {
                secondLargest = a;
            }

        }
        return secondLargest;
    }

    public static void main(String[] args) {
        int[] a = {2,3,5,1,6,7,10,8};
        int secondLargeValue = findSecondLargestValue(a);
        System.out.println(secondLargeValue);
    }
}

/*
public class FindSecondLargestValue {
    public static int findSecondLargest(int[] array) {
        if (array == null || array.length < 2) {
            throw new IllegalArgumentException("Array must have at least two elements.");
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : array) {
            if (num > largest) {
                secondLargest = largest; // Update second largest
                largest = num; // Update largest
            } else if (num > secondLargest && num < largest) {
                secondLargest = num; // Update second largest
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Array must have at least two distinct elements.");
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        int[] array = {2,3,5,1,6,7,10,8};
        try {
            int secondLargest = findSecondLargest(array);
            System.out.println("The second largest number is: " + secondLargest);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}*/

