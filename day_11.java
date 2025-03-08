package code_challenges_100_days;
//WAP to find the largest and smallest element in an array.

import java.util.Scanner;

public class day_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println(STR."enter\{n}elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int min = arr[0], max = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(STR."Smallest elements:\{min}");
        System.out.println(STR."Largest elements:\{max}");
    }
}
