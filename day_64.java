package code_challenges_100_days;

import java.util.TreeSet;

//Create a TreeSet and sort a set of strings alphabetically.
public class day_64 {
    public static void main(String[] args) {
        TreeSet<String> stringset =new TreeSet<>();
//        add strings to set
        stringset.add("catch");
        stringset.add("banana");
        stringset.add("nistisha");
        stringset.add("lemon");
        stringset.add("kittu");
//        treeSet automatically sorts elements alphabetically
        System.out.println("Strings in alphabetical order: ");
        for (String str:stringset){
            System.out.println(str);
        }
    }
}
