package code_challenges_100_days;

import java.util.Scanner;

//Wap to convert a string to uppercase and lowercase
public class day_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an uppercase string: ");
        String uppercaseStr = sc.nextLine();
//        Converting to lowercase
        String lowercaseStr = uppercaseStr.toLowerCase();
        System.out.println("Lowercase string: "+lowercaseStr);
    }
}