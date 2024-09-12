package com.niru.interview;

public class RemoveAdjacentDuplicates {

    public static String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            int len = sb.length();
            if (len > 0 && sb.charAt(len - 1) == c) {
                sb.deleteCharAt(len - 1); // Remove the last character if it's the same as the current one
            } else {
                sb.append(c); // Otherwise, add the current character to the result
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String input = "abbaca";
        String output = removeDuplicates(input);
        System.out.println(output);  // Output: "ca"
    }
}
