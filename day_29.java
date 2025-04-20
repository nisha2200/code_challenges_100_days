package code_challenges_100_days;

import java.util.Scanner;

//WAP to check if a number is armstrong
public class day_29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        int originalNumber = number;
        int result = 0;
        int digits = String.valueOf(number).length();
        while (number!=0){
            int digit = number%10;
            result+=Math.pow(digit,digits);
            number/=10;
        }
        if (result == originalNumber){
            System.out.println(originalNumber + " is an Armstrong number: ");
        }else {
            System.out.println(originalNumber + " is not an Armstrong number");
        }
    }
}
