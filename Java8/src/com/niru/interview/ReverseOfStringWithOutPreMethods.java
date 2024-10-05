package com.niru.interview;

public class ReverseOfStringWithOutPreMethods {
    public static void main(String[] args) {
        String str = "Niranjan";

        for(int i = str.length() - 1; i >= 0; i--){
           // System.out.print(str.charAt(i));
        }

        char[] chars = str.toCharArray();
        int start = 0;
        int end = chars.length - 1;

        while (start < end){
            chars[start] ^= chars[end];
            chars[end] ^= chars[start];
            chars[start] ^= chars[end];

            start ++;
            end --;
        }

        str = new String(chars);
        System.out.println(str);
    }
}
