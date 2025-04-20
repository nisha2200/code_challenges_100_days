package code_challenges_100_days;

import java.util.Scanner;
import static code_challenges_100_days.day_5.isPrime;
//WAP to generate the first N prime numbers
public class day_28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many prime numbers you want");
        int n = sc.nextInt();
        int count = 0;
        int num = 2;
        System.out.println("The first "+ n + " prime numbers are: ");
        while (count<n){
            if (isPrime(num)){
                System.out.println(num +" ");
                count++;
            }
            num++;
        }
    }
}