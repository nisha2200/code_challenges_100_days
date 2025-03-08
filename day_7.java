//WAP to find the factorial of a number using recursion.
package code_challenges_100_days;

import java.util.Scanner;

public class day_7 {
    static long factorial(int n){
        if (n==0|| n==1)
            return 1;
        return n*factorial(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        if (num<0){
            System.out.println("Factorial is not defined for negative numbers.");
        }else {
            System.out.println("Factorial of "+ num+ " is: "+factorial(num));
        }

    }
}