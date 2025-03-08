package code_challenges_100_days;

import java.util.Arrays;
import java.util.Scanner;

//WAP to remove duplicate elements from an array
public class day_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter "+ n+" elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }
//        sorting the array
        Arrays.sort(arr);
//        Removing duplicates
        int [] temp = new int[n];
        int j = 0;
        for (int i = 0; i < n-1; i++) {
            if (arr[i]!= arr[i+1]){
                temp[j++] = arr[i];
            }
        }
        temp[j++]=arr[n-1]; // add the last element
        System.out.println("Array after removing duplicates: ");
        for (int i = 0; i < j; i++) {
            System.out.println(temp[i]+ " ");
        }
    }
}
