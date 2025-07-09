package code_challenges_100_days;

import java.util.Arrays;
import java.util.List;

//Count even numbers in a list using Stream and lambda.
public class day_89 {
    public static void main(String[] args) {
//        sample list of integers
        List<Integer> numbers = Arrays.asList(10,21,3,4,54,60,70,30,54,7,755,7,50);
//        count even numbers using stream and lambda
        long evenCount = numbers.stream().filter(n->n%2==0).count();
//        count then
        System.out.println("Count of even numbers: "+evenCount);
    }
}
