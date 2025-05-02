package code_challenges_100_days;

import java.util.Scanner;

// Write a recursive function for the GCD (greatest common divisor) of two numbers
public class day_34 {
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
//        recursive call
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1 ");
        int num1 = sc.nextInt();
        System.out.println("Enter num2 ");
        int num2 = sc.nextInt();
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd(num1, num2));
    }
}