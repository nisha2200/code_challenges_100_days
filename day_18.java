package code_challenges_100_days;

import java.util.Scanner;

//WAP to remove vowels from a string
public class day_18 {
    public  static  String removeVowels(String str){
        return  str.replaceAll("[AEIOUaeiou]", "");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();
        String result = removeVowels(input);
        System.out.println("String after removing vowels: "+result);
    }
}
