package code_challenges_100_days;
//Count the frequency of words in a sentence using hashmaps
import java.util.HashMap;
import java.util.Scanner;

public class day_66 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input sentence
        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();

        // Split sentence into words
        String[] words = sentence.split("\\s+");

        // Create a HashMap to store word frequencies
        HashMap<String, Integer> wordFrequency = new HashMap<>();

        // Count frequencies
        for (String word : words) {
            // Convert to lowercase for case-insensitive counting (optional)
            word = word.toLowerCase();

            // Remove punctuation from words (optional)
            word = word.replaceAll("[^a-zA-Z]", "");

            // Update frequency in HashMap
            if (!word.isEmpty()) {  // Skip empty words after punctuation removal
                wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
            }
        }

        // Display word frequencies
        System.out.println("\nWord Frequencies:");
        for (String word : wordFrequency.keySet()) {
            System.out.println(word + " : " + wordFrequency.get(word));
        }

        scanner.close();
    }

}
