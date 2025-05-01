package code_challenges_100_days;

import java.util.Scanner;

//WAP to print an inverted half pyramid
public class day_26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows = sc.nextInt();
//        loop for rows
        for (int i = rows; i >= 1; i--) {
//            print  stars for each rows
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
