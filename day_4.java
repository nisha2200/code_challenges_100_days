//WAP to find the largest numbers of the three numbers
package code_challenges_100_days;

import java.util.Scanner;

public class day_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1 = ");
        int num1 = sc.nextInt();
        System.out.println("Enter num2 = ");
        int num2 = sc.nextInt();
        System.out.println("Enter num3 = ");
        int num3 = sc.nextInt();
        if (num1 > num2 && num1 > num3) {
            System.out.println(num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2);
        } else if (num3 > num2 && num3 > num1) {
            System.out.println(num3);
        }
    }
}
