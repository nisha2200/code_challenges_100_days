package code_challenges_100_days;

import java.util.Scanner;

//WAP to print a right-aligned triangle of numbers
public class day_27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n= sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n-i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
