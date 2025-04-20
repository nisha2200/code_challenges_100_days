package code_challenges_100_days;

import java.util.Scanner;

//WAP to check if a number is a perfect number
public class day_30 {
        public static  boolean isPerfectNumber(int num){
            if (num<=1)
                return false;
            int sum = 0;
            for (int i = 1; i < num; i++) {
                if (num%i==0){
                    sum+=i;
                }
            }
                return sum == num;
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        input from user
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        if (isPerfectNumber(number)){
            System.out.println(number+" is a perfect number");
        }else {
            System.out.println(number+" is not a perfect number");
        }
    }
}
