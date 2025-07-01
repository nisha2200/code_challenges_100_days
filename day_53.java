package code_challenges_100_days;
//Demonstrate the use of try-catch-finally block with file reading.

import java.io.*;

public class day_53 {
    public static void main(String[] args) {
        BufferedReader reader = null;
        try {
//            try to open and read the file
            File file = new File("example.txt");
            reader = new BufferedReader(new FileReader(file));
            String line;
            System.out.println("File content.");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
//            catch if file is not found
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
//            catch other IO exceptions
            System.out.println("Error reading file: " + e.getMessage());
        } finally {
//            this block always executes
            try {
                if (reader != null) {
                    reader.close();
                    System.out.println("File closed successfully ");
                }
            } catch (IOException e) {
                System.out.println("Error closing file : " + e.getMessage());
            }
        }
    }
}
