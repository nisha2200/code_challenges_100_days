package code_challenges_100_days;

import java.util.Map;
import java.util.Scanner;

//WAP to count occuurences of each character in a string
public class day_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();
//        Convert string to lowercase
        input = input.toLowerCase();
//        Create an array to store character frequencies (for 256 ASCII character)
        int[] charCounts = new int[256];
//        Count occurrences of each character
        for (int i = 0; i < input.length(); i++) {
            charCounts[input.charAt(i)]++;
        }
//        Display the character frequencies
        System.out.println("Character occurrence");
        for (int i = 0; i < 256; i++) {
            if (charCounts[i] > 0) {
                System.out.println((char) i + ": " + charCounts[i]);
            }
        }
    }
}