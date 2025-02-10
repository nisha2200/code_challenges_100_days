//WAP to swap two numbers without using a third variable
package code_challenges_100_days;

import java.util.Scanner;

public class day_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a = ");
        int a = sc.nextInt();
        System.out.println("Enter b = ");
        int b = sc.nextInt();

        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(STR."Value of a = \{a}");
        System.out.println(STR."Value of b = \{b}");

    }
}
