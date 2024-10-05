package com.interview.attended;

import java.util.Arrays;
import java.util.Collections;

public class SortingWithoutUsingMethods {
    public static void main(String[] args) {
        int[] array = {2, 5, 3, 6, 1, 8, 4, 7};
        sortArray(array);
        for(int i : array){
            System.out.print(i + " ");
        }

    }

    public static void sortArray(int[] a){

        for(int i = 0; i < a.length - 1; i++){
            int value = i;
            for (int j = i + 1; j < a.length; j++){
                if(a[j] < a[value]){
                    value = j;
                }
            }

            int temp = a[i];
            a[i] = a[value];
            a[value] = temp;
        }
    }
}
