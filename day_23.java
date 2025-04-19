package code_challenges_100_days;

import java.util.Scanner;

//WAP to print the diamond pattern
public class day_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n = sc.nextInt();
//        This is the number of rows in the upper half(excluding the center)
//        upper half including middle row
        for (int i = 1; i <=n ; i++) {
//            Print spaces
            for (int j = 1; j <= n-i ; j++) {
                System.out.print(" ");
            }
//        print stars
            for (int j = 1; j <=(2*i-1) ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
//        lower half
        for (int i = n-1; i >= 1 ; i--) {
//            print spaces+
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
//            print stars
            for (int k = 1; k <= (2*i-1) ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
