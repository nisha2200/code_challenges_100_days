//WAP to check if a number is even or odd
package code_challenges_100_days;

import java.util.Scanner;

public class day_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number = ");
        double number = sc.nextInt();
        if (number % 2 == 0) {
            System.out.println(number + " is even");
        } else {
            System.out.println(number + " is odd");
        }
    }
}
