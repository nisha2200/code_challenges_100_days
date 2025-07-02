package code_challenges_100_days;

import java.util.Hashtable;

//Demonstrate the use of hashmap to store key-value pairs and retrieve values.
public class day_65 {
    public static void main(String[] args) {
//        create a hashtable
        Hashtable< String , String> capitalCities = new Hashtable<>();
//        store key values pairs
        capitalCities.put("India","New Delhi");
        capitalCities.put("Japan","Tokyo");
        capitalCities.put("usa","Washington D.C");
        capitalCities.put("UK","London");
//        retrieve a value using its ke
        String capitalofInida = capitalCities .get("India");
        System.out.println("capital of india: "+ capitalofInida);
//        display all key-value pairs
        System.out.println("All countries and their capitals. ");
        for (String country : capitalCities.keySet()){
            System.out.println(country+" -> "+capitalCities.get(country));
        }
    }
}
