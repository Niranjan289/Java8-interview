package com.interview.attended;

public class RemoveDuplicatesWithUsingAnyMethods {

    public static void main(String[] args) {
        int[] array = {1,1,2,2,3,3,4,5,5};
        int[] ints = removeDuplicates(array);

        for (int i : ints){
            System.out.print(i + " ");
        }
    }

    public static int[] removeDuplicates(int[] a){
        int len = a.length;

        int[] temp = new int[len];
        int j = 0;

        for(int i = 0; i < len-1; i++){
            if(a[i] != a[i+1]){
                temp[j++] = a[i];
            }
        }

        temp[j++] = a[len - 1];

        int[] unique = new int[j];
        for(int i=0;i<j;i++){
            unique[i]=temp[i];
        }

        return unique;
    }
}
