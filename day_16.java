package code_challenges_100_days;

import java.util.Arrays;

//WAP to merge two sorted array
public class day_16 {
    public static int[] mergetwoSortedarray(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] mergedArray = new int[n1 + n2];
        int i = 0, j = 0, k = 0;
//            Merge both arrays
        while (i < n1 && j < n2) {
            if (arr1[i]<=arr2[j]){
                mergedArray[k++]= arr1[i++];
            }else {
                mergedArray[k++]=arr2[j++];
            }
        }
//        copy remaining elements from arr1
        while (i < n1) {
            mergedArray[k++]= arr1[i++];
        }
        //        copy remaining elements from arr1
        while (j<n2){
            mergedArray[k++]= arr2[j++];
        }
        return mergedArray;
    }
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {8,46,62,399};
        int[] mergedArray = mergetwoSortedarray(arr1 , arr2);
        System.out.println("Merged Sorted Array "+ Arrays.toString(mergedArray));
    }
}
