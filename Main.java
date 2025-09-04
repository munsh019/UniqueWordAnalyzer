import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Read full input text from the user
        String text = scanner.nextLine();
        
        // Split input into sentences based on '.' 
        String[] sentences = text.split("\\.");
        String[][] textArray = new String[sentences.length][];
        
        // HashMap to store word frequencies
        HashMap<String, Integer> wordCount = new HashMap<>();
        
        // Process each sentence
        for (int i = 0; i < sentences.length; i++) {
            // Split current sentence into words (space-separated)
            String[] words = sentences[i].trim().split(" ");
            textArray[i] = words;

            // Process each word in the sentence
            for (int j = 0; j < words.length; j++) {
                // Remove punctuation and convert to lowercase
                String processed = words[j].replaceAll("[^a-zA-Z]", "").toLowerCase();

                if (!processed.isEmpty()) {
                    wordCount.put(processed, wordCount.getOrDefault(processed, 0) + 1);
                }
            }
        }

        // Calculate total word occurrences across all words
        int totalWords = 0;
        for (int count : wordCount.values()) {
            totalWords += count;
        }

        // Number of unique words is just the number of keys in the map
        int uniqueWords = wordCount.size();

        // Print overall statistics
        System.out.println("Total words: " + totalWords);
        System.out.println("Unique words: " + uniqueWords);
        System.out.println("Word statistics:");

        // Print detailed statistics for each word
        for (String word : wordCount.keySet()) {
            int count = wordCount.get(word);
            // Calculate percentage of this word relative to total word count
            double percentage = (count * 100.0) / totalWords;

            // Print word, its count, and percentage (2 decimal precision)
            System.out.println(word + ": " + count + " (" + String.format("%.2f", percentage) + "%)");
        }
    }
}