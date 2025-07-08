package code_challenges_100_days;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

//Use functions to convert strings to uppercase.
public class day_85 {
    public static void main(String[] args) {
//     simple list of strings
        List<String> names = Arrays.asList("alice","nisha","bob","nike");
//        function to convert string to uppercase
        Function<String , String> toUpperCase = String::toUpperCase;
//        Convert all strings to uppercase using map() and collect them into a new list
        List<String> upperCaeNames = names.stream().map(toUpperCase).toList();
//        display results
        System.out.println("Original Names: "+names);
        System.out.println("Uppercase Names: "+upperCaeNames);
    }
}
