package code_challenges_100_days;

import java.io.FileWriter;
import java.io.IOException;

//WAP to write text into a file using FileWriter
public class day_55 {
    public static void main(String[] args) {
        try{
//            craete a filewriter object for the file
            FileWriter writer = new FileWriter("example.txt");
//            write text to the file
            writer.write("hello , this is a sample text written to the file");
            writer.write("This is the second line");
//            write.close();
            System.out.println("text written to file successfully");
        }catch (IOException e){
            System.out.println("an error occurred while writing to the file: "+e.getMessage());
        }
    }
}
