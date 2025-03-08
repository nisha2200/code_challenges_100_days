package code_challenges_100_days;

import java.util.Scanner;
//Wap to reverse a number
public class day_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int reverse = 0;
        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }
        System.out.println(STR."Reversed number: \{reverse}");
    }
}