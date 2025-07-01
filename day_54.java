package code_challenges_100_days;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//Write a program to read data from sa file and display it on the console.
public class day_54 {
    public static void main(String[] args) {
        try {
            File file = new File("example.txt");
            Scanner sc = new Scanner(file);
            System.out.println("File content: ");
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}
