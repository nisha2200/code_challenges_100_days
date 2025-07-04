package code_challenges_100_days;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Use collections utility class for reversing and shuffling a list.
public class day_70 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(10);
        numbers.add(10);
        numbers.add(10);
        numbers.add(10);

        System.out.println("Original list: ");
        System.out.println(numbers);

//        Reverse the list
        Collections.reverse(numbers);
        System.out.println("Reersed list: ");
        System.out.println(numbers);

//        Shuffle the list (randomly)
        Collections.shuffle(numbers);
        System.out.println("Shuffled list ");
        System.out.println(numbers);
    }
}
