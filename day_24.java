package code_challenges_100_days;

import java.util.Scanner;

//WAP to print the Floyd's Triangle
public class day_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows :");
        int rows = sc.nextInt();
        int number = 1;
        System.out.println("Floyds triangle");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }
    }
}
