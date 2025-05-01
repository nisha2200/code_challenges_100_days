package code_challenges_100_days;

import java.util.Scanner;

//WAP to find the sum of digits of a number
public class day_31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number  = sc.nextInt();
        int  sum = 0;
        int temp = Math.abs(number);
//        Handle negative numbers too
//        Loop to find the sum of digits
        while (temp>0){
            int digit = temp%10; //get last digit
            sum+=digit; // add digit to sum
            temp/=10; // remove last digit
        }
        System.out.println("Sum of digits: "+ sum);
    }
}
