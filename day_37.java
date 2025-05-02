package code_challenges_100_days;
//Write a recursive function to convert decimal to binary

import java.util.Scanner;

public class day_37 {
    public static String decimalToBinary(int n) {
//        base case: if n is 0 or 1 , return it as a string
        if (n == 0) {
            return "0";
        }
        if (n == 1) {
            return "1";
        }
//        recursive case: divide n by 2 and append remainder
        return decimalToBinary(n / 2) + (n % 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        String binary = decimalToBinary(number);
        System.out.println("binary of " + number + " is: " + binary);
    }
}