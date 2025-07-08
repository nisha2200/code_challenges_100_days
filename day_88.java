package code_challenges_100_days;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Use Stream API to filter , map, and collect data from a list.
public class day_88 {
    public static void main(String[] args) {
//        sample list of integers
        List<Integer> numbers = Arrays.asList(5,10,15,20,25,30,35,40,45,50);
//        stream API to filter , map, collect
        List<Integer> processedNumbers = (List<Integer>) numbers.stream().filter(num->num>10).map(num->num*2).toList();
//        print original and processed lists
        System.out.println("Original numbers: "+numbers);
        System.out.println("Processed Numbers: "+processedNumbers);
    }
}
