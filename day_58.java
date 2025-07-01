package code_challenges_100_days;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//Count the number of words , lines and characters in a given text file.
public class day_58 {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\nisha\\IdeaProjects\\java30\\.idea\\example.txt";
//        replace with your file name/path
        int wordCount = 0;
        int lineCount = 0;
        int charCount = 0;
        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            String line;
            while((line = reader.readLine())!= null){
                lineCount++;
                charCount+= line.length();
//                characters in the line (executing newline)
//                splitting line into words using whitespace as delimiter
                String[] words = line.trim().split("\\s");
//                count non-empty lines
                if (!line.trim().isEmpty()){
                    wordCount+= words.length;
                }
            }
            System.out.println("lines: "+lineCount);
            System.out.println("Words: "+wordCount);
            System.out.println("Characters: "+charCount);
        }catch (IOException e){
            System.out.println("An error occurred: "+e.getMessage());
        }
    }
}