package com.niru.interview;

import java.util.ArrayList;
import java.util.List;

public class PrintSequenceNumberRangeIfNotPrintNumber {
    /*
    * example: Input --1, 2, 3, 6, 7, 8, 10, 15, 16,17 ,20
        output --1-3,6-8,10,15-17,20
    *
    * */
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 6, 7, 8, 10, 15, 16,17 ,20};
        System.out.println(printRange(array));
    }

    public static String printRange(int[] n){

        List<String> stringList = new ArrayList<>();

        int start = n[0];  // 1
        int end = n[0];    // 1       s = 1  e = 3

        for(int i = 1; i < n.length; i++){
            if(n[i] == end + 1){
                end = n[i];
            } else {
                if(start == end){
                    stringList.add(String.valueOf(start));
                } else {
                    stringList.add(start + " - " + end);
                }
                start = n[i];
                end = n[i];
            }
        }

        if(start == end){
            stringList.add(String.valueOf(start));
        } else {
            stringList.add(start + " - " + end);
        }

        return String.join(",",stringList);
    }

}
