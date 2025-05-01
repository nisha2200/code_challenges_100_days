package code_challenges_100_days;

import java.util.Scanner;

//WAP to check if a number is a palindrome.
public class day_32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        input from -
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        int originalNumber = number;
        int reversedNumber = 0;
//        reverse the number
        while (number!=0){
            int digit =number%10;
            reversedNumber = reversedNumber * 10 +digit;
            number /= 10;
        }
//        check if the original number and reversed number are equal
        if (originalNumber == reversedNumber){
            System.out.println(originalNumber +" is a palindrome.");
        }
        else {
            System.out.println(originalNumber + " is not a palindrome.");
        }

    }
}
