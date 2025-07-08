package code_challenges_100_days;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

//Use consumer to print all elements of a list.
public class day_86 {
    public static void main(String[] args) {
//        sample list of integers
        List<Integer> numbers = Arrays.asList(10,20,30,40,50,60,70);
//        Consumer to print an element
        Consumer printElement = num-> System.out.println(num);
//        using forEach to apply the consumer on each element
        numbers.forEach((Consumer<? super Integer>) printElement);
    }
}
