//WAP to check if a number is prime
package code_challenges_100_days;

import java.util.Scanner;

public class day_5 {
    public  static  boolean isPrime(int num){
        if (num<=1){
            return false;
        }
        if (num == 2 || num ==3){
            return true;
        }
        if (num%2 ==0){
            return false;
        }
        for (int i = 3; i *i<=num ; i+=2) {
            if (num%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        if (isPrime(number)){
            System.out.println(number+"is a prime number. ");
        }
        else {
            System.out.println(number+"is not a prime number");
        }
    }
}
