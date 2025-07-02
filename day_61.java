package code_challenges_100_days;

import java.util.ArrayList;

//Create a program using Arraylist to store and display a list of names.
public class day_61 {
    public static void main(String[] args) {
//        create an arraylist to store names
        ArrayList<String> names  = new ArrayList<>();
        names.add("nisha");
        names.add("ishan");
        names.add("virat");
        names.add("Silaniya");
        names.add("taniya");
        System.out.println("list of names. ");
        for (String name:names){
            System.out.println(name);
        }
    }
}
