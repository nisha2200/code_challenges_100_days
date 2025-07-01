package code_challenges_100_days;

import java.io.File;

//Create a program that checks if a file exists or not using File.
public class day_56 {
    public static void main(String[] args) {
//        specify the file name or path
        File file = new File("example.txt");
//        check if the file exists
        if (file.exists()){
            System.out.println(STR."file exists: \{file.getAbsolutePath()}");
        }else {
            System.out.println("file does not exist.");
        }
    }
}
