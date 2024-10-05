package com.interview.attended;

import java.io.LineNumberInputStream;
import java.util.LinkedList;
import java.util.List;

public class PrintSequenceNumberRange {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,7,8,10,12,13,14};
        System.out.println(printSequenceRange(arr));
    }

    private static String printSequenceRange(int[] arr) {
        int start = arr[0], end = arr[0];
        List<String> list = new LinkedList<>();

        for(int i = 1; i < arr.length; i++){
            if(arr[i] == end + 1){
                end = arr[i];
            } else {
                if(start == end){
                    list.add(String.valueOf(start));
                } else {
                    list.add(String.valueOf(start + "-" + end));
                }
                start = arr[i];
                end = arr[i];
            }
        }

        if(start == end){
            list.add(String.valueOf(start));
        } else {
            list.add(String.valueOf(start + "-" + end));
        }

        return String.join(",", list);
    }
}
