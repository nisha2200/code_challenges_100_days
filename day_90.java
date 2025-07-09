package code_challenges_100_days;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

//Find the first non-repeated character in a string using Streams.
public class day_90 {
    public static void main(String[] args) {
        String input = "programming";
//        Count frequency of each character
        Map<Character, Long> charCountMap = input.chars().mapToObj(c->(char) c).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
//        find first character with count 1
        Optional<Character> firstNonRepeated = charCountMap.entrySet().stream().filter(entry-> entry.getValue()==1).map(Map.Entry::getKey).findFirst();
//        print result
        if (firstNonRepeated.isPresent()){
            System.out.println("First non-repeated character: "+firstNonRepeated.get());
        }else {
            System.out.println("No non-repeated character found.");
        }
    }

}
