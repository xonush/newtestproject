package java_collections;

import java.util.*;

public class WordFrequencyCounter {

    public static void main(String[] args) {
        // Input paragraph
        String paragraph = "Java is a programming language. Java is used for developing various applications. " +
                "Java is widely used in web development and enterprise applications.";

        // Calculate and display word frequencies
        Map<String, Integer> wordFrequencyMap = new HashMap<>();

        String[] wordsArray = paragraph.split(" ");


        for(String word : wordsArray) {
            word = word.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

            if(!wordFrequencyMap.containsKey(word)) {
                wordFrequencyMap.put(word, 1);
            } else {
                wordFrequencyMap.put(word, wordFrequencyMap.get(word) + 1);
            }
        }


        System.out.println(wordFrequencyMap);


    }
}
