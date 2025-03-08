//WAP to print the fibonacci series up to N terms.
package code_challenges_100_days;

import java.util.Scanner;

public class day_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms ");
        int n = sc.nextInt();
        int first = 0, second = 2;
        System.out.println(STR."Fibonacci series up to \{n} terms");
        for (int i = 1; i <= n; i++) {
            int next = first + second;
            first = second;
            second = next;
            System.out.println(STR."\{first}, \{second} ");
        }
    }
}