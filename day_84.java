package code_challenges_100_days;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

//Use predicate to filter a list of integers
public class day_84 {
    public static void main(String[] args) {
//        sample list of integers
        List<Integer> numbers = Arrays.asList(10,20,3,43,50,60,7,80,90);
//        predicate to filter even numbers
        Predicate<Integer> isEven = num-> num%2==0;
//                Filtering the list using the predicate
        List<Integer> evenNumbers = numbers.stream().filter(isEven).toList();

//        Display the filtering numbers
        System.out.println("Original numbers: "+numbers);
        System.out.println("Filtered even numbers "+evenNumbers);
    }
}
