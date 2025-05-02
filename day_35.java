package code_challenges_100_days;

//Write a recursive function to find the sum of an array
public class day_35 {
    public static int sum(int[] arr, int n) {
//   base case if size is 0 , return 0
        if (n == 0) {
            return 0;
        }
//   recursive case add last element and recur for test
        return arr[n - 1] + sum(arr, n - 1);
    }

    public static void main(String[] args) {
        int[] numbers = {2, 3, 4, 5, 6, 7, 8, 34, 565, 65};
        int result = sum(numbers, numbers.length);
        System.out.println("sum of array: " + result);
    }
}