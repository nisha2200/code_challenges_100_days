package code_challenges_100_days;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//Use scanner class to read a file and display all integers present in it.
public class day_59 {
    public static void main(String[] args) {
        try{
//          specify the file path
            File file  = new File("example.txt");
//          create scanner object to read the file
            Scanner sc = new Scanner(file);
            System.out.println("Integers found in the file: ");
//            loop through the file and print integers
            while (sc.hasNext()){
                if (sc.hasNextInt()){
                    int number = sc.nextInt();
                    System.out.println(number);
                }else {
//                    skip non-integer tokens
                    sc.next();
                }
            }

        }catch (FileNotFoundException e){
            System.out.println("File not found. please check the file path.");
            e.printStackTrace();
        }
    }
}
