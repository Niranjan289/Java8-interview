package com.niru.interview;

import java.util.HashSet;

/*Implement a function in TypeScript that finds the longest substring without repeating
    characters in a given string. For example, for the input "abcabcbb", the function should return "abc"*/
public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {
        System.out.println(getUniqueLargestString("1231abcdeftabbhha"));
    }
    public static String getUniqueLargestString(String s){

        int l = 0, st = 0 , m = 0;
        HashSet<Character> characterSet = new HashSet<>();

        for (int r = 0; r < s.length(); r++) {
            while(characterSet.contains(s.charAt(r))){
                characterSet.remove(s.charAt(l));
                l ++;
            }
            characterSet.add(s.charAt(r));
            if(r - l + 1 >m){
                m = r-l+1;
                st = l;
            }
        }
        return s.substring(st, st + m);
    }
}
