package com.interview.attended;

public class PrintSubSequentLettersLength {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,7,8,10,11,13};
        printSubSequentLettersLength(arr);
    }

    private static void printSubSequentLettersLength(int[] arr) {

        int sequenceLength = 1;
        for(int i = 1; i < arr.length; i++){

            if(arr[i] == arr[i - 1] + 1){    // 2 == 1 + 1
                sequenceLength ++;
            } else {
                System.out.println("Sequence Length: " + sequenceLength);
                sequenceLength = 1;
            }
        }
        System.out.println("Last Element Length: " + sequenceLength);
    }
}
