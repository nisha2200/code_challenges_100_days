package code_challenges_100_days;

import java.util.Arrays;
import java.util.Scanner;

//WAP to sort an array using bubble sort algorithm
public class day_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements present in an array: ");
        int n = sc.nextInt();
        int []arr = new int[n];
            System.out.println("Enter "+ n+" elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("Sorted array using bubble sort: ");
        System.out.println(Arrays.toString(arr));
    }
}
