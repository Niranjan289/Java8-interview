package com.interview.attended;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RepeatingCharacters {
    public static String getRepeatingCharacters(String input) {
        Set<Character> repeatingChars = new LinkedHashSet<>();
        Set<Character> seen = new HashSet<>();

        // Iterate over the string to find repeating characters
        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);
            if (seen.contains(current)) {
                repeatingChars.add(current); // If already seen, it's repeating
            } else {
                seen.add(current); // Mark the character as seen
            }
        }

        // Build the result string with commas separating the repeating characters
        StringBuilder result = new StringBuilder();
        for (char ch : repeatingChars) {
            if (result.length() > 0) {
                result.append(",");
            }
            result.append(ch);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String input = "abbjfkkloooidd";
        String output = getRepeatingCharacters(input);
        System.out.println(output);  // Expected output: b,k,o,d
    }
}