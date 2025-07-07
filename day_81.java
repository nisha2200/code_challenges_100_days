package code_challenges_100_days;

import java.util.Arrays;

//Write a lambda expression to sort an array of strings.
public class day_81 {
    public static void main(String[] args) {
        String [] names = {"john","Alice","Bob","kiran"};
//        sort the array using lambda expression
        Arrays.sort(names, String::compareTo);
        System.out.println("Sorted names: ");
        for (String name: names){
            System.out.println(name);
        }
    }
}
