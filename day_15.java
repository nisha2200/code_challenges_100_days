package code_challenges_100_days;

import java.util.Arrays;

//WAP to find the second-largest number in an array
public class day_15 {
    public static int findSecondNumber(int []arr) throws IllegalAccessException {
        if (arr==null|| arr.length<2){
            throw new IllegalAccessException("Array must have at least two elements.");
        }
        Arrays.sort(arr);
        int n = arr.length;
//        find the second largest by checking from the end
        for (int i = n-2; i >=0; i--) {
            if (arr[i]!=arr[n-1]){
                return arr[i];
            }
        }
        throw  new IllegalAccessException("No second largest element found.");
    }
    public static void main(String[] args) throws IllegalAccessException {
        int[] arr ={34,87,4,90,3,6,33};
        System.out.println("Second largest element: "+findSecondNumber(arr));

    }
}
