package code_challenges_100_days;

import java.util.Scanner;

//Write a recursive function to reverse a string
public class day_36 {
    public  static  String reverse(String str){
//        base case : empty or single character string

        if (str.isEmpty()){
            return str;
        }
//        recursive case: reverse substring and append first char at the end
        return reverse(str.substring(1))+str.charAt(0);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        String input = sc.nextLine();
        String reversed = reverse(input);
        System.out.println("Reversed string: "+reversed);
    }
}
