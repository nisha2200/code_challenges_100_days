package code_challenges_100_days;

import java.util.LinkedList;

//Demonstrate how to use Linkedlist to add and remove elements.
public class day_62 {
    public static void main(String[] args) {
//        create  a linkedlist of strings
        LinkedList<String> cities = new LinkedList<>();
//        add elements to the linkedlist
        cities.add("delhi");
        cities.add("mumbai");
        cities.add("bhopal");
        cities.add("patna");
        cities.add("bihar");
//        display the linkedlist
        System.out.println("Initial list: " + cities);
//        add element at the beginning
        cities.addFirst("Bangalore");
//        add element at the end
        cities.addLast("pune");
        System.out.println("after adding elements: " + cities);
//        remove first element
        cities.removeFirst();
        cities.removeLast();
        cities.remove("mumbai");
        System.out.println("After removing elements. " + cities);
    }
}
