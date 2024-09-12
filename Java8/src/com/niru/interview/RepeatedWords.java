package com.niru.interview;

import java.util.HashMap;
import java.util.Map;

public class RepeatedWords {
    public static void main(String[] args) {
        String text = "This is the place. Where is the item. This is not going to last long";

        // Convert the text to lowercase to ensure case insensitivity
        text = text.toLowerCase();

        // Remove punctuation (if any) from the string
       // text = text.replaceAll("[^a-zA-Z ]", "");

        // Split the text into words
        String[] words = text.split(" ");

        // Create a map to store word counts
        Map<String, Integer> wordCount = new HashMap<>();

        // Iterate through each word in the array
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        // Print words that have a count more than 1
        System.out.println("Repeated words with count more than 1:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }
}

