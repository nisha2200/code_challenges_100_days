package code_challenges_100_days;

import java.util.Scanner;

//write a function to find the first N Fibonacci numbers using recursion
public class day_39 {
    public  static  int fibonacci (int n){
        if (n<=1){
            return n;
        }
        return fibonacci( n-1)+fibonacci(n-2);
    }
    public static  void printFibonacci(int n){
        for (int i = 0; i < n; i++) {
            System.out.println(fibonacci(i)+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter  value: ");
        int n = sc.nextInt(); // numbr of fibonacci numbers to print
        System.out.println("First "+n +" Fibonacci numbers:");
        printFibonacci(n);
    }
}
