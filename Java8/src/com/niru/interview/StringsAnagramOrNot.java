package com.niru.interview;

import java.util.Arrays;

public class StringsAnagramOrNot {

    public static void main(String[] args) {

        if(areAnagram("Race", "Care")){
            System.out.println("Strings are anargrams");
        } else {
            System.out.println("String are not anargrams");
        }
    }


    public static boolean areAnagram(String str, String str2){

        str = str.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s","").toLowerCase();

        if(str.length() != str2.length()){
            return false;
        }

        char[] chars1 = str.toCharArray();
        char[] chars = str2.toCharArray();

        Arrays.sort(chars);
        Arrays.sort(chars1);

        return Arrays.equals(chars1, chars);
    }
}
