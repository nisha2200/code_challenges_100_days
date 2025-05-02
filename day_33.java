package code_challenges_100_days;
//Write a  recursive function to calculate the power of a number.

import java.util.Scanner;

public class day_33 {
    public static int power(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else {
            return base * power(base, exponent - 1); //recursive call
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter base ");
        int base = sc.nextInt();
        System.out.println("enter exponent ");
        int exponent = sc.nextInt();
        System.out.println(base + "^" + exponent + " = " + power(base, exponent));
    }
}