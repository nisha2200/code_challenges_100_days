package code_challenges_100_days;

import java.util.Arrays;
import java.util.List;

//Use lambda to iterate through a list of numbers.
public class day_82 {
    public static void main(String[] args) {
//        create a list of numbers
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40);
//        use lambda expression with forEach() to iterate
        numbers.forEach(number ->
                System.out.println("Number: " + number));
    }
}
