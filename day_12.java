package code_challenges_100_days;

import java.util.Arrays;
import java.util.Scanner;

//WAP to reverse an array
public class day_12 {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 8, 6, 7};
        int i = 0, j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
